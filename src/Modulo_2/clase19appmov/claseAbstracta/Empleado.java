
package Modulo_2.clase19appmov.claseAbstracta;


abstract class Empleado {
    
    private String nombre;
    private int salario;
    
    public Empleado(
            String nombre,
            int salario
    ){
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public abstract void trabajar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    //---------------------------
    public String mostrarDatos(){
        return this.nombre + " - " + this.salario;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + '}';
    }

}
