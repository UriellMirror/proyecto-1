public class PagoPaypal extends  Pago {
    public PagoPaypal(double monto){
        super(monto);

    }
    @Override
    public void procesarPago(){
        System.out.println("Procesando pago Paypal");

    }
    public void autenticarCuenta(){
        System.out.println("Se verifico la cuenta");
    }

}
