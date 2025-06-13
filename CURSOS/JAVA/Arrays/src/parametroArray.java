public class parametroArray {
    public static void main(String[] args) {
        int[] numeros = {2,34,5,7};


        imprimirArray(numeros);
    }
    public static void imprimirArray(int[] arreglo){
        for(int i = 0 ;i< arreglo.length;i++){
            System.out.print(arreglo[i] +" ");
        }
    }
}
