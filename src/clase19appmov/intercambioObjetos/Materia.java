
package clase19appmov.intercambioObjetos;

import clase18appmov.herencias.Alumno;
import clase18appmov.herencias.Profesor;
import java.util.ArrayList;
import java.util.List;

public class Materia {
    
    private String nombreMateria;
    private Profesor profesor;
    private final List<Alumno> listaAlumnos;
    
    private Materia(){
        this.listaAlumnos = new ArrayList<>();
    }

    public Materia(
            String nombreMateria,
            Profesor profesor
    ) {
        this();
        this.nombreMateria = nombreMateria;
        this.profesor = profesor;
    }

    //------------------------

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    //----------------
    public void agregarAlumnos(Alumno alumno){
        listaAlumnos.add(alumno);
    }
    
    public void mostrarLista(){
        for (Alumno e : listaAlumnos) {
            System.out.println(e.getIdAlumno() + " - " 
                    + e.getNombre() + " - "
                    + e.getApellido() + " - "
                    + e.getCarrera());
        }
    }
    
    public void mostrarDatosMateria(){
        System.out.println("La materia " + this.nombreMateria);
        System.out.println("A cargo del profesor " 
                + this.profesor.nombreCompleto());
        mostrarLista();
    }

    @Override
    public String toString() {
        return "Materia{" + "nombreMateria=" + nombreMateria
                + ", profesor=" + profesor 
                + ", listaAlumnos=" + listaAlumnos 
                + '}';
    }
    
    
    
}
