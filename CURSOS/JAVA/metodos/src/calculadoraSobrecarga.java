public class calculadoraSobrecarga {
    public static void main(String[] args) {
        int x =  3;
        int y =  7;
        System.out.println(sumar(x,y));

    }


    public static int sumar (int a, int b){
    return a+b;
    }

    public static int sumar (int a, int b, int c){
        return a+b+c;
    }
    public static double sumar(double a, double b){
        return a+b;
    }

}
