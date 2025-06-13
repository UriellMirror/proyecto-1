import java.util.Arrays;

public class parametroMatriz {
    public static void main(String[] args) {
        int[][] matrizA = {
                {1,2,3},
                {5,6,7},
                {4,5,7}
        };

        imprimirMatriz(matrizA);
    }

    public static void imprimirMatriz(int[][] miMatriz){
        for (int i= 0 ;i<miMatriz.length ; i++){
                System.out.println(Arrays.toString(miMatriz[i] ));
          //  System.out.println();
        }
    }

}
