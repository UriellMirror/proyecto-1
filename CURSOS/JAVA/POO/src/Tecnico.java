public class Tecnico extends Empleado{

    public Tecnico(String nombre){
        super(nombre);
    }

    @Override
    protected void trabajar() {
        System.out.println("Tecnico trabajando ");
    }
    protected void repararEquipo(){
        System.out.println("Reparando equipo");
    }
}
