package Modulo_2.clase13appmov;

import java.util.Scanner;

public class Ejercicio1 {
    /*
    Desarrolla un programa en Java que pida al usuario ingresar
    un número entero y deterine si es un número o no        
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //para pedir un dato en consola siempre uso scanner
        
        System.out.println("Ingresa un numero entero: ");
        int num = input.nextInt(); //para almacenar mi variable
        
        int divisor = 2;
        boolean esPrimo = true;
        
        //CICLO PARA DETERMINAR PRIMO
        while (divisor < num) { //para calcular debo definir
            if (num % divisor == 0) {
                esPrimo = false;
            }
            divisor++;
        }
        
        //VALIDANDO
        if (esPrimo) {
                System.out.println("Es un número primo");
        } else {
            System.out.println("No es un número primo");
        }
        
    }
}
