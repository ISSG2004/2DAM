import java.net.*;
import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
        ServerSocket conexion=null;
        try{
            conexion = new ServerSocket(12345 );
        }catch(IOException ex){
            System.err.println("No se ha podido abrir el puerto de escucha.");
            System.err.println(ex.toString());

        }
        try {
            System.out.println("Proceso escritor, esperando "+"la conexion del lector...");
            canal=conexion.accept();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}