package dominio;

public class GC extends Cromatografos{
    int resolucion;
    int maxPresion;
    int selectividad;

    public GC(int resolucion, int maxPresion, int selectividad) {
        this.resolucion = resolucion;
        this.maxPresion = maxPresion;
        this.selectividad = selectividad;
    }

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
