package practica;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File archivo = new File("Archivo.txt");
        FileWriter escritor = null; // Declaramos el escritor aquí

        if (!archivo.exists()) { // Si el archivo no existe, lo creamos
            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado exitosamente.");
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Intentamos escribir en el archivo (independientemente de si se creó nuevo o ya existía)
        try {
            escritor = new FileWriter(archivo, true); // El segundo argumento "true" es para agregar contenido sin sobrescribir
            escritor.write("Escribiendo en el archivo.\n");
            System.out.println("Contenido escrito en el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Aseguramos que el FileWriter se cierre, si se abrió
            if (escritor != null) {
                try {
                    escritor.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

