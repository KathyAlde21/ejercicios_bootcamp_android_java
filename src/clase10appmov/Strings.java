package clase10appmov;

public class Strings {

    public static void main(String[] args) {
        String  cadena = "Hola Mundo";
        String cadena2 = "Hola Mundo";
        String cadena3 = "hoLa mUNdo";  //ignore case omite diferencia en escritura
        String cadena4 = "hoLa mUNdo "; //espacio al final
        
        //al anotar en cadena un punto al lado me muestra una lista gigante de opciones para continuar
        //eso con todos los string
        int longitud = cadena.length(); //cuenta hasta los espacios
        char letra = cadena.charAt(0);
        
        String substring = cadena.substring(0, 7);
        
        //BADENA BOOLEANOS:
        boolean sonIguales = cadena.equals(cadena2); //arroja error
        boolean sonIgualesDos = cadena.equalsIgnoreCase(cadena3); //arroja error
        boolean sonIgualesTres = cadena.equalsIgnoreCase(cadena4);
        
        //LLAMANDO STRINGS
        System.out.println(cadena);
        System.out.println(longitud);
        System.out.println(letra);
        System.out.println(substring);
        System.out.println(sonIguales);
        System.out.println(sonIgualesDos);
        System.out.println(sonIgualesTres);
        System.out.println("");
        
    /* ------------------------------------------------------------------------------------  */

        //REEMPLAZAR - CONVERTIR TEXTO EN NUMERO
        //reemplazar un caracter o cadena completa
        String nuevaCadena = cadena.replace("o", "0");
        
        
        //convertir texto en entero Int
        String cadenaNum = "30";
        int nuevoNumero = Integer.parseInt(cadenaNum); //con esto lo cambio
        int num = 20;  
                
        //convertir texto en número de doble presición 
        String nuevoDato = Integer.toString(num); //puedo convertir numero a string
        String nuevoDato2 = String.valueOf(num);
  
        
        //LLAMANDO STRINGS REEMPLAZAR - CONVERTIR
        System.out.println(nuevaCadena);
        System.out.println(cadenaNum + num); //concateno en vez de sumar
        System.out.println(nuevoNumero + num); //sumo luego de la conversión = 50
        System.out.println(nuevoNumero + nuevoDato); //3020
        System.out.println(nuevoNumero + nuevoDato2); //3020
        System.out.println("");

/* ------------------------------------------------------------------------------------  */
        //estructura tipo objeto, solo como ejemplo
        System.out.println(((Object)nuevoDato).getClass().getSimpleName()); //string
        System.out.println(((Object)num).getClass().getSimpleName()); //Integer
        System.out.println(((Object)letra).getClass().getSimpleName()); //Character
        System.out.println("");
        
        
/* ------------------------------------------------------------------------------------  */
   //FORMAT
    int edad = 30;
    String nombre = "Goku";
    
    System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años");
    
    String mensaje = String.format("Hola, mi nombre es %s y tengo %d años", nombre, edad);
    System.out.println(mensaje);
    System.out.println("");
    
    //CONTAINS => dato booleano
    boolean contieneDato = cadena.contains("mundo");
    System.out.println(contieneDato); //false
    boolean contieneDato2 = cadena.contains("Mundo");
    System.out.println(contieneDato2); //true

    //TOUPPER Y TOLOWER CASE => sirven para convertir antes de comparar
    System.out.println(cadena.toUpperCase()); //le digo convierte todo a mayuscula
    System.out.println(cadena.toLowerCase()); //le digo convierte todo a minuscula

        
    }
}
