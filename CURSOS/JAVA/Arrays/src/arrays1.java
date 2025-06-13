import java.util.Arrays;
import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        int[] enteros =  new int[5];
        Scanner numeros = new Scanner(System.in);

        for (int i = 0 ;  i < enteros.length ;i++){
            System.out.printf("Dato para la posicion "+ (i+1) +": ");
            enteros[i] = Integer.parseInt(numeros.nextLine());

        }

        //calculando la suma
        int suma = Arrays.stream(enteros).sum();
        //calculando primedio
        float promedio =(float)  suma / enteros.length;
        //numero mas grande
        int valorMaximo = Arrays.stream(enteros).max().getAsInt();

        int valorMinimo = Arrays.stream(enteros).min().getAsInt();

        System.out.printf(""" 
                              Suma: %d 
                              Promedio: %.2f 
                              # MAX : %d
                              # MIN : %d
                """,suma, promedio, valorMaximo, valorMinimo);


    }
}
