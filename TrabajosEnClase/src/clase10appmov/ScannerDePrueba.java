package clase10appmov;

//importar el objeto SIEMPRE ES LA MISMA FRASE

//si anoto: scanner input =... me la reclama y ofrece crearla con alt+enter sobre scanner
import java.util.Scanner;

public class ScannerDePrueba {
    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);
    
        System.out.println("Ingresa tu nombre");
        String nombre = input.next();  
        
        System.out.println(nombre); //deja ingresar en terminal y lo guarda de forma temporal

        input.close(); //es opcional, por si lo quiero cerrar
    }
}
        
