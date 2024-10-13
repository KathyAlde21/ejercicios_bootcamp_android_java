
package clase20appmov.principioabiertocerrado;

public class PayPal extends MetodoDePago{
    
    public PayPal(double monto, double recargo) {
        super(monto, recargo);
    }
    
    @Override
    public void pagar() {
        // Modifico la logica segun lo requerido para pagar con PayPal
    }
}
