package banco;

public class Main {
    public static void main(String[] args) {
        CuentaBanco cuenta = new CuentaBanco(100); // Saldo inicial

        Cliente pepe = new Cliente(cuenta, "Pepe");
        Cliente juan = new Cliente(cuenta, "Juan");
        Cliente maria = new Cliente(cuenta, "María");

        pepe.start();
        juan.start();
        maria.start();

        try {
            pepe.join();
            juan.join();
            maria.join();
        } catch (InterruptedException e) {
            System.out.println("El hilo principal fue interrumpido.");
        }

        System.out.println("Saldo final en la cuenta: " + cuenta.obtenerSaldo() + " euros.");
    }
    
}
