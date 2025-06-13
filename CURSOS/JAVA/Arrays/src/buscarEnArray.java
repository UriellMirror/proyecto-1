public class buscarEnArray {
    public static void main(String[] args) {
        int[] numeros = new int[4];

        numeros [1] = 67;
        numeros [2] = 89;
        numeros [3] = 90;
        numeros [0] = 66;

        //busqueda de un valor en un array

        int buscar =  80;
        boolean encontrado = false;

        for (int i : numeros){
            if (i == buscar){
                encontrado = true;
                break;
            }
        }
        if(encontrado) {
            System.out.println("Numero encontrado");
        }
        else {
            System.out.println("Numero no se encontro");
        }
    }
}
