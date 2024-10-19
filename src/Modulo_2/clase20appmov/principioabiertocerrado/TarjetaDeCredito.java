
package Modulo_2.clase20appmov.principioabiertocerrado;

public class TarjetaDeCredito extends MetodoDePago{
    
    private int numeroTarjeta;

    public TarjetaDeCredito(
            double monto,
            double recargo,
            int numeroTarjeta
    ) {
        super(monto, recargo);
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
    
    
    @Override
    public void pagar() {
        super.pagar();
        // Aplicamos nueva logica de pago para una tarjeta.
    }
}
