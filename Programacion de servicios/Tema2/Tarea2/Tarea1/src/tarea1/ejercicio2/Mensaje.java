package ejercicio2;

public class Mensaje extends Thread {
    @Override
    public void run() {
        long tiempoInicio = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            System.out.println("Java es Divertido");
            try {
                Thread.sleep(1000); // Retardo de 1 segundo
            } catch (InterruptedException e) {
                System.err.println("Hilo interrumpido: " + e.getMessage());
            }
        }
        long tiempoFin = System.currentTimeMillis();
        System.out.println("Tiempo de ejecución del hilo de mensajes: " + (tiempoFin - tiempoInicio) + " ms");
    }
}