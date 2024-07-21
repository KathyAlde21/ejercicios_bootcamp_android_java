package clase14appmov;

public class ArregloRandom2Decimales {
    
    //CREANDO ARREGLO CON UN DATO CON DOS DECIMALES

    public static void   main(String[] args) {
          
    //random puede dar muchos decimales y con esto se controla
        double nRandom = Math.random() * 100;
        System.out.println(Math.floor(nRandom * 100) / 100); 
        
    }
}
