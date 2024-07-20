package ColorEnConsola;

public class codigoColorEnConsola {
    public static void main(String[] args) {
        
        String black="\033[30m"; 
        String red="\033[31m"; 
        String green="\033[32m"; 
        String yellow="\033[33m"; 
        String blue="\033[34m"; 
        String purple="\033[35m"; 
        String cyan="\033[36m"; 
        String white="\033[37m";
        String reset="\u001B[0m";
        
        /*
            Para utilizarlo deben concatenar la variable del color que
            quieran, justo antes del texto que deseen colorear.
        */
        
        System.out.println(green + "Esto es de color" + yellow + " amarillo");
        System.out.println(purple + "otra linea - " + white + "otro color");
        
        /* 
            En ocasiones quizás es necesario aplicar el reset en caso
            de que el color persista y no se borre. 
        */
    }

    
}
