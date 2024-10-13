
package clase20appmov.dependencias;

public class Auto {
    
    private IMotor motor;
    
    public Auto(IMotor motor) {
        this.motor = motor;
    }
    
    public void mover() {
        motor.arrancar();
        System.out.println("El auto esta en movimiento");
    }
    
}
