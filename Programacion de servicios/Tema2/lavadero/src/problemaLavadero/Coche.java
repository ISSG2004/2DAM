package problemaLavadero;

public class Coche {
    private String nombre;
    private String tamano; // Puede ser "pequeño", "mediano", "grande"
    private String tipoLavado; // Puede ser "normal", "extra", "super"

    public Coche(String nombre, String tamano, String tipoLavado) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.tipoLavado = tipoLavado;
    }

    public String getNombre() {
        return nombre;
    }

    public int calcularTiempoLavado() {
        int tiempoBase = 10; // Lavado normal de un coche pequeño
        int incrementoTamano = switch (tamano) {//en función de tamaño incrementamos un valor u otro
            case "mediano" -> 4;
            case "grande" -> 8;
            default -> 0;
        };
        int incrementoLavado = switch (tipoLavado) {//en función del tipo de lavado incrementamos un valor u otro
            case "extra" -> 2;
            case "super" -> 4;
            default -> 0;
        }; //devolvemos el tiempo total con los incrementos
        return tiempoBase + incrementoTamano + incrementoLavado;
    }

    @Override
    public String toString() {//mostramos el coche con todos los datos
        return "Coche{" + "nombre='" + nombre + '\'' + ", tamano='" + tamano + '\'' + ", tipoLavado='" + tipoLavado + '\'' + '}';
    }
}
