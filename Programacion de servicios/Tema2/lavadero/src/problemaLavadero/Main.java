package problemaLavadero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Crear lista de coches con datos aleatorios
        List<Coche> coches = new ArrayList<>();
        String[] tamanos = {"pequeño", "mediano", "grande"};
        String[] tiposLavado = {"normal", "extra", "super"};
        Random random = new Random();

        for (int i = 1; i <= 4; i++) {
            String nombre = "Coche" + i;
            String tamano = tamanos[random.nextInt(tamanos.length)]; //asignamos un tamaño random
            String tipoLavado = tiposLavado[random.nextInt(tiposLavado.length)];//asignamos un tipo lavado random
            coches.add(new Coche(nombre, tamano, tipoLavado));
        }

        // ordenar los coches según el tiempo de lavado
        coches.sort((c1, c2) -> Integer.compare(c2.calcularTiempoLavado(), c1.calcularTiempoLavado()));

        // Crear y almacenar los hilos en una lista
        String[] operarios = {"Operario1", "Operario2"};
        List<Thread> hilosLavado = new ArrayList<>();

        for (int i = 0; i < coches.size(); i++) {
            Lavado lavado = new Lavado(coches.get(i), operarios[i % 2]);
            hilosLavado.add(lavado);
        }

        // Lanzar los hilos
        long inicioPrograma = System.currentTimeMillis();
        for (int i = 0; i < hilosLavado.size(); i += 2) {
            //obtenemos el primer hilo de la lista
            Thread hilo1 = hilosLavado.get(i);
            //obtenemos el siguiente hilo de la lista disponible
            Thread hilo2 = (i + 1 < hilosLavado.size()) ? hilosLavado.get(i + 1) : null;
            //si los hilos no están nulos los lanzamos
            if (hilo1 != null) hilo1.start();
            if (hilo2 != null) hilo2.start();
            
            try {
                //se espera a que el hilo a comprobar termine su ejecución para lanzar el siguiente
                if (hilo1 != null) hilo1.join();
                if (hilo2 != null) hilo2.join();
            } catch (InterruptedException e) {
                System.err.println("Error al esperar hilos: " + e.getMessage());
            }
        }

        // mostramos el tiempo total de ejecución(restamos el momento en el que finalizo la ejecución al momento en el que comenzó la ejecución de los hilos)
        long finPrograma = System.currentTimeMillis();
        System.out.println("Tiempo total de lavado: " + (finPrograma - inicioPrograma) / 1000 + "s");
    }
}
