package problemaLavadero;

public class Lavado  extends Thread {
    private Coche coche;
    private String operario;

    public Lavado(Coche coche, String operario) {
        this.coche = coche;
        this.operario = operario;
    }

    @Override
    public void run() {
        //calculamos al tiempo de lavado
        int tiempoLavado = coche.calcularTiempoLavado();
        System.out.println("El operario " + operario + " empieza a lavar el " + coche.getNombre() + " (" + tiempoLavado + "s)");
        try {
            //dormimos el hilo durante el tiempo calculado por los datos del coche
            Thread.sleep(tiempoLavado * 1000);
        } catch (InterruptedException e) {
            System.err.println("Lavado interrumpido: " + e.getMessage());
        }
        //mostramos el tiempo calculado
        System.out.println("El operario " + operario + " terminó de lavar el " + coche.getNombre());
    }
}