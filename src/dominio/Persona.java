package dominio;

import java.util.StringJoiner;

public class Persona {
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    private int id;
    private static int contadorPersonas;

    //constructor
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre; //con this accedemos al atributo nombre y le asignamos el argumento nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    //cada vez que se cree un objeto se va a aumentar el contador
    public Persona(String nombre){
        this.nombre = nombre;
        //las variables static se referencian a la clase, no se usa this para estos atributos, sino la clase.
        Persona.contadorPersonas++;
        this.id = Persona.contadorPersonas;
    }

    //getter and setter

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    //método toString para imprimir el estado del objeto

    @Override
    public String toString() {
        return new StringJoiner(", ", Persona.class.getSimpleName() + "[", "]")
                .add("nombre='" + nombre + "'")
                .add("sueldo=" + sueldo)
                .add("eliminado=" + eliminado)
                .add("id=" + id)
                .toString();
    }
}
