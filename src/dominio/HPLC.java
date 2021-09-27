package dominio;

public class HPLC extends Cromatografos{
    int resolucion;
    String sistemaDeBombas;
    int selectividad;

    public HPLC(int resolucion, String sistemaDeBombas, int selectividad) {
        this.resolucion = resolucion;
        this.sistemaDeBombas = sistemaDeBombas;
        this.selectividad = selectividad;
    }

    @Override
    public void separarComponentes() {
        System.out.println("Separación cromatográfica con fase móvil líquida...");
    }

    @Override
    public void detectarComponentes(Detectores detector) {
        detector.detectar();
        System.out.println("detectado en HPLC...");
    }


}
