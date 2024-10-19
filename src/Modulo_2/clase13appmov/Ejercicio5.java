package Modulo_2.clase13appmov;

import java.util.Scanner;

public class Ejercicio5 {
    /*
    Crea un pequeño programa que permita al usuario ingresar una palabra o una frase
    Almacena el dato en una variable
    Utiliza los conocimientos aquiridos para invertir el texto letra por letra y almacenar el dato en una
    nueva variable. Ej: hola mundo -> odnum aloh
    */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String invertida = "";
        
        System.out.println("Ingresa una frase");
        String frase = input.nextLine();
        
        for (int i = frase.length() -1 /*porque así parto en el 0*/; i >= 0; i--) { //no sé el tamaño y por eso parto midiendolo
            invertida += frase.charAt(i); //guardo y sigo
        }
        
        System.out.println(invertida);

    }

}
