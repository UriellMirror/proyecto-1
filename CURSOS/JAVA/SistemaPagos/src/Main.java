//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       //Pago[] pagos = new Pago[3];
       // pago[0] = new PagoTarjeta(102.1);
  // ************** usaremos la forma tipo[] array =  { atributos, atributos}
        Pago[] pagos = {
                new PagoTarjeta(121.0),
                new PagoPaypal(150.0),
                new PagoPaypal(78.12),
                new PagoTarjeta(1000.99)

        };

        for (Pago variable : pagos){
            variable.procesarPago();
            if(variable instanceof PagoTarjeta){
                ((PagoTarjeta)variable).procesarPago();
            }else if (variable instanceof PagoPaypal){
                ((PagoPaypal)variable).procesarPago();
            }
        }

    }
}