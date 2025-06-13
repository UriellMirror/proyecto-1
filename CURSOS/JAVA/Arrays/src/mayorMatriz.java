public class mayorMatriz {
    public static void main(String[] args) {
        int [][] enteros = {
                {10,1,8,7},
                {3,5,9,89},
                {3,100,1,0},
                {1000,3,8,56}

        };
        System.out.println("Numero mayor de la Matriz: "+ mayorMatriz(enteros));

    }

    public static int mayorMatriz(int[][] arg){
        int mayor = arg[0][0];
        for( int i= 0; i<arg.length ; i++) {
            for (int j = 0; j < arg[i].length; j++) {
                if ( arg[i][j] > mayor) {
                    mayor = arg[i][j];

                }
            }
        }
        return mayor;
    }
}
