
package Modulo_2.clase17appmov;

public class Alumno {
   /* public static void main(String[] args) {
        System.out.println("Hola Mundo");
    } */
   
    //MODIFICADORES DE ACCESO => public
    String nombre;
    String apellido;
    String rut;
    int numeroSalon;
    
    //MODIFICADORES DE ACCESO => private y protected, puedo elegir cuales
    //van a ser privados o si dejo por defecto publico
  /*  protected String nombre;
    private String apellido;
    private String rut;
    private int numeroSalon; */
   
    //--------------------------------------------------------------------------
    
    /* CONSTRUCTORES */
    //constructor para crear objeto alumno lo puedo hacer manual
    //click derecho opción "insert code" y luego elijo "constructor" donde puedo
    //hacer uno vacio solo creando o marcar casillas

    
    public Alumno(String nombre, String apellido, String rut, int numeroSalon) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.numeroSalon = numeroSalon;
    }

    public Alumno() {
    }
    
    //--------------------------------------------------------------------------

    /* METODOS */
    //con ellos puedo llamar a más de un elemento
    //click derecho opción "insert code" y luego elijo, donde marco las casillas
    
    //1) void
    public void mostrarNombreCompleto() {
        System.out.println(this.nombre + " " + this.apellido);
    }  
    
    //2) string
    public String mostrarNombreTexto() {
        return this.nombre + " " + this.apellido;
    }
    
    //3) Getters and Setters 
    //puedo hacer click derecho y elegir insert code, luego la opción
    //getter and setter para que los haga
    //set => mutador

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

    public int getNumeroSalon() {
        return numeroSalon;
    }

    public void setNumeroSalon(int numeroSalon) {
        this.numeroSalon = numeroSalon;
    }
    
    //4) toString()
    @Override //se crea de forma automatica y avisa que esta llamando un metodo
    public String toString() {
  /*      return "Alumno{" //en este marque todas las casillas
                + "nombre=" + nombre 
                + ", apellido=" + apellido 
                + ", rut=" + rut 
                + ", numeroSalon=" 
                + numeroSalon 
                + '}';      */
        
      //  return "Alumno: " + this.nombre; //elegi que mostrar
        
        return "Alumno: " + getNombre(); //puedo llamar de las dos formas 
    }
    
}
