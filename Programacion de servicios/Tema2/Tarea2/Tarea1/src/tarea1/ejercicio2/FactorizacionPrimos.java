package ejercicio2;

import java.util.ArrayList;

public class FactorizacionPrimos extends Thread {
    private int numero;

    public FactorizacionPrimos(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        long tiempoInicio = System.currentTimeMillis();
        System.out.println("Número a descomponer: " + numero);
        String factoresPrimos = descomponerEnPrimos(numero);
        long tiempoFin = System.currentTimeMillis();
        System.out.println("Descomposición en factores primos: " + factoresPrimos);
        System.out.println("Tiempo de ejecución del hilo de factores primos: " + (tiempoFin - tiempoInicio) + " ms");
    }

    private String descomponerEnPrimos(int numero) {
        StringBuilder resultado = new StringBuilder();
        ArrayList<Integer> primos = new ArrayList<>();
        int numeroOriginal = numero;

        // Encontrar factores primos
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            int conteo = 0;
            while (numero % i == 0) {
                conteo++;
                numero /= i;
            }
            if (conteo > 0) {
                primos.add(i);
                resultado.append(i).append("^").append(conteo).append(" · ");
            }
        }
        if (numero > 1) {
            primos.add(numero);
            resultado.append(numero).append("^1");
        } else {
            resultado.setLength(resultado.length() - 3); // Eliminar " · " final
        }

        return numeroOriginal + " = " + resultado.toString();
    }
}