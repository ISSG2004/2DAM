package accesorandom;
import java.io.*;
import java.nio.channels.FileLock;


public class Main {
    public static void main(String[] args) {

        File archivo = new File("src\\accesorandom\\Archivo.txt");
        try {
            // Creación del archivo si no existe
            if (!archivo.exists()) {
                archivo.createNewFile();
                
                // Escribir valor inicial en binario
                try (RandomAccessFile raf = new RandomAccessFile(archivo, "rwd")) {
                    raf.writeInt(0); // Escribe un 0 en formato binario
                }
                System.out.println("Archivo creado con valor inicial 0");
            } else {
                System.out.println("Archivo existente , su valor se asignará a 0 para que el programa cumpla su cometido");
            }
        } catch (Exception e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }

        try {
            // Acceso al archivo con bloqueo
            RandomAccessFile raf = new RandomAccessFile(archivo, "rwd");
            FileLock bloqueo = raf.getChannel().lock();

            int valor = raf.readInt(); // Leer el valor binario del archivo
            System.out.println("El valor que hay en el fichero es "+valor);
            valor++; // Incrementar el valor
            raf.seek(0); // Volver al inicio del archivo
            raf.writeInt(valor); // Escribir el nuevo valor en binario
            
            bloqueo.release(); // Liberar el bloqueo
            raf.close(); // Cerrar el archivo
            
            System.out.println("Valor incrementado a: " + valor);
        } catch (Exception e) {
            System.out.println("No se puede acceder al fichero: " + e.getMessage());
        }
    }
}
