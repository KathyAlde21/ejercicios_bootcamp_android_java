package Modulo_2.clase14appmov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListasTerminal {
    public static void main(String[] args) {
         
        //CREAR LISTA
        List<String> ciudades = new ArrayList <>(); //tiene indice asi que parte de 0

        Scanner input = new Scanner(System.in);
        
        int contador = 0;
        String nuevaCiudad = "";
        
        //llenar la lista
        while (contador < 3) {
            System.out.println("Ingresa una ciudad");
            //si dejo solo next y es ciudad con nobre compuesto como San Ramon los separa en dos ciudades
            nuevaCiudad = input.nextLine(); 
            ciudades.add(nuevaCiudad);
            contador++;     
        }
        
        System.out.println(" ------- "); //para separar y que se vea ordenado
        //ordenar la lista
        Collections.sort(ciudades); //para que las ordene por alfabeto - 100% opcional
        
        //mostrar la lista
        for (String e : ciudades) {
            System.out.println(e);
            
        }
        
    }
}
