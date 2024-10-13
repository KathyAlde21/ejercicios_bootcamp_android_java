package clase18appmov.herencias; //herencia y poliformismo

public class Profesor extends Persona {
    
    private int idProfesor;
   // private String materia;
    
    //constructor vacio
    public Profesor () {};
    
    //constructor insert code
    public Profesor(
            int idProfesor,
         //   String materia,
            String nombre,
            String apellido,
            String rut,
            int edad
    ) {
        super(nombre, apellido, rut, edad);
        this.idProfesor = idProfesor;
     //   this.materia = materia;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

 /*   public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }*/
    
    public String nombreCompleto() {
        return getNombre() + " " + getApellido();
    }
    

    //crear metodo mostrar datos me obliga a hacer click en ampolleta
    //porque como no es único tengo que llamarlo
    @Override
    public void mostrarDatos () {
        System.out.println("-------------------");
        super.mostrarDatos(); //este se agrega manual
        System.out.println("Profesor");
    }
    
    @Override
    public String toString() {
        return "Profesor{"
                + "idProfesor=" + idProfesor 
              //  + ", materia=" + materia
                + '}' 
                + super.toString();
        
    }

}
