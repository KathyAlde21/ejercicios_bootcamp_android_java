
package Modulo_2.clase28appmov;

import java.util.HashMap;
import java.util.Map;

/*
 * BATALLA POKÉMON
 * Enunciado: Crea un programa que calcule el daño de un ataque durante
 * una batalla Pokémon.
 * - La fórmula será la siguiente: daño = 50 * (ataque / defensa) * efectividad
 * - Efectividad: x2 (súper efectivo), x1 (neutral), x0.5 (no es muy efectivo)
 * - Sólo hay 4 tipos de Pokémon: Agua, Fuego, Planta y Eléctrico (buscar su 
 * efectividad)
 * - El programa recibe los siguientes parámetros:
 *  - Tipo del Pokémon atacante.
 *  - Tipo del Pokémon defensor.
 *  - Ataque: Entre 1 y 100.
 *  - Defensa: Entre 1 y 100.
 */

public class BatallaPokemon {
    
    public static void main(String[] args) {
        //System.out.println("Hola Mundo");
        System.out.println(batalla(TipoPokemon.AGUA, TipoPokemon.FUEGO, 80, 50));
        
    }
    
    // TIPOS DE POKEMON DISPONIBLES
    enum TipoPokemon {
        AGUA("Agua"),
        FUEGO("Fuego"),
        PLANTA("Planta"),
        ELECTRICO("Electrico");
        
        private final String nombre;
        
        TipoPokemon(String nombre) {
            this.nombre = nombre;
        }
        
        public String getNombre() {
            return nombre;
        } 
    }
    
    //------------------------------------------------------------
    // COMPRUEBA LA EFECTIVIDAD DE LOS TIPOS SOBRE OTROS
    static class Efectividad {
        TipoPokemon efectivo;
        TipoPokemon noEfectivo;
        
        Efectividad(TipoPokemon efectivo, TipoPokemon noEfectivo) {
            this.efectivo = efectivo;
            this.noEfectivo = noEfectivo;
        }
    }
    
    //------------------------------------------------------------
    // METODO PRINCIPAL QUE EJECUTA LA BATALLA
    private static Double batalla(
            TipoPokemon atacante, 
            TipoPokemon defensor, 
            int ataque, 
            int defensa
    ) {
        
        if (ataque <= 0 || ataque > 100 || defensa <= 0 || defensa > 100) {
            System.out.println("El valor de ataque o defensa no es un dato valido");
            return null;
        }
        
        Map<TipoPokemon, Efectividad> tabla = new HashMap<>();
        
        tabla.put(TipoPokemon.AGUA, new Efectividad(TipoPokemon.FUEGO, TipoPokemon.PLANTA));
        tabla.put(TipoPokemon.ELECTRICO, new Efectividad(TipoPokemon.AGUA, TipoPokemon.PLANTA));
        tabla.put(TipoPokemon.FUEGO, new Efectividad(TipoPokemon.PLANTA, TipoPokemon.AGUA));
        tabla.put(TipoPokemon.PLANTA, new Efectividad(TipoPokemon.AGUA, TipoPokemon.FUEGO));
        
        double efectividad = 1;
        
        if (atacante == defensor || tabla.get(atacante).noEfectivo == defensor) {
            efectividad = 0.5;
            System.out.println("No es muy efectivo");
        } else if (tabla.get(atacante).efectivo == defensor) {
            efectividad = 2;
            System.out.println("Es muy efectivo");
        } else {
            System.out.println("Es un ataque neutral");
        }
        
        return 50 * (double) ataque / defensa * efectividad;
        
    }
}
