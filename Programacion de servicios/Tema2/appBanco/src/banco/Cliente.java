package banco;

public class Cliente extends Thread{
    private CuentaBanco cuenta;
    private String nombre;

    public Cliente(CuentaBanco cuenta, String nombre) {
        this.cuenta = cuenta;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) { // Cada cliente realiza 5 operaciones
            int cantidad = (int) (Math.random() * 100) + 1; 
            if (Math.random() < 0.5) {
                cuenta.ingresarDinero(cantidad, nombre);
            } else {
                cuenta.retirarDinero(cantidad, nombre);
            }

            try {
                Thread.sleep((int) (Math.random() * 500)); 
            } catch (InterruptedException e) {
                System.out.println(nombre + " fue interrumpido.");
            }
        }
    }
}
