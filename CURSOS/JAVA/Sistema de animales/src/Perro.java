public class Perro extends Animal{
    public Perro(String nombre, int edad){
        super(nombre, edad);

    }

    @Override
    public void hacerSonido() {
        System.out.println("PERRO ULTRAA FURIOSO LADRANDO GUAU GUAU ");
    }
}
