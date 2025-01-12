import java.io.*;
import java.net.*;

public class Cliente {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 3500)) {
            
            InputStream entrada = socket.getInputStream();
            
            OutputStream salida = socket.getOutputStream();
            
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(entrada));
            
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(salida));
            
            
            BufferedReader entradaUsuario = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Conectado al servidor. Escribe 'exit' para salir.");

            while (true) {
                System.out.print("Introduce una petición: ");
                String solicitud = entradaUsuario.readLine();
                writer.write(solicitud + "\n");  
                writer.flush();  

                // Leer la respuesta del servidor
                String respuesta = reader.readLine();
                System.out.println("Respuesta del servidor: " + respuesta);
                
                if (solicitud.equalsIgnoreCase("exit")) {
                    break;  
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
