
package clase18appmov.herencias;

import clase19appmov.intercambioObjetos.Materia;
import clase19appmov.poliformismo.Listado;

public class Main {
    public static void main(String[] args) {
      //  System.out.println("Hola Mundo");
        
        Persona persona1 = new Persona(
                "Kathy",
                "Alderete",
                "1234567-9",
                44
        );
        
        Alumno alumno1 = new Alumno (
                01,
                "Economia", 
                "Juanito", 
                "Perez", 
                "12312412-2", 
                23   
        );
        
        Alumno alumno2 = new Alumno (
                02,
                "Economia",
                "Speedy",
                "Gonzalez",
                "123123-2",
                25   
        );
        
        Profesor profesor1 = new Profesor (
                1,
              //  "Matematicas",
                "Tomas",
                "Campos",
                "159357-2",
                22
        ); 
 
        System.out.println(persona1);
        System.out.println(alumno1);
        System.out.println(profesor1);
        
        persona1.mostrarDatos();
        alumno1.mostrarDatos(); //solo datos alumno
        profesor1.mostrarDatos(); //datos profesor en plantilla persona
        
        //para taer carrera que de privado paso a publico con get
        System.out.println(alumno1.getCarrera());
        
        //-----------------------------------------------------
        
    /*    listaPersonas.agregarPersonas(persona1);
        listaPersonas.agregarPersonas(alumno1);
        listaPersonas.agregarPersonas(profesor1);*/
        
//        listaPersonas.mostrarListado();
        
        //--------------------------------------------------
        //CREAR UNA MATERIA
        Materia historia = new Materia("Historia", profesor1);
        
        //agregar alumnos a la materia
        historia.agregarAlumnos(alumno1);
        historia.agregarAlumnos(alumno2);

        //mostrar datos de la materia
        historia.mostrarDatosMateria();
        
    }
}
