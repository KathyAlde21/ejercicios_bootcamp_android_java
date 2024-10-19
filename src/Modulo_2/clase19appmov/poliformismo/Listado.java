
package Modulo_2.clase19appmov.poliformismo;

import Modulo_2.clase18appmov.herencias.Persona;
import java.util.ArrayList;
import java.util.List;

public class Listado {
    
    private final List<Persona> listadoPersonas;
    
    // Constructor
    public Listado() {
        this.listadoPersonas = new ArrayList<>();
    }
    
    public void agregarPersonas(Persona persona) {
        listadoPersonas.add(persona);
//        System.out.println("La persona fue agregada con exito");
    }
    
    public void mostrarListado() {
        for (Persona e : listadoPersonas) {
            e.mostrarDatos();
        }
//        listadoPersonas.forEach(System.out::println);
    }
    
    @Override
    public String toString() {
        return "Listado{" + "listadoPersonas=" + listadoPersonas + '}';
    }
}
