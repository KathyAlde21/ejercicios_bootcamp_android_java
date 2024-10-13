
package clase29appmov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cifradoCesar {
    
    public static void main(String[] args) {
        cifrado("pizza", false, 3);
        cifrado("tmdde epxs 3", true, 3);
    }
      
    
    public static void cifrado(String texto, boolean encriptado, int salto) {
        
        List<Character> alfabeto = new ArrayList<>(Arrays.asList(
               'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
               'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
               'u', 'v', 'w', 'x', 'y', 'z' 
        ));
        
        StringBuilder textoCesar = new StringBuilder();
        
        for (char valor : texto.toLowerCase().toCharArray()) {
            if (alfabeto.contains(valor)) {
                int indice = (alfabeto.indexOf(valor) + (encriptado ? -salto : salto)) % alfabeto.size();
                if (indice < 0) {
                    indice += alfabeto.size();
                }
                textoCesar.append(alfabeto.get(indice));
            } else {
                textoCesar.append(valor);
            }
        }
        
        System.out.println(textoCesar.toString());
    }
}
