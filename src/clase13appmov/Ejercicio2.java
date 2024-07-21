package clase13appmov;

public class Ejercicio2 {
    /*
    Crea un programa en Java que utilice un bucle for y variables char
    para mostrar las letras del abecedario en mayúsculas
    */
    
    public static void main(String[] args) {
        
        //al llamar en mayuscula las ordena en ese mismo formato, si la z es minuscula lo anota dos veces AZ y az
        for (char letra = 'A'; letra <= 'Z'; letra++) { 
            System.out.println(letra);
        }
    }
}
