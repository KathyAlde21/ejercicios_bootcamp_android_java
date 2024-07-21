package clase13appmov;

import java.util.Scanner;

public class Ejercicio3 {
    /*
    Crea un programa en Java que solicite números al usuario y
    muestre su suma. El programa debe continuar solicitando
    números hasta que el usuario ingrese 0. Cuando el programa
    finalice, mostrará "Suma Completa"
    */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = 0;
        int suma = 0;
        
        //como necesito el bucle vigente hasta que ingrese un 0 debo poner el validador
        //abajo y solo sirve un do - while
        do {
            System.out.println("Ingresa un numero"); 
            num = input.nextInt();
            
            if (num != 0){
                System.out.println(suma + " + " + num + ": ");
                suma += num;
                System.out.println(suma);
            }
            
        } while(num !=0);
        
        
    }
}
