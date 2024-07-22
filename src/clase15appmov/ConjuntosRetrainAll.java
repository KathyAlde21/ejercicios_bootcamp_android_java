package clase15appmov;

import java.util.HashSet;
import java.util.Set;

public class ConjuntosRetrainAll {
    /*
    Crea dos conjuntos con datos ingresados manualmente
    Encuentra los elementos comunes entre ambos cojuntos y almacenalos en uno nuevo
    Tip: prueba utilizando la función retainAll
    */
    
    public static void main(String[] args) {
      
        //Creando dos conjuntos vacios
        Set<Integer> conjunto1 = new HashSet<>();  //integer es para entero
        Set<Integer> conjunto2 = new HashSet<>();  
        
    // probando que funciona ingresando manual - ingresando repetidos entre ambos
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);
        
        conjunto2.add(2);
        conjunto2.add(3);
        conjunto2.add(4);
        
        System.out.println(conjunto1);
        System.out.println(conjunto2);
        System.out.println("--- --- ---");
        
        conjunto1.retainAll(conjunto2); //compara y deja solo los que estan repetidos entre los dos
        
        for (Integer e : conjunto1) {
            System.out.println(e);
        }
        System.out.println("--- --- ---");

        System.out.println(conjunto1);
        System.out.println(conjunto2);
    }
         
}
