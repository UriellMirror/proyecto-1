public abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void describir(){
        System.out.println("Nombre: "+nombre+" Edad:"+edad);
    }

    public abstract void hacerSonido();
}
