package tarea2a;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        
        String archivoCSV = "C:\\Users\\2DAM\\Documents\\GitHub\\2DAM\\Acceso a datos\\Tareas\\tarea\\src\\main\\java\\tarea2a\\alumnos.csv";
        String linea="";
        String alumno="";
        String ciclo="";
        int edad=0;
        float notaMedia=0;
        
        Alumno alumno;
        ArrayList <Alumno>alumnos= new ArrayList<>();
        /* 
        try (CSVReader reader = new CSVReader(new FileReader(archivoCSV))) {
            String[] linea;

            // Lee el archivo línea por línea
            while ((linea = reader.readNext()) != null) {
                // Cada línea es un arreglo de cadenas
                for (String campo : linea) {
                    System.out.print(campo + " ");
                }
                System.out.println(); // Salto de línea después de cada fila
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(archivoCSV)))) {
            while ((linea = br.readLine()) != null) {
                // Separar los valores por el delimitador (en este caso una coma)
                String[] datos = linea.split(",");

               // Convertir los datos en un objeto Alumno. Funciona como un array las posiciones
              

                // Crear un nuevo objeto Alumno y agregarlo a la lista
                alumno = new Alumno();
                alumnos.add(alumno);
            }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
