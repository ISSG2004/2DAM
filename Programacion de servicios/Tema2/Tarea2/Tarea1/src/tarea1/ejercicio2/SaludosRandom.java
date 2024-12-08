package ejercicio2;

import java.util.Random;

public class SaludosRandom  extends Thread {
    private int repeticiones;

    public SaludosRandom(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    @Override
    public void run() {
        long tiempoInicio = System.currentTimeMillis();
        String[] saludos = {"¡Hola!", "¡Buenos días!", "¡Buenas tardes!", "¡Qué tal!"};
        Random aleatorio = new Random();

        for (int i = 0; i < repeticiones; i++) {
            String saludo = saludos[aleatorio.nextInt(saludos.length)];
            System.out.println("Saludo: " + saludo);
            try {
                Thread.sleep(1000); // Retardo de 1 segundo
            } catch (InterruptedException e) {
                System.err.println("Hilo interrumpido: " + e.getMessage());
            }
        }
        long tiempoFin = System.currentTimeMillis();
        System.out.println("Tiempo de ejecución del hilo de saludos: " + (tiempoFin - tiempoInicio) + " ms");
    }
}
