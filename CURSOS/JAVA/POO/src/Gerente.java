public class Gerente extends Empleado {

public Gerente(String nombre){
    super(nombre);
}

    @Override
    protected void trabajar(){
        System.out.println("Gerente trabajando");
    }

    protected void revisarEstrategia(){
        System.out.println("Gerente revisando estrategia");
    }
}
