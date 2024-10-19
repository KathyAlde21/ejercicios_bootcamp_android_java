
package Modulo_2.clase28appmov;

/*
 * ENCRIPTADO KARACA
 *
 * Enunciado: Crea una función que sea capaz de encriptar y desencriptar texto utilizando el
 * algoritmo de encriptación de Karaca.
 *
 */

public class Karaca {
    
    public static void main(String[] args) {
        System.out.println(karaca("hola mundo grupo vespertino "
                + "android", false));
        System.out.println(karaca("0l3haca 3dn4maca 3p4rgaca "
                + "3n2tr1ps1vaca d23rdn0aca ", true)); 
    }
    
    public static String karaca(String cadena, boolean isKaraca) {
        StringBuilder resultado = new StringBuilder();
        
        for (String palabra : cadena.toLowerCase().split(" ")) {
            if (!isKaraca) {
                resultado.append(new StringBuilder(palabra)
                        .reverse()
                        .toString()
                        .replace("a", "0")
                        .replace("e", "1")
                        .replace("i", "2")
                        .replace("o", "3")
                        .replace("u", "4"))
                        .append("aca ");       
            } else {
                resultado.append(new StringBuilder(palabra)
                        .reverse()
                        .toString()
                        .replace("0", "a")
                        .replace("1", "e")
                        .replace("2", "i")
                        .replace("3", "o")
                        .replace("4", "u")
                        .substring(3))
                        .append(" ");
            }
        }
        
        return resultado.toString();
    }
    
}
