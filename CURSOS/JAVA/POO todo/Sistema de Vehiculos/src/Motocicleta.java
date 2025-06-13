public class Motocicleta extends Vehiculo{
    private String tipoDeManillar;
    public Motocicleta(String marca, String modelo, int anio, String tipoDeManillar){
        super(marca, modelo,anio);
        this.tipoDeManillar = tipoDeManillar;
    }
    @Override
    public void mostrarDetalles(){
        System.out.println("Marca: "+marca + "Modelo: "+modelo +"Anio: "+ anio +"Velocidad Actual: "+getVelocidadActual());
    }
}
