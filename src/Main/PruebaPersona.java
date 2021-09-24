package Main;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = "Juan";
        p1.apellido = "Gomez";
        p1.desplegarInfo();

        Persona p2 = new Persona(); //reserva un espacio de memoria
        System.out.println(p2); //veo el espacio asignado.
        p2.desplegarInfo();
        p2.nombre = "Vanesa";
        p2.apellido = "Burman";

        Persona p3 = new Persona("Vanesa Yanina", "Burman");
        p3.desplegarInfo();

        //PASO POR VALOR
        int x = 10;

        System.out.println("x = " + x);

        cambioValor(x);
        System.out.println("x nuevo valor= " + x);

        //PASO POR REFERENCIA
        Persona persona1 = new Persona(); //Variables del tipo Object heredan de la clase Object y apuntan a una referencia y no a un valor primitivo
        persona1.nombre = "Vane";
        System.out.println("persona1.nombre = " + persona1.nombre);

        Persona persona2 = new Persona();
        System.out.println("persona2.nombre = " + persona2.nombre);

        cambiaValorPorRef(persona1);
        System.out.println("persona1.nombre nuevo = " + persona1.nombre);

    }

    public static void cambioValor(int arg1){ //solo recibe una copia de la variable x al argumento (del valor primitivo)
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
        System.out.println("arg1 cambio = " + arg1);
    }

    public static void cambiaValorPorRef(Persona persona){ //persona1 y el argumento persona están apuntando o referenciando al mismo objeto (en la memoria Heap), entonces si podemos modificar los atributos del objeto desde el método
        persona.nombre = "Yanina";
    }
}
