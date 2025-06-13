public class EmpleadoTiempoCompleto extends Empleado {
    private double bono;
    public EmpleadoTiempoCompleto(String nombre, int edad, double salario, double bono){
    super(nombre,edad,salario);
    this.bono = bono;
    }
    @Override
    protected void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Bono: "+ bono);
    }

    public double getBono(){
        return bono;
    }
    public void setBono(double bono){
        this.bono = bono;
    }


}
