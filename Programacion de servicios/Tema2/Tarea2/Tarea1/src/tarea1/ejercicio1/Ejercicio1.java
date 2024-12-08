package ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        int limitePrimo = 60; // Límite para los números primos
        int countdownStart = 15; // Inicio de la cuenta atrás

        // Registrar el tiempo de inicio del programa
        long horaInicio = System.currentTimeMillis();

        // Crear los hilos
        Thread hiloPrimo = new Thread(new CalcularPrimo(limitePrimo));
        Thread cuentaAtrasHilo = new Thread(new CuantaAtras(countdownStart));

        // Iniciar los hilos
        hiloPrimo.start();
        cuentaAtrasHilo.start();

        // Esperar a que ambos hilos terminen
        while (hiloPrimo.isAlive() || cuentaAtrasHilo.isAlive()) {
        }

        // Calcular el tiempo total del programa
        long horaFin = System.currentTimeMillis();
        System.out.println("Tiempo total de ejecución del programa: " + (horaFin - horaInicio) + " ms");
    }
}
