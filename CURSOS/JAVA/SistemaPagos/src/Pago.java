public abstract class Pago {
        private double monto;

        public Pago(double monto) {
            this.monto = monto;
        }
    abstract void procesarPago();

}
