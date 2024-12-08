package ejercicio1;

import java.util.ArrayList;
import java.lang.Runnable;

public class CalcularPrimo implements  Runnable{
    private int limite;

    public CalcularPrimo(int limite) {
        this.limite = limite;
    }

    @Override
    public void run() {
        long horaInicio = System.currentTimeMillis();
        ArrayList<Integer> primos = ObtenerPrimos(limite);
        long horaFin = System.currentTimeMillis();
        System.out.println("Números primos menores que " + limite + ": " + primos);
        System.out.println("Tiempo de ejecución del hilo de números primos: " + (horaFin - horaInicio) + " ms");
    }

    private ArrayList<Integer> ObtenerPrimos(int n) {
        ArrayList<Integer> primos = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (esPrimo(i)) {
                primos.add(i);
            }
        }
        return primos;
    }

    private boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
