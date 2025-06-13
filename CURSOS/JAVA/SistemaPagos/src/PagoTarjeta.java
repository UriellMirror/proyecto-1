public  class PagoTarjeta extends Pago {

    public PagoTarjeta(double monto){
        super(monto);
    }
    @Override
    void procesarPago(){
        System.out.println("Procesando pago Tarjeta");
    }
    public void implementarTarjeta(){
        System.out.println("Validando Tarjeta");
    }

}
