package Modulo_2.clase10appmov;


public class Variable {

    public static void main(String[] args) { //main y tabulador crea la frase completa
    /*
        //en el main se invoca para después pder leer el proyecto en consola
        System.out.println("Hola Mundo!"); //sout y tabulador para escribir
        System.out.print("hola -");//si saco el ln queda pegado al posterior
        System.out.println("hola pegado");
    */
    //DECLARANDO VARIABLES
    byte num = 15;
    // byte num = 128; //supera el limite de 127 asi que no lo va a leer
    //NUMEROS ENTEROS   
    short numShort = 32000;
 /**/   int numInt = 1234568921; //MÁS USADA EN ENTERO NUMERICO
    long numLong = 1231556223;
   
    //DECIMALES
    float numFloat = 12.32f; //float pide que tenga f al final
/**/    double numDouble = 12.32; //MAS USADO EN DECIMAL NUMERICO
    

    //TEXTO
    char car = 'S'; //puede solo 1 elemento en comilla simple
    
    
    //BOOLEANOS
    boolean varBoolean = false;
    
    
    //LLAMANDO VARIABLES
        System.out.println(num);
        System.out.println(numShort);
        System.out.println(numInt);
        System.out.println(numInt);
        System.out.println(numLong);
        System.out.println(numFloat);
        System.out.println(numDouble);
        System.out.println(car);
        System.out.println(varBoolean);
        
    }
    
}
