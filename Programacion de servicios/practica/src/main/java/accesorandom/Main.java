package accesorandom;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;


public class Main {
    public static void main(String[] args) {

        File archivo = new  File("Programacion de servicios\\practica\\src\\main\\resources\\Archivo.txt");
        try {//creacion del archivo
            if (!archivo.exists()) {
                archivo.createNewFile();
                //si no existe escribimos en el archivo
                try {
                    FileWriter escritor = new FileWriter(archivo);
                    escritor.write("0");
                    escritor.close();
                } catch (Exception e) {
                    
                    System.out.println("No se puede escribir contenido en el archivo");
                }
                System.out.println("Archivo creado");
            }else{
                System.out.println("Archivo existente");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {//acceso al archivo
            RandomAccessFile raf = new RandomAccessFile(archivo, "rwd");
            //no se que hacer con bloqueo, preguntar mañana
            FileLock bloqueo=raf.getChannel().lock();
            /* 
            String valorFichero= raf.readLine();
            Integer valorConvertido= Integer.parseInt(valorFichero);
            valorConvertido++;
            raf.seek(0);
            String valorMod=valorConvertido.toString();
            raf.writeUTF(valorMod);
            */
            int valor=raf.readInt();
            valor++;
            raf.seek(0);
            raf.writeInt(valor);
            raf.close();
            bloqueo.relase();
        } catch (Exception e) {
            System.out.println("No se puede acceder al fichero");
        }
    }
}

