package Modulo_2.clase12appmov;

public class CicloForEach {
    public static void main(String[] args) {
        
       //se especializa en recorrer datos
       String[] ciudades = {"Santiago", "Concepción", "Antofagasta", "Talca", "Punta Arenas"};
       
       for (String e : ciudades){ //e por element, puedo poner la letra o frase que quiera
           System.out.println(e);
       }
        
    }
}
