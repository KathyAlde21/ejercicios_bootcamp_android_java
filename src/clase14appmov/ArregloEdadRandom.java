package clase14appmov;

import java.util.Scanner;

public class ArregloEdadRandom {
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
        
        //para crear un entero al azar se anota
      //  System.out.println((int)(Math.random()*100));
        
      /*
      //TRES NUMEROS AL AZAR ENTRE 1 Y 99
        for (int i = 0; i < edad.length; i++) {
            edad[i] = (int) (Math.random()*100); //pido numeros al azar entre 1-99
       //     System.out.println(edad[i]);
            System.out.print(edad[i] + " ");
        }
      */
        
        //NUMEROS ENTRE 10 Y 40
        for (int i = 0; i < edad.length; i++) {
            edad[i] = (int) (Math.random()* (40 - 10) + 10); //(max - min) + min
            System.out.println(edad[i]);
           // System.out.print(edad[i] + " ");
        }
        
    }
  
}
