package ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero = 150045; // Número para descomponer en factores primos (100,000 < n < 1,000,000)
        int repeticionesSaludos = 5; // Número de veces que se muestra el saludo (entre 1 y 10)

        // Tiempo de inicio del programa
        long tiempoInicioPrograma = System.currentTimeMillis();

        // Crear los hilos
        Thread hiloFactoresPrimos = new FactorizacionPrimos(numero);
        Thread hiloSaludos = new SaludosRandom(repeticionesSaludos);
        Thread hiloJavaDivertido = new Mensaje();

        // Iniciar los hilos
        hiloFactoresPrimos.start();
        hiloSaludos.start();
        hiloJavaDivertido.start();

        // Esperar a que todos los hilos terminen
        while (hiloFactoresPrimos.isAlive() || hiloSaludos.isAlive() || hiloJavaDivertido.isAlive()) {
        }

        // Tiempo de fin del programa
        long tiempoFinPrograma = System.currentTimeMillis();
        System.out.println("Tiempo total de ejecución del programa: " + (tiempoFinPrograma - tiempoInicioPrograma) + " ms");
    }
}
