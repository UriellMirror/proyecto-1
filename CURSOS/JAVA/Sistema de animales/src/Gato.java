public class Gato extends Animal{
    public Gato(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println("El gato feo hace MIAUUUUUUU");
    }
}
