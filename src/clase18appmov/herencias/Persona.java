
package clase18appmov.herencias; //herencia y poliformismo

//puedo traer la interface IDatos desde el otro paquete automaticamente
//primero escribir implements y luego agregar con autocompletado
import clase18appmov.interfaces.IDatos;

public class Persona implements IDatos { //uno IDatos a Persona
    
    //atributos y constructores
    private String nombre;
    private String apellido;
    private String rut;
    private int edad;
    
    public Persona () {};
    
    public Persona (
            String nombre,
            String apellido,
            String rut,
            int edad
    ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.edad = edad;
    }

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
    
    //-----------------------------------------    
    //Metodo Creado
    @Override //por IDatos
    public void mostrarDatos () {
        System.out.println(this.nombre + " " + this.apellido + " - "
                + this.edad + " anios");
    }
    
    
    //crear to string para ver mejor el objeto
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre
                + ", apellido=" + apellido
                + ", rut=" + rut
                + ", edad=" + edad 
                + '}';
    }
    
}
