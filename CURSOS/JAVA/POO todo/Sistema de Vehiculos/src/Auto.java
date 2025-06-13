public class Auto extends Vehiculo{
    private int numeroDePuertas;
    public  Auto(String marca, String modelo, int anio, int numeroDePuertas){
        super(marca, modelo, anio);
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println(" Marca: "+marca+ " Modelo: "+modelo+" Anio: "+ anio+" Velocidad Actual:  "+getVelocidadActual());
    }
}
