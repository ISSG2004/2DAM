import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class SinFileLock {
    public static void main(String[] args) {
        String listaEscribir[]={"a","b","c","d","e","f"};
        int numAleatorio = (int) (Math.random() * listaEscribir.length);
        File archivo = new File("src\\Archivo.txt");
        try {
            // Creación del archivo si no existe
            if (!archivo.exists()) 
                archivo.createNewFile();
                
        } catch (Exception e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, true));
            escritor.write("Practica 4.2 "+listaEscribir[numAleatorio]);
            escritor.newLine();
            escritor.close();
        } catch (Exception e) {
            System.out.println("No se puede acceder al fichero");
        }
    }    
}
