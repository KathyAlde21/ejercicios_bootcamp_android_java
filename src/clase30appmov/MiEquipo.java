
package clase30appmov;

import java.util.ArrayList;
import java.util.List;

public class MiEquipo {
    
    private final List<Pokemon> miEquipo;
    
    public MiEquipo() {
        miEquipo = new ArrayList<>();
    }
    
    public void agregarPokemon(Pokemon pokemon) {
        miEquipo.add(pokemon);
    }
    
    public void mostrarEquipo() {
        for (Pokemon e : miEquipo) {
            System.out.println(e);
        }
    }
}
