package main;

public class Main {
    public static void main(String[] args) {
        //Bidimensionales: en un índice del array se almacena otro array. MATRIZ
        int matriz[][] = new int[5][4]; //row - column

        for (int x=0; x < matriz.length; x++)
            for (int y=0; y < matriz[x].length; y++)
                matriz[x][y] = x * 10 + y;
        // imprimir la tabla
        for (int x=0; x < matriz.length; x++)
        {
            for (int y=0; y < matriz[x].length; y++)
                System.out.print (matriz[x][y] + "\t");
            System.out.println();
        }

        //array dinámico
        int[][] array2 = {
                {1, 5, 15, 14, 9, 16},
                {0, 3},
                {0, 0, 0, 1, 1, 0},
                {548, 35, 65},
                {0, 5},
        };
        //imprimo con un for each
        for(int[] fila : array2){
            for (int celda : fila){
                System.out.print(celda + "\t");
            }
            System.out.println();
        }


        // otro ejercicio de array: representar saldo inicial en pesos y crecimiento anual en función de distintos intereses, año tras año.
        //capital inicial: $10.000; intereses: 10 a 15%; periodo de estudio: 5 años
        double acumulado; //no la inicio
        double interes = 0.10;

        double saldo[][] = new double [6][5];

        for (int i=0; i<6; i++){
            saldo[i][0] = 10000; //almaceno en la primera dimensión del array el capital inicial fijo. Siempre es igual
            acumulado = 10000;

            for(int j=1; j<5; j++){     //en el indice [0] ya tenemos un valor fijo
                acumulado = acumulado + (acumulado*interes);
                saldo[i][j] = acumulado;
            }

            //incrementar el interés para la próxima iteración
            interes = interes + 0.01;

        }

        for (int z=0; z<6; z++){
            for (int h=0; h<5; h++){
                System.out.print(saldo[z][h]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
