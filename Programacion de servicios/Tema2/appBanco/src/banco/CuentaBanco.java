package banco;

public class CuentaBanco {
    private int saldo;
    
    public CuentaBanco(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized void ingresarDinero(int cantidad, String nombre) {
        saldo += cantidad;
        System.out.println(nombre + " ha ingresado: " + cantidad + " euros. Saldo actual: " + saldo);
    }

    public synchronized void retirarDinero(int cantidad, String nombre) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println(nombre + " ha retirado: " + cantidad + " euros. Saldo actual: " + saldo);
        } else {
            System.out.println(nombre + " intentó retirar: " + cantidad + " euros, pero no hay suficiente saldo. Saldo actual: " + saldo);
        }
    }

    public synchronized int obtenerSaldo() {
        return saldo;
    }
}
