
package clase20appmov.dependencias;

public class Main {
    
    public static void main(String[] args) {
        
        Auto auto1 = new Auto(new MotorGasolina());
        Auto auto2 = new Auto(new MotorElectrico());
        
        auto1.mover();
        System.out.println("---------");
        auto2.mover();
        
    }
    
}
