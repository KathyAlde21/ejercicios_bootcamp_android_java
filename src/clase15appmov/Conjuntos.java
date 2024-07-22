package clase15appmov;

import java.util.HashSet;
import java.util.Set;

//CONJUNTOS:
//no permiten duplicados, útiles cuando se necesita exclusivamente datos únicos

public class Conjuntos {
    public static void main(String[] args) {
        
        //Crear un conjunto
        Set<String> ciudades = new HashSet<>();
        
        //System.out.println(ciudades); //muestra [] indicando que está vacío
        
        //Agrega datos al conjunto
        ciudades.add("Santiago");
        ciudades.add("Rancagua");
        ciudades.add("Punta Arenas");
        ciudades.add("Talca");
        ciudades.add("Santiago"); //puedo ingresar dos veces pero no lo agrega ni lo suma
        
//        System.out.println(ciudades); //coloca todo en un array[]
        
        for (String e : ciudades) {
            System.out.print(e + " ");
        }
        System.out.println(" ");
        System.out.println(" ---- ---- ----");
        
        //Verificar si mi dato existe o no
        System.out.println(ciudades.contains("Rancagua")); //devuelve booleano => true
        
        //Eliminar un dato
        ciudades.remove("Rancagua");
        
        //Obtenerdimension de mi conjunto
        System.out.println(ciudades.size()); //3 porque borre Rancagua y lee Santiago 1 vez
        
        System.out.println(" ---- ---- ----");
        
        //Recorrer mi cojunto
        for (String e : ciudades) {
            System.out.println(e);
        }
        
        System.out.println(" ---- ---- ----");

        
        //Vaciar por completo el conjunto
        ciudades.clear();
        
        System.out.println(ciudades); //[] array vacio porque borro todo 
        //si comento hacia arriba todo después de los add, no quedo nada 
        
    }
}
