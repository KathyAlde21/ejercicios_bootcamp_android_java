package clase14appmov;

public class Matrices {
    public static void main(String[] args) {
        
        int matriz[][] = new int[10][15]; //las filas y las columnas van en [] diferentes
        
    //    System.out.println(matriz.length);
    //    System.out.println(matriz[4].length);
     
    
    //LAS FILAS ITERAN SOBRE LAS COLUMNAS
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random()*9); //sin eso pone puros 0
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");    
        } 
    }
}
