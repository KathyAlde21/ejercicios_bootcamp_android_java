
package clase18appmov.herencias;

//acá voy a llamar los otros

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
                "FullStack JS",
                "Andrea",
                "Alderete",
                "1478523-7",
                33      
        );
        
        Profesor profesor1 = new Profesor (
                2,
                "Matematicas",
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
        
        
        
    }
}
