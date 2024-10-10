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
        String nombre="";
        String ciclo="";
        int edad=0;
        float notaMedia=0;
        
        Alumno alumno;
        ArrayList <Alumno>alumnos= new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(archivoCSV)))) {
            while ((linea = br.readLine()) != null) {
                // Separar los valores por el delimitador (en este caso una coma)
                String[] datos = linea.split(",");

               // Convertir los datos en un objeto Alumno. Funciona como un array las posiciones de cada linea del csv
                nombre=datos[0].trim();
                edad=Integer.parseInt(datos[1].trim());//parseamos el string de la edad para tratarlo como un int
                ciclo=datos[2].trim();
                notaMedia=Float.parseFloat(datos[3].trim());//parseamos el string de la nota media
                // Crear un nuevo objeto Alumno y agregarlo a la lista
                alumno = new Alumno(nombre,edad,ciclo,notaMedia);
                alumnos.add(alumno);
            }
            }catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir los datos numéricos: " + e.getMessage());
            }

        }
    }


