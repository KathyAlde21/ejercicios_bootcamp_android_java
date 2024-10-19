
package Modulo_2.clase30appmov;

public class App {
    
    public static void main(String[] args) {
        //System.out.println("Hola Mundo");
        
        Charmander charmander = new Charmander();
        Squirtle squirtle = new Squirtle();
        
        charmander.ataqueAraniazo();
        charmander.ataqueLanzaLlamas();
        squirtle.ataqueBurbuja();
        squirtle.ataquePlacaje();
        
        
        MiEquipo listaEquipo = new MiEquipo();
        
        listaEquipo.agregarPokemon(charmander);
        listaEquipo.agregarPokemon(squirtle);
        
        listaEquipo.mostrarEquipo();
        
        
    }
}
