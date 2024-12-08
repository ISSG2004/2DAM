package ejercicio1;

public class CuantaAtras implements Runnable {
    private int inicio;

    public CuantaAtras(int inicio) {
        this.inicio = inicio;
    }

    @Override
    public void run() {
        long horaInicio = System.currentTimeMillis();
        for (int i = inicio; i >= 0; i--) {
            System.out.println("Cuenta regresiva: " + i);
            try {
                Thread.sleep(1000); // Retardo de 1 segundo
            } catch (InterruptedException e) {
                System.err.println("Hilo interrumpido: " + e.getMessage());
            }
        }
        long horaFin = System.currentTimeMillis();
        System.out.println("Tiempo de ejecución del hilo de cuenta regresiva: " + (horaFin - horaInicio) + " ms");
    }
}