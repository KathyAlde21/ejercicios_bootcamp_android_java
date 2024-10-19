package Modulo_2.clase15appmov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ejListaNumerosAzar {
    /*
    Crea una lista de 10 números ingresados al azar. Ordena la lista.
    Pide al usuario que ingrese un número límite inferior y otro superior.
    Considerando el límite, elimina todos los elementos de la lista que no se encuentren dentro de su rango
    */
    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>();
        
      //para pedir por consola
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la dimension que tendra tu lista");
       
       //iniciando datos
        int dimension = input.nextInt();
        int nRandom = 0;
        
        //Delimito los datos entregados y lo dejo al azar
        for (int i = 0; i < dimension; i++) {
            nRandom = (int)(Math.random()*100);
            numeros.add(nRandom);         
        }
        
        System.out.println("----- ---- ----- ");
        
        //los pide ordenados
        Collections.sort(numeros);
        
        //leyendo datos
        for (Integer e : numeros) {
        //    System.out.print(e + " "); //alineados, me gusta más
            System.out.println(e);
        }
        
        System.out.println("----- ---- ----- ");
        
    /* --------------------------------------------------------------- */    
        //ingresar limite inferior y superior - muestro
        System.out.println("Ingresa el numero menor del rango");
        int nMenor = input.nextInt();
        
        System.out.println("Ingresa el numero mayor del rango");
        int nMayor = input.nextInt();
        
        System.out.println("----- ---- ----- ");
        
        //eliminar todo lo que no este en ese rango debo tener cuidado
        //anotar desde el último hacia adelante porque los va a ir movieno y si lo hago al reves se salta espacios
        for (int i = numeros.size() - 1; i >= 0; i--) { //no olvidar -1´para partir en 1
            if (numeros.get(i) < nMenor || numeros.get(i) > nMayor) {
                numeros.remove(i);
            }   
        }
        
      /* //esto elimina desde el 0 pero cada vez que borra 1 sigue y se salta uno
        //el cero es otro pero no lo evalua porque ya en uno, deja un desastre
        for (int i = 0; i < numeros.size() - 1; i++) {
             if (numeros.get(i) < nMenor || numeros.get(i) > nMayor) {
                numeros.remove(i);
            } 
        }*/
        
        for (Integer e : numeros) {
            System.out.println(e);
        }
   
    }
}
