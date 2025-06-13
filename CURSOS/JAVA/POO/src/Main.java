//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Empleado[] empleados = new Empleado[4];

    empleados[0] = new Gerente("Ana");
    empleados[1] = new Tecnico("Ricardo");
    empleados[2] = new Tecnico("Armando");
    empleados[3] = new Gerente("Martin");


    //recorriendo con un for each,
        for(Empleado a : empleados){
            a.trabajar();

            if ( a instanceof Gerente){
                ((Gerente) a).revisarEstrategia();
            }
            else if( a instanceof Tecnico){
                ((Tecnico)a).repararEquipo();
            }
        }

    }



}