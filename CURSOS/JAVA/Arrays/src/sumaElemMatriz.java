public class sumaElemMatriz {
    public static void main(String[] args) {
        int[][] matriz =  {
                {1,2,3},
                {3,2,1},
                {1,1,1}
        };

        System.out.println(sumarElementosMatriz(matriz));

    }
    public static int sumarElementosMatriz(int[][] array){
        int suma = 0;
        for(int i= 0 ;i<array.length; i++){
            for (int j=0 ;j<array[i].length ; j++){
                suma += array[i][j];
            }
        }
        return suma;
    }
}
