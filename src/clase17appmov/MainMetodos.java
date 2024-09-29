
package clase17appmov;

public class MainMetodos {
    public static void main(String[] args) {
      // System.out.println("Hola Mundo");
        
        //desde acá puedo llamar a Alumno solo si es publico y en caso que no
        //recuerde los datos que lleva los puedo llamar haciendo click en el
        //interior  del () con ctrl + espacio y pone solito los constructores
        Alumno alumno1 = new Alumno("Pedrito", "Gonzalez", "2563111552-2", 10);
        Alumno alumno2 = new Alumno("Juanito", "Pereira", "1567446535-5", 12);
        
        System.out.println(alumno1.nombre);
        System.out.println(alumno2.nombre);
        
        //llamando de dos formas metodos concatenados
        alumno1.mostrarNombreCompleto(); //forma 1 de llamar al metodo
        System.out.println(alumno2.mostrarNombreTexto()); //forma 2 de llamar al metodo
        
        //si quiero ver el contenido de un alumno creo un String en Alumno
        System.out.println(alumno1.toString());
        
        System.out.println(alumno1.getNombre());
        
        
        alumno1.setNombre("Zafi"); //cambiando el dato
        System.out.println(alumno1.getNombre()); //antes Pedrito
        
        
        
        
        
    }
}
