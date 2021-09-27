package dominio;

public class GC extends Cromatografos{
    //atributos
    int resolucion;
    int maxPresion;
    int selectividad;

    //constructor GC
    public GC(int resolucion, int maxPresion, int selectividad) {
        this.resolucion = resolucion;
        this.maxPresion = maxPresion;
        this.selectividad = selectividad;
    }

    //métodos con implementación específica de GC
    @Override
    public void separarComponentes() {
        System.out.println("Separación cromatográfica con carrier gaseoso...");
    }

    @Override
    public void detectarComponentes(Detectores detector) {
        detector.detectar();
        System.out.println("detectado en GC...");
    }


}
