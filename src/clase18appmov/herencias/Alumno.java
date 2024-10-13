
package clase18appmov.herencias; //herencia en clase - clase padre y clases hijas

//voy a traer a Persona (padre) y Alumno será su hijo
//con extends traigo atributos de Persona
public class Alumno extends Persona { 
    
    //atributos 
    private int idAlumno;
    private String carrera;
    
    //constructor vacio
    public Alumno () {}; //idealmente crear uno vacio
        
    //importando constructor Persona y agregar Alumno
    //creado con Insert Code para traer  "todo bien"
    public Alumno(
            int idAlumno, //alumno
            String carrera, //alumno
            String nombre, //persona
            String apellido, //persona
            String rut, //persona
            int edad //persona
    ) {
        super(nombre, apellido, rut, edad); //trae atributos de Persona
        this.idAlumno = idAlumno;
        this.carrera = carrera;
    }//fin constructor

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //------------------------------------
    
    @Override
    public void mostrarDatos () {
        super.mostrarDatos();
        System.out.println("Este es un alumno");
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno
                + ", carrera=" + carrera
                + '}' + super.toString(); //si escribo super.toString traigo
                        //los datos del alumno con la plantilla Persona (padre)
    }
    
}
