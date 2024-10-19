
package Modulo_2.clase29appmov;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class generarPass {
    
    public static void main(String[] args) {
        //System.out.println("Hola Mundo");
        System.out.println(generar(15, false, false, true));
        
    }
       
    
    public static String generar(
            int largo, 
            boolean mayus, 
            boolean num, 
            boolean sim
    ) {        
        List<Integer> caracteres = new ArrayList<>(); 
        
        // Minúsculas
        for (int i = 97; i <= 122; i++) {
            caracteres.add(i);
        }
        
        // Mayúsculas
        if (mayus) {
            for (int i = 65; i <= 90; i++) {
                caracteres.add(i);
            }
        }
       
        
        // Simbolos
        if (sim) {
            for (int i = 33; i <= 47; i++) {
                caracteres.add(i);
            } 
            for (int i = 58; i <= 64; i++) {
                caracteres.add(i);
            }
            for (int i = 91; i <= 96; i++) {
                caracteres.add(i);
            }
            for (int i = 123; i <= 126; i++) {
                caracteres.add(i);
            }
        }
        
        // Números
        if (num) {
            for (int i = 48; i < 57; i++) {
                caracteres.add(i);
            }
        }
        
        
        
        StringBuilder pass = new StringBuilder();
        Random random = new Random();
        
        int largoFinal = largo < 8 ? 8 : Math.min(largo, 16);
        
        while (pass.length() < largoFinal) {
            int indiceRandom = random.nextInt(caracteres.size());
            pass.append((char) caracteres.get(indiceRandom).intValue());
        }
        
        return pass.toString();
    } 
}
