/*
- Desarrolle un programa que asigne notas basadas en la puntuación de un examen.
- Para obtener una calificación “Sobresaliente” debe obtener una puntuación del 90%
o superior, un “Notable” se obtiene con el 80% o superior, “Bien” se obtiene con una
nota superior a 70% y un “Suficiente” con un puntaje de 60% o superior.
- En cualquier otro caso, se obtiene una calificación “insuficiente”.
*/
package clase11appmov;

public class EjercicioClaseNotas {

    public static void main(String[] args) {
       //preguntando de forma directa
        int nota = 40;
        
        if (nota >= 90) {
            System.out.println("Obtuvo un calificación Sobresaliente");
        } else if (nota >= 80) {
            System.out.println("Obtuvo un calificación Notable");
        } else if (nota >= 70) {
            System.out.println("Obtuvo un calificación Bien");
        } else if (nota >= 60){
            System.out.println("Obtuvo un calificación Suficiente");
        } else {
            System.out.println("Obtuvo un calificación Insuficiente");
        }
    }

    
}
