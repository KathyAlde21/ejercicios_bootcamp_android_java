/*
Tomemos de base el ejercicio anterior y cambiemos un poco su funcionamiento.
Pide al usuario que ingrese el nombre del día de la semana.
Devuelve por consola una respuesta correspondiente a:
- Inicio de semana.
- Mediados de semana.
- Último día de la semana.
- Fin de semana.
Ten en cuenta que el usuario puede ingresar el nombre tanto en mayúsculas como minúsculas.
*/

package Modulo_2.clase11appmov;

import java.util.Scanner;

public class EjercicioClaseSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa el día de la semana: ");  
        String dia = input.next().toLowerCase(); //todo lo va a convertir a minuscula
                
    /*    switch (dia) {
            case "lunes":
                System.out.println("Inicio de semana");
                break;
            case "martes", "miercoles", "jueves":
                System.out.println("Mediados de semana");
                break;
            case "viernes":
                System.out.println("Ultimo dia de la semana");
                break;
            case "sabado", "domingo":
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("El dato ingresado es invalido");
                break;          
        } */
    
     switch (dia) {
        case "lunes" -> System.out.println("Inicio de semana");
        case "martes", "miercoles", "jueves" -> System.out.println("Mediados de semana");
        case "viernes" -> System.out.println("Ultimo dia de la semana");
        case "sabado", "domingo" -> System.out.println("Fin de semana");
        default -> System.out.println("El dato ingresado es invalido");       
        }
        
    }
    
}
