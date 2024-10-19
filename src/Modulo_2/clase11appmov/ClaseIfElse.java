package Modulo_2.clase11appmov;

public class ClaseIfElse {

    public static void main(String[] args) {
        
        int a = 30;
        int b = 30;
        int c = 12;
        
        //ejemplo clásico if
      /*  if (a == b) {
            System.out.println("Soy un bloque true");
        } else {
            System.out.println("Soy un bloque false");
        } */
        
      
        //ejemplo if else anidado
        if (a == b) {
            if (a > c) {
                System.out.println("Soy un bloque anidado mayor");
            } else {
                System.out.println("Soy un bloque anidado menor");
            }
        } else if (a == c) {
            System.out.println("Soy un bloque if else");
        } else {
            System.out.println("Soy un bloque false");
        }

        
     /* -------------------------------------------------------- */   
       //OPERADOR TERNARIO 
       //otra forma de if - else
       String mensaje = (a == b) ? "Soy un bloque true" : "Soy un bloque false";
       System.out.println(mensaje);
        
    }
    
}
