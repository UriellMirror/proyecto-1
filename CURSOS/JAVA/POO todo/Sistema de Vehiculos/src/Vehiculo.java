public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;
    protected double velocidadActual = 0;

    public Vehiculo(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo=modelo;
        this.anio=anio;
    }

    public abstract void mostrarDetalles();

    public  void acelerar(double incremento){
        if(incremento > 0) {
            velocidadActual += incremento;
        }
    }
    public  void frenar(double decremento){
        if (decremento > 0){
            velocidadActual -=decremento;
        } else{
            velocidadActual = 0;
        }
    }

    public double getVelocidadActual(){
        return velocidadActual;
    }
    public String  getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAnio(){
        return anio;
    }

}
