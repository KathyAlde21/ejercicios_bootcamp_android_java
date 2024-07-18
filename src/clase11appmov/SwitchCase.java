package clase11appmov;

public class SwitchCase {
    public static void main(String[] args) {
        
        int num = 3;
        
    //es la forma más usada, aun cuando java ofrece el cambio
        switch (num){
            case 1:
                System.out.println("Es el 1");
                break;
            case 2:
                System.out.println("Es el 2");
                System.out.println("bloque más grande");
                break;
            case 3:
                System.out.println("Es el 3");
                break;
            default:
                System.out.println("No es una opcion valida");
        }
             
      /*  //ahora cuando lo escribo asi java me ofrece el cambio y queda asi
        switch (num){
            case 1 -> System.out.println("Es el 1");
            case 2 -> {
                System.out.println("Es el 2");
                System.out.println("bloque más grande");
            }
            case 3 -> System.out.println("Es el 3");
            default -> System.out.println("No es una opcion valida");
        }*/
                
                
    }
 
}
