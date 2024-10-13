
package clase28appmov;

/*
 * LA SUCESIÓN DE FIBONACCI
 *
 * Enunciado: Escribe un programa que imprima los 20 primeros números 
 * de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números 
 * en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *
 */

public class Fibonacci {    
    
/*    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        int numero = 20;
        for (int i = 0; i < numero; i++) {            
            System.out.println(fibonacci(i) + " "); 
        }
    }
    
    public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }        
        return fibonacci(num - 1) + fibonacci(num - 2);
    }*/
        
   public static void main(String[] args) {
        int n = 20; // Número de términos a imprimir
        int primerNum = 0;
        int segundoNum = 1;

        System.out.println("Los primeros " + n + " numeros de la sucesion"
                + " de Fibonacci son:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(primerNum + ", ");

            // Calcular el siguiente término
            int siguienteNum = primerNum + segundoNum;
            primerNum = segundoNum;
            segundoNum = siguienteNum;
        }
    }   
    
}
