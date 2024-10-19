
package Modulo_2.clase18appmov.interfaces;

public class Libros implements IDatos { //la interface se llama con implements
    
    private String titulo;
    private String descripcion;
    private String isbn;
    
    public Libros() {};
    
    public Libros(
            String titulo,
            String descripcion,
            String isbn
    ) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.isbn = isbn;
    }
    
    //metodo importado desde interface IDatos
    @Override
    public void mostrarDatos() { //al importar IDatos y agrego @Override
        System.out.println(this.titulo);
    }

    @Override
    public String toString() {
        return "Libros{" + "titulo=" + titulo
                + ", descripcion=" + descripcion
                + ", isbn=" + isbn
                + '}';
    }
    
    
    
}
