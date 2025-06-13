public class EmpleadoMedioTiempo extends Empleado {
    private int horasTrabajadas;

    public EmpleadoMedioTiempo(String nombre, int edad, double salario,int horasTrabajadas){
        super(nombre,edad,salario);
        this.horasTrabajadas = horasTrabajadas;
    }
    @Override
    protected void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Horas trabajadas: "+horasTrabajadas);
    }

    public int getHorasTrabajadas(){
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }

}
