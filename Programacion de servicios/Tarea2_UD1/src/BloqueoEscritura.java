import java.io.File;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

public class BloqueoEscritura {
    public static void zonaBloq(){
        File archivo = new File("src\\Archivo.txt");
        try {
            // Creación del archivo si no existe
            if (!archivo.exists()) 
                archivo.createNewFile();
                
        } catch (Exception e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }

        try {
            // Acceso al archivo con bloqueo
            RandomAccessFile raf = new RandomAccessFile(archivo, "rwd");
            FileLock bloqueo = raf.getChannel().lock();
            /* 
            int valor = raf.readInt(); // Leer el valor binario del archivo
            valor++; // Incrementar el valor
            raf.seek(0); // Volver al inicio del archivo
            raf.writeInt(valor); // Escribir el nuevo valor en binario
            */
            raf.writeUTF("Ramón apruébame :)");
            bloqueo.release(); // Liberar el bloqueo
            raf.close(); // Cerrar el archivo
            
            //System.out.println("Valor incrementado a: " + valor);
        } catch (Exception e) {
            System.out.println("No se puede acceder al fichero: " + e.getMessage());
        }
    }
}
