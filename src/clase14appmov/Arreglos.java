package clase14appmov;

public class Arreglos {
    public static void main(String[] args) {
        //arreglo tipo entero
        int num[] = new int[10]; //0-9
        int [] num2 = new int [10]; //raro pero hay personas que lo escriben así, es lo mismo 
        
        //arreglo tipo cadena
        String cadenas[] = new String [10];
        
        System.out.println(num.length); //puedo ver la dimension del arreglo
        System.out.println(num[6]);
        System.out.println(cadenas[5]);
    //    System.out.println(num[10]); //no existe, 0-9
    }
}
