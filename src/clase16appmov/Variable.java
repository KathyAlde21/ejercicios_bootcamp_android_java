package clase16appmov;

public class Variable {

    public static void main(String[] args) {

        System.out.println("Hola Mundo");
        
    /* VARIABLE*/
        
    //Inicialización de una variable:
    //toda variable debe ser inicializada cuando se declara a menos que dependa de un valor
    //que deba ser calculado previamente
    //nombre corto, claro, primera mayúscula y camelcase
    
    int unidad = 1;
    String[] funciones = new String[]{"Administración","Intervención","Gestión"};


    int contador = 0; //Contador inicializado
    contador++; //aumento del contador 
    
    int x = 0;
    String cadena = "0";
    
    int suma = 5+5;
    
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    
                }
            }
        }
        
    String SaluDoCompleto = "Holita mundo"; //hay que fijarse que quede bien escrito
    System.out.println(SaluDoCompleto); //llamando en consola
    
    /* ---------------------------------------------------- */
    
    /* VARIABLE CONSTANTE */
    
    //variable constante => se escriben por completo en mayúsculas
    //se usa _ para separar dos palabras
    //se usan en general para terminos matemáticos
    //ej int LONGITUD_MAXIMA;
    //   int LONGITUD_MINIMA;
    // para que quede fija se pone final ya que asi no se puede modificar
    
    final int LONGITUD_MAXIMA = 20; //indico que es una variable constante
        
    LONGITUD_MAXIMA = 30; //

    int NUMERO_PI;

    /* ---------------------------------------------------- */
    
    

    }
}
