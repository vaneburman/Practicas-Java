package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //Variables locales
        int a = 10;
        int b = 2;
        miMetodo();

        Aritmetica aritm1 = new Aritmetica();
        aritm1.a = 3;
        aritm1.b = 2;
        aritm1.sumar();

        int resultado = aritm1.sumarConRetorno();
        System.out.println("resultado desde la prueba = " + resultado);

        resultado = aritm1.sumarConArg(5, 8);
        System.out.println("resultado método con args = " + resultado);

        Aritmetica aritm2 = new Aritmetica(12, 16);
        System.out.println("aritm2 atributos= " + aritm2.a + " " + aritm2.b);

        //aritm1 = null; se elimina la referencia al espacio de memoria Heap donde está el objeto, pero el objeto sigue guardado
        //System.gc();
    }

    public static void miMetodo(){
        //a =10; la variable "a" está fuera del alcance de miMetodo.
        System.out.println("Método de prueba de scope");
    }
}
