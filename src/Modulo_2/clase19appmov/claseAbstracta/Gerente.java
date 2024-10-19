
package Modulo_2.clase19appmov.claseAbstracta;

public class Gerente extends Empleado{
    
    private int idGerente;
    
    public Gerente(int idGerente, String nombre, int salario){
        super(nombre, salario);
        this.idGerente = idGerente;
    }

    public int getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(int idGerente) {
        this.idGerente = idGerente;
    }

    @Override
    public String toString() {
        return "Gerente{" + "idGerente=" + idGerente + '}';
    }
    
    
    
    public void trabajar(){
        System.out.println("El gerente " + getNombre() + " esta supervisando a"
                + " los trabajadores");
    }
    
}
