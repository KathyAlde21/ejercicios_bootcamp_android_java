package clase14appmov;

import java.util.Scanner;

public class ArregloTipoString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
     //   String nombre[] = new String [5];
        String nombres[] = {"Corre Caminos", "Pato Lucas", "Chavo", "Tom", "Jerry"};
        
        for (String e : nombres) {
          //  System.out.println(e); //los muestra igual hacia abajo
            System.out.println(e.toUpperCase()); //los muestra en mayuscula
        }
        
    }
  
}
