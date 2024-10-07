package tarea2a;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String archivoCSV = "C:\\Users\\2DAM\\Documents\\GitHub\\2DAM\\Acceso a datos\\Tareas\\tarea\\src\\main\\java\\tarea2a\\alumnos.csv";

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
    }
}
