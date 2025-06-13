import java.util.Arrays;

public class Matrices1 {
    public static void main(String[] args) {
        //Definiendo matrices

        int[][] matrizA = {
                {1,4,6},
                {5,7,0},
                {4,8,7}
        };

        int[][] matrizB = {
                {4,2,4},
                {6,0,8},
                {2,4,5}
        };

        //Variable donde se almacenara el resultado
        int[][] matrizSuma =  new int[3][3];

        for (int i = 0 ; i< matrizA.length ; i++){
            for (int  j = 0 ; j<matrizA[i].length; j++){
                matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // imprimiendo el array pero con prinf, ya que con println no funcionara

        for(int i = 0; i<matrizSuma.length ; i++){
            for( int j= 0; j<matrizSuma[i].length ; j++){
                System.out.print("["+matrizSuma[i][j]+"] ");
            }
            System.out.println();
        }
        System.out.println(matrizA[0]);

        // si queremos usar println sera :

        for(int i = 0; i<matrizSuma.length ; i++) {
            System.out.println(Arrays.toString(matrizSuma[i]));
        }

    }
}
