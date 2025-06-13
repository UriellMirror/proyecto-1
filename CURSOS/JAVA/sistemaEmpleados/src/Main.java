//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmpleadoMedioTiempo uriel = new EmpleadoMedioTiempo("Uriel", 28, 20000, 8);
        EmpleadoTiempoCompleto josu =  new EmpleadoTiempoCompleto("Joseee", 31, 26000,6000);

        uriel.setEdad(30);
        uriel.setHorasTrabajadas(15);

        josu.setSalario(21000);
        josu.setNombre("Josue");

        uriel.mostrarInformacion();
        josu.mostrarInformacion();



    }
}

/*----------------------------------------------------------*/

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre(){
        return  this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }


    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario =  salario;
    }

    protected void mostrarInformacion(){

        System.out.printf("""
                Nombre: %s 
                Edad: %d
                Salario: %.2f
                """,nombre, edad, salario);
    }



}
/*-----------------------------------------------*/

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
/*-------------------------------------------------------------*/

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
