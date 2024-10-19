
package Modulo_2.clase30appmov;

public class Squirtle extends Pokemon implements IAgua{
    
    public Squirtle() {}

    @Override
    protected void ataquePlacaje() {
        System.out.println("Ataque Placaje efectuado");
    }

    @Override
    protected void ataqueAraniazo() {
        System.out.println("Ataque Araniazo efectuado");
    }

    @Override
    public void ataqueBurbuja() {
        System.out.println("Ataque Burbuja efectuado");
    }

    @Override
    public void ataqueSalpicar() {
        System.out.println("Ataque Salpicar efectuado");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Squirtle - Pokemon Tipo Agua");
        return sb.toString();
    }
}
