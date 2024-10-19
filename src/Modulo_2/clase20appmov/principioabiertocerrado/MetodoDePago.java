
package Modulo_2.clase20appmov.principioabiertocerrado;

public class MetodoDePago {
    
    private double monto;
    private double recargo;
    
    public MetodoDePago(
            double monto,
            double recargo
    ) {
        this.monto = monto;
        this.recargo = recargo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }
      
    public void pagar() {
        // Forma base de pagar en efectivo.
    }
}
