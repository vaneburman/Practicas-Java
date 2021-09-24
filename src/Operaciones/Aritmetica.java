package Operaciones;

public class Aritmetica {
    //ATRIBUTOS DE LA CLASE
    int a; //valor default 0;
    int b; //idem

    //CONSTRUCTORES
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }

    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando Constructor con Argumentos");

    }

    //MÉTODOS DE LA CLASE
    public void sumar(){
        int resultado = this.a + this.b; //variable local al método sumar
        System.out.println("resultado = " + resultado);

    }

    public int sumarConRetorno(){

        return a + b; //no hago variables innecesarias

    }

    public int sumarConArg(int a, int b){
        this.a = a; //el argumento a se asigna al atributo this.a;
        this.b = b; //acá modificamos los atributos del objeto, pero podemos hacerlo directo con los argumentos

        return this.sumarConRetorno();

    }


}
