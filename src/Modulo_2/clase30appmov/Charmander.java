
package Modulo_2.clase30appmov;

public class Charmander extends Pokemon implements IFuego{
    
    @Override
    protected void ataquePlacaje() {
        System.out.println("Ataque Placaje efectuado");
    }

    @Override
    protected void ataqueAraniazo() {
        System.out.println("Ataque Araniazo efectuado");
    }

    @Override
    public void ataqueAscuas() {
        System.out.println("Ataque Ascuas efectuado");
    }

    @Override
    public void ataqueLanzaLlamas() {
        System.out.println("Ataque Lanza Llamas efectuado");
    }

    @Override
    public String toString() {
        return "Charmander - Pokemon Tipo Fuego";
    }
    
}
