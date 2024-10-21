import java.io.*;
public class Main {
    public static void main(String[] args) {

        File archivo = new  File("Programacion de servicios\\Tarea1\\Archivo.txt");
        try {//creacion del archivo
            if (!archivo.exists()) {
                archivo.createNewFile();
                
                
                System.out.println("Archivo creado");
            }else{
                System.out.println("Archivo existente");
            }
            try {
                FileWriter escritor = new FileWriter(archivo);
                escritor.write("Estoy escribiendo en el archivo");
                System.out.println("Estoy escribiendo en el archivo");
                escritor.close();
            } catch (Exception e) {
                
                System.out.println("No se puede escribir contenido en el archivo");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}