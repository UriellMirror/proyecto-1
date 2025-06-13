//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal[] caninos = {
                new Perro("Sultan", 3),
                new Gato("Azul", 2),
                new Perro("Sanson", 2)

        };

        for( Animal animales : caninos){
            animales.describir();
            animales.hacerSonido();
        }

    }
}