public class Empleado {

    private String nombre;

    public Empleado(String nombre){
        this.nombre = nombre;
    }


    protected void trabajar(){
        System.out.println("Empleado trabajando");
    }
}
