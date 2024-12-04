import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

public class ConFileLock {
    public static void zonaBloq(){
        String listaEscribir[]={"a","b","c","d","e","f"};
        int numAleatorio = (int) (Math.random() * listaEscribir.length);
        File archivo = new File("src\\Archivo1.txt");
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
            raf.seek(raf.length());
            raf.writeUTF("Practica 4.2 de procesos " +listaEscribir[numAleatorio]);
            bloqueo.release(); // Liberar el bloqueo
            raf.close(); // Cerrar el archivo
            
        } catch (Exception e) {
            System.out.println("No se puede acceder al fichero");
        }
    }
    public static void main(String[] args) {
        zonaBloq();
    }
}
