package main;

public class EjercicioNail {

    public static void main(String[] args) {

        int solucion = Solution.solution(new int[]{1, 1, 3, 3, 3, 4, 5, 5, 5, 5}, 2);
        System.out.println(solucion);
    }
}

class Solution{
    /**
     * PROPOSITO: obtener el valor máximo de clavos que pueden estar a la misma altura
     * después de martillar una cantidad estipulada de veces, partiendo de una tabla con
     * clavos de diferentes alturas (abstracción de un array de altura de clavos con N posiciones)
     * @param A: es un array de N cantidad de elementos del tipo integer que representan
     *         la altura de cada clavo en la tabla
     * @param Y: es un dato tipo integer que representa la cantidad de clavos que pueden ser
     *         martillados
     * @return: la cantidad máxima de clavos que pueden ser posicionados a la misma altura
     *          después de martillar hasta Y cantidad de clavos
     */
    public static int solution(int[] A, int Y){

        int acumulador = 1;
        int maxAgrupados = 0;
        /*
        Voy a iterar sobre el array A para tener un acumulador de clavos que están a la misma altura,
        trabajo luego con el grupo que mayor cantidad de clavos a la misma altura tengan (maxAgrupados).
        Itero el array, pero no sobre el A.length, sino sobre el A.length menos la cantidad de
        clavos que puedo golpear como máximo (a lo sumo Y cantidad de clavos). Esto me posibilita afirmar
        que voy a tener al menos "Y" cantidad de clavos en los indices siguientes a "maxAgrupados" para
        poder golpear y bajar a la altura de "maxAgrupados" (recordando que no puedo subir alturas,
        sino solo martillar para bajarlos).
        Además de restar "Y" al A.length para la iteración, resto 1 posición para poder realizar el condicional
        comparando la posición con la siguiente. El acumulador inicializa en 1.

         */
        for (int i=0; i<A.length-Y-1 ; i++){
            if(A[i] == A[i+1]){
                acumulador += 1;
            } else acumulador = 1;

            if(acumulador > maxAgrupados){
                maxAgrupados = acumulador;
            }
        }
        int result = (Y >= A.length-1) ? A.length : (maxAgrupados + Y);
        return result;
    }
}