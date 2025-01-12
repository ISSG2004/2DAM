
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class Cliente {
    static final String HOST = "localhost";
    static final int PUERTO = 3500;

    public static void main(String[] args) {
        try (
            Socket socket = new Socket(HOST, PUERTO);
            DataInputStream entrada = new DataInputStream(socket.getInputStream());
            DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
            Scanner teclado = new Scanner(System.in);
        ) {
            System.out.println(entrada.readUTF());

            boolean terminado = false;
            while (!terminado) {
                System.out.println(entrada.readUTF());
                String intento = teclado.nextLine();
                salida.writeInt(Integer.parseInt(intento));
                String respuesta = entrada.readUTF();
                System.out.println(respuesta);

                if (respuesta.contains("¡Correcto!")) {
                    terminado = true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error en el cliente: " + e.getMessage());
        }
    }
}

