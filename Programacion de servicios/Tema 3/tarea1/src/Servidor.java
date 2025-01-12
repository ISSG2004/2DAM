import java.io.*;
import java.net.*;
import java.util.Random;

public class Servidor {
    static final int PUERTO = 3500;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PUERTO)) {
            System.out.println("Servidor escuchando en el puerto " + PUERTO);

            while (true) {
                Socket cliente = serverSocket.accept();
                new Thread(() -> controlCliente(cliente)).start();
            }
        } catch (IOException e) {
            System.out.println("Error en el servidor: " + e.getMessage());
        }
    }

    private static void controlCliente(Socket cliente) {
        int numeroSecreto = new Random().nextInt(101);
        System.out.println("Nuevo cliente conectado. Número secreto: " + numeroSecreto);

        try (
            DataInputStream entrada = new DataInputStream(cliente.getInputStream());
            DataOutputStream salida = new DataOutputStream(cliente.getOutputStream())
        ) {
            salida.writeUTF("Adivina un número entre 0 y 100.");
            boolean adivinado = false;

            while (!adivinado) {
                salida.writeUTF("Introduce tu número: ");
                int intento = entrada.readInt();
                System.out.println("Cliente intentó: " + intento);

                if (intento == numeroSecreto) {
                    salida.writeUTF("¡Correcto! Has adivinado el número.");
                    adivinado = true;
                } else if (intento < numeroSecreto) {
                    salida.writeUTF("El número es mayor.");
                } else {
                    salida.writeUTF("El número es menor.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error con el cliente: " + e.getMessage());
        } finally {
            try {
                cliente.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar la conexión con el cliente: " + e.getMessage());
            }
            System.out.println("Conexión con el cliente cerrada.");
        }
    }
}
