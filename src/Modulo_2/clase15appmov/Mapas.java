package Modulo_2.clase15appmov;

import java.util.HashMap;
import java.util.Map;


public class Mapas {
    
    public static void main(String[] args) {
        //Creando un mapa
        Map<Integer, String> ciudades = new HashMap<>();  //integer es para entero
        
        //agregar datos a Mapa
        ciudades.put(10, "Santiago");
        ciudades.put(5, "Valparaiso");
        ciudades.put(25, "Linares");
        
        //ver datos
        System.out.println(ciudades);
        //ver dimension
        System.out.println(ciudades.size());
        System.out.println("--- ---- ---");
        
        //obtener un valor o dato
        System.out.println(ciudades.get(5)); //elijo que mostrar, si pongo uno que no existe coloca null
        System.out.println("--- ---- ---");
                
        //verificar si la llave existe
        System.out.println(ciudades.containsKey(6)); //contenido llave -- muestra booleano
        
        //eliminar un dato
        ciudades.remove(5);
        System.out.println(ciudades);
        System.out.println("--- ---- ---");
        
        //RECORRER UN MAPA
        for (Map.Entry<Integer, String> e : ciudades.entrySet()) {
            System.out.println(e);
        }      
    }
 
}
