package dominio;

public class MS extends Detectores{
    String fuenteIonizacion;
    String analizador;


    public MS(String fuenteIonizacion, String analizador) {
        this.fuenteIonizacion = fuenteIonizacion;
        this.analizador = analizador;
    }

    @Override
    public void detectar() {
        switch(analizador){
            case "TOF":
                System.out.println("detectando resultados con analizador de Tiempo de Vuelo...");
                break;
            case "Cuadrupolo":
                System.out.println("Detectando resultados con analizador de cuadrupolo... ");
                break;
            case "trampa de iones":
                System.out.println("Detectando resultados con analizador de trampa de iones...");
                break;
            default:
                System.out.println("detectando resultados con espectrómetro de masas...");
        }
        System.out.println("Resultado detectado...");
    }
}
