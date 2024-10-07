package tarea2a;
public class Alumno{
    private String nombre;
    private int edad;
    private String ciclo;
    private float notaMedia;
    public Alumno(String nombre, int edad,String ciclo,float notaMedia){
        this.nombre=nombre;
        this.edad=edad;
        this.ciclo=ciclo;
        this.notaMedia=notaMedia;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public float getNotaMedia() {
        return notaMedia;
    }
    
    

    public String getCiclo() {
        return ciclo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
    
    @Override
    public String toString() {
        return "El nombre del alumno es: "+nombre+" su edad es: "+edad+" Estudia en el ciclo "+ciclo+" Su nota media es: "+notaMedia;
    }
    
}