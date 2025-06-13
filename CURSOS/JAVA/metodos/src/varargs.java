public class varargs {
    public static void main(String[] args) {


        System.out.println(sumavariosArgs(1,2,3,4,5));

    }

    public static int sumavariosArgs(int... numeros){
        //for each
        int suma = 0;
        for(int variable : numeros){
            suma+=variable;
        }
        return suma;
    }
}
