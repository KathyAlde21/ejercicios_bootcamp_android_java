
package clase20appmov.principioliskov;

public class Persona implements IPagar{
    
    private String nombre;
    private String apellido;
    private String rut;
    private int edad;
    private int cuentaRut;
    
    public Persona (){};

    public Persona(
            String nombre,
            String apellido,
            String rut,
            int edad,
            int cuentaRut
    ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.edad = edad;
        this.cuentaRut = cuentaRut;
    }

    //-------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCuentaRut() {
        return cuentaRut;
    }

    public void setCuentaRut(int cuentaRut) {
        this.cuentaRut = cuentaRut;
    }

    //-----------------
    @Override
    public void pagar(){
        //logica de pago
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + ", edad=" + edad + ", cuentaRut=" + cuentaRut + '}';
    }
    
    
    
}
