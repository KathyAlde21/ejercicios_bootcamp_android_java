package Modulo_2.clase14appmov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        
        //CREAR LISTA
        List<String> ciudades = new ArrayList <>(); //tiene indice asi que parte de 0
        
        //AGREGAR DATOS
        ciudades.add("Talca"); //add es para almacenar elementos
        ciudades.add("Santiago");
        ciudades.add("Iquique");
        ciudades.add("Punta Arenas");
        
        
        //mostrar la lista
       /* for (String e : ciudades) {
            System.out.println(e);  
        } */
        
        //obtener las dimensiones de la lista
        System.out.println(ciudades.size()); //cuenta los datos
        
        //obtener solo un elemento
        System.out.println(ciudades.get(2));
        
        //eliminar un elemento PUEDE SER POR INDICE O PALABRA
        ciudades.remove(1); //borro Santiago
//        ciudades.remove("Talca"); //borra Talca pero solo la primera que ve, si hay varias borra solo 1
//        System.out.println(ciudades.get(1)); //antes Santiago, ahora Iquique
//        System.out.println(ciudades.size());
        
        //modificar un elemento
        ciudades.set(1, "Antofagasta");
//        System.out.println(ciudades.get(1));
       /* for (String e : ciudades) {
            System.out.println(e);  
        } */
        
        //ordenar la lista
        Collections.sort(ciudades);
        
       //mostrar la lista
        for (String e : ciudades) {
            System.out.println(e);
            
        }
        
        //BORRAR DATOS DE LA LISTA POST CREACION
        ciudades.clear();
        System.out.println("Se borro todo");
        
    }
}
