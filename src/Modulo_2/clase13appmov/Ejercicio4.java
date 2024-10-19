package Modulo_2.clase13appmov;

import java.util.Scanner;

public class Ejercicio4 {
    /*
    Crea un programa que pida ingresar por teclado una frase o palabr
    Con ayuda de un ciclo cuenta cuántas vocales hay en la frase/palabra recién ingresada
    chartAT y length pueden ayudar a resolverlo
    */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //para pedir un dato en consola siempre uso scanner
        String palabra = "";
        //para ver más rápido de a una se declararon una a una, se uso c por contador
        int cA = 0, cE = 0, cI = 0, cO = 0, cU = 0; 
        
      //charAT busca y length mide
        do {
           System.out.println("Ingresa una frase o palabra: "); 
           palabra = input.nextLine().toLowerCase(); //almaceno la palabra y la convierto en minuscula
           
           if (!palabra.isBlank()){ //cuando no este vacio
               
               for (int i = 0; i < palabra.length(); i++){
                    switch (palabra.charAt(i)){ 
                        case 'a':
                            cA++;
                            break;
                        case 'e':
                            cE++;
                            break;
                        case 'i':
                            cI++;
                            break;
                        case 'o':
                            cO++;
                            break;
                        case 'u':
                            cU++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
               System.out.println("No ingreses un campo sin texto");
           }
           
        } while (palabra.isBlank());
        
        System.out.println("La cantidad de vocales son: ");
        System.out.println("A: " + cA);
        System.out.println("E: " + cE);
        System.out.println("I: " + cI);
        System.out.println("O: " + cO);
        System.out.println("U: " + cU);

    }
}
