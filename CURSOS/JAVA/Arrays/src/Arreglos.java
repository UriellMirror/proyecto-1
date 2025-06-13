public class Arreglos {
    public static void main(String[] args) {
        //arreglos

        int[] enteros = new int[3];

        // primer forma de llenar el array
        enteros[0] = 1;
        enteros[2] = 5;
        enteros[1] = 9;

        //otra forma de  llenar un array
        int[] numeros = {10,45,67,89,43};


        //asignar el valor de un arra a una varianle
        int primero = enteros[0];

        // recorriendo un array con un for
        int[] numbers = new int[5];
        int[] numbers2 = {12,67,54,21,23};

        //recorrido con for traducional
        for (int i=0 ; i<numbers2.length ; i ++){
            System.out.println(numbers2[i]);
        }

        //recorriendo array con for each
        for (var variable : enteros )
            System.out.println(variable);

        System.out.println(enteros[0]);
    }


}
