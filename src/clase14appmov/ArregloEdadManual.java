package clase14appmov;

import java.util.Scanner;

public class ArregloEdadManual {
    /*
    Desarrolle un programa que muestre la declaración, creación, inicialización y
    consulta de un arreglo llamado edad
    El arreglo debe tener 3 posiciones de tipo entero
    El ingreso de los datos puede ser manual o con números al azar
    */
    public static void main(String[] args) {
        //inicializando scanner
        Scanner input = new Scanner(System.in);
        int edad[] = new int[3];
        
        //creo la variable en la estructura y la puedo usar en cada for independiente
        //pide los 3 datos
        for (int i = 0; i < edad.length; i++) {
            System.out.println("Ingresa una edad");
            edad[i] = input.nextInt();
        }
        
        //por estetica para separar
        System.out.println("--------");
        
        //muestra los 3 datos
        for (int i = 0; i < edad.length; i++) {
            System.out.print(edad[i] + " "); //saco ln para que quede en una línea
         //   System.out.println(edad[i]);
        } 
        
    }
    
}
