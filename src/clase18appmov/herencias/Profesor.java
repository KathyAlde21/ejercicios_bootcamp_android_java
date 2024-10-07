package clase18appmov.herencias; //herencia y poliformismo


public class Profesor extends Persona {
    
    private int idProfesor;
    private String materia;
    
    //constructor vacio
    public Profesor () {};
    
    //constructor insert code
    public Profesor(
            int idProfesor,
            String materia,
            String nombre,
            String apellido,
            String rut,
            int edad
    ) {
        super(nombre, apellido, rut, edad);
        this.idProfesor = idProfesor;
        this.materia = materia;
    }

    //crear metodo mostrar datos me obliga a hacer click en ampolleta
    //porque como no es único tengo que llamarlo
    @Override
    public void mostrarDatos () {
        System.out.println("-------------------");
        super.mostrarDatos(); //este se agrega manual
    }
    
    @Override
    public String toString() {
        return "Profesor{"
                + "idProfesor=" + idProfesor 
                + ", materia=" + materia
                + '}' 
                + super.toString();
        
    }
    
    
    
}
