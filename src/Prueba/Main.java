package Prueba;

import dominio.*;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Cromatografos hplc1 = new HPLC(200, "cuaternaria", 20);
        UVVis uv1 = new UVVis(190, 800);
        MS ms1 = new MS("Maldi", "TOF");


        //lista de equipos
        ArrayList<Cromatografos> salaDeEquipos = new ArrayList<Cromatografos>();
        salaDeEquipos.add(new HPLC(300, "binaria", 54));
        salaDeEquipos.add(new GC(460, 200, 65));
        salaDeEquipos.add(new GC(800, 870, 98));
        salaDeEquipos.add(new HPLC(987, "Cuaternaria", 75));



        for (Cromatografos equipo : salaDeEquipos){
            equipo.instalar();
            equipo.separarComponentes();
            equipo.detectarComponentes(uv1);

        }

    }
}
