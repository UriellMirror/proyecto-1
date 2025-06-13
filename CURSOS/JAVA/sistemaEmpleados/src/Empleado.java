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
