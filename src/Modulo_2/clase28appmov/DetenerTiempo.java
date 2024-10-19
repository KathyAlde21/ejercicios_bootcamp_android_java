
package Modulo_2.clase28appmov;

/*
 * PARANDO EL TIEMPO
 *
 * Enunciado: Crea una función que sume 2 números y retorne su resultado pasados unos segundos.
 * - Recibirá por parámetros los 2 números a sumar y los segundos que debe tardar en finalizar su ejecución.
 * - Se debe retornar el resultado de forma asíncrona, 
 *   es decir, sin detener la ejecución del programa principal. 
 *
 */

public class DetenerTiempo {
    
    public static void main(String[] args) {
     
        detener(1, 3, 10);
        detener(5, 2, 5);
        detener(5, 5, 1);
        
    }
    
    
    public static void detener(int num1, int num2, int segundos) {
        new Thread(() -> {
           try {
               Thread.sleep(segundos * 1000);
               System.out.println(num1 + num2);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        }).start();
    }
}
