package Main;

public class Persona {

    public String nombre; //no es la mejor práctica, es mejor encapsulamiento y setearlo.
    public String apellido;

    public Persona(){
        System.out.println("Contructor Sin argumentos");
    }

    Persona(String nombre, String apellido){
        //super(); llamada al constructor de la clase padre (clase Object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
        new Imprimir().imprimir(this); //ejemplo de como funciona this
    }
    public void desplegarInfo(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
    }
}

class Imprimir{
    public void imprimir (Persona persona){
        System.out.println("Persona desde imprimir: " + persona);
        System.out.println("Impresion del objeto actual(this) " + this);
    }
}
