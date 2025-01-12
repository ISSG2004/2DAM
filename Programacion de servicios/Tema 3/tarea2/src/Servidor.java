import java.io.*;
import java.net.*;
import java.util.*;

public class Servidor {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(3500)) {
            System.out.println("Servidor escuchando en el puerto 3500...");
            
            
            Socket socketCliente = serverSocket.accept();
            
            
            InputStream entrada = socketCliente.getInputStream();
            
            OutputStream salida = socketCliente.getOutputStream();
            
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(entrada));
            
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(salida));
            
            
            String[] articulos = {
                "Ordenador, 400 euros", "Pantalla, 150 euros", "Teclado, 50 euros",
                "Ratón, 30 euros", "Auriculares, 80 euros", "Impresora, 200 euros", 
                "Móvil, 600 euros", "Tablet, 300 euros", "Cámara, 500 euros", 
                "Altavoces, 120 euros"
            };
            String[] ofertas = {
                "¡Oferta! Pantallas de ordenador a partir de 100 euros", 
                "¡Oferta! 20% de descuento en ratones", 
                "¡Oferta! Impresoras a mitad de precio", 
                "¡Oferta! Todos los móviles con 10% de descuento", 
                "¡Oferta! Auriculares con 50% de descuento"
            };
            
            
            while (true) {
                String solicitud = reader.readLine();
                
                if (solicitud == null) {
                    break;
                }

                if (solicitud.equalsIgnoreCase("articulo")) {
                    writer.write(articulos[new Random().nextInt(articulos.length)] + "\n");
                    writer.flush();
                } else if (solicitud.equalsIgnoreCase("oferta")) {
                    writer.write(ofertas[new Random().nextInt(ofertas.length)] + "\n");
                    writer.flush();
                } else if (solicitud.equalsIgnoreCase("exit")) {
                    writer.write("Te has desconectado del servidor\n");
                    writer.flush();
                    break;  
                } else if (solicitud.equalsIgnoreCase("?") || solicitud.equalsIgnoreCase("ayuda")) {
                    writer.write("Las peticiones disponibles son: articulo, oferta, exit, ?, ayuda.\n");
                    writer.flush();
                } else {
                    writer.write("ERROR, petición incorrecta!! Las peticiones disponibles son: articulo, oferta, exit, ?, ayuda.\n");
                    writer.flush();
                }
            }
            
            socketCliente.close();  
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
