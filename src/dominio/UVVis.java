package dominio;

import java.util.Scanner;

public class UVVis extends Detectores{
    //atributos del detector UV-Visible
   protected int maxLongitud;
   protected int minLongitud;
   protected int longitudDeOnda;

    //Constructor con las características que necesita
    public UVVis(int minLongitud, int maxLongitud) {
        this.maxLongitud = maxLongitud;
        this.minLongitud = minLongitud;
    }

    //setteo de atributos
    public int getMaxLongitud() {
        return maxLongitud;
    }

    public int getMinLongitud() {
        return minLongitud;
    }

    public int getLongitudDeOnda() {
        return longitudDeOnda;
    }

    public void setLongitudDeOnda(int longitudDeOnda) {
        this.longitudDeOnda = longitudDeOnda;
    }

    //método detectar para el UV-Visible
    @Override
    public void detectar() {
        while(longitudDeOnda < minLongitud || longitudDeOnda > maxLongitud){
            System.out.println("error: setear longitud de onda de análisis dentro de los rangos de trabajo. Longitud de Onda máxima: " + maxLongitud + "nm, Longitud de Onda Mínima: " + minLongitud + "nm.");
            Scanner longitud = new Scanner(System.in);
            longitudDeOnda = longitud.nextInt();
        }
        System.out.println("detectando resultados con UV-Vis en " + longitudDeOnda + " nm...");

        }
    }


