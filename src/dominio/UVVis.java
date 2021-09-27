package dominio;

import java.util.Scanner;

public class UVVis extends Detectores{
    int maxLongitud;
    int minLongitud;
    int longitudDeOnda;

    public UVVis(int minLongitud, int maxLongitud) {
        this.maxLongitud = maxLongitud;
        this.minLongitud = minLongitud;
    }


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


