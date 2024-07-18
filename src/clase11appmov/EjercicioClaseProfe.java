/*
- Desarrolle un programa que asigne notas basadas en la puntuación de un examen.
- Para obtener una calificación “Sobresaliente” debe obtener una puntuación del 90%
o superior, un “Notable” se obtiene con el 80% o superior, “Bien” se obtiene con una
nota superior a 70% y un “Suficiente” con un puntaje de 60% o superior.
- En cualquier otro caso, se obtiene una calificación “insuficiente”.
*/
package clase11appmov;

import java.util.Scanner;

public class EjercicioClaseProfe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa el puntaje del alumno: ");
        int puntaje = input.nextInt();
        
        String nota = "";
        
        if (puntaje >= 90 && puntaje <= 100) {
            nota = "Sobresaliente";
        } else if (puntaje >= 80 && puntaje <90) {
            nota ="Notable";
        } else if (puntaje >= 70 && puntaje <80) {
            nota = "Bien";
        } else if (puntaje >= 60 && puntaje <70){
            nota ="Suficiente";
        } else if ( puntaje >100) {
            nota = "Puntaje no valido";
        } else {
            nota ="Insuficiente";
        }
        
        System.out.println("La nota es: " + nota);
    }
}
