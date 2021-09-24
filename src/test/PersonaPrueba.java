package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000.00, false);
        System.out.println(persona1); //printLn va a llamar de manera automática el toString(), con el override lo llevamos al toString seteado en la clase y no el método homónimo de la superclase Object.
        persona1.setNombre("Juan Carlos");
        //persona1.nombre = "Juan Carlos", no se puede usar
        System.out.println(persona1);

        //static + métodos que tienen que ser static dentro de un método static.
        Persona persona2 = new Persona("Manolo");
        imprimir(persona2); //se va a mostrar la info y no la dirección hexadecimal a la cual apunta el objeto

        Persona persona3 = new Persona("Karla");
        imprimir(persona3);
    }

    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    /*
    el método imprimir() se asocia con los objetos instanciados a partir de la clase PersonaPrueba, pero como en Main no estamos
    creando ningún objeto del tipo PersonaPrueba, no podemos utilizar métodos que no sean static dentro de métodos que sean statics.
    NO SE PUEDE USAR THIS en el contexto estático, porque este no puede acceder al contexto dinámico, no hace referencia a ningún objeto.
    Pero al contrario si, un dinámico si puede acceder dentro del contexto estático.
     */


}
