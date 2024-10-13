
package clase29appmov;

public class excepcionZero {
    
    public static void main(String[] args) {
        //System.out.println("Hola Mundo");
        
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " 
                    + e.getClass().getSimpleName());
        }
        
        System.out.println("exploto!!!");
        
        
    }
}
