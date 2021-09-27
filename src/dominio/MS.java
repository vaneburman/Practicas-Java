package dominio;

public class MS extends Detectores{
    //atributos de los detectores espectrómetros de masas
    String fuenteIonizacion;
    String analizador;

    //constructor del detector de masas
    public MS(String fuenteIonizacion, String analizador) {
        this.fuenteIonizacion = fuenteIonizacion;
        this.analizador = analizador;
    }

    //método detectar para el tipo de detector espectrómetro de masas
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
