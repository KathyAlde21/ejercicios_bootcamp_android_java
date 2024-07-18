package clase12appmov;

//si la condición no se cumple no entra al ciclo y el contador lo manejamos nosotros
public class CicloWhile {
    public static void main(String[] args) {
        //variables indicando las vueltas
        int a = 0;
        int b = 10;
        
        //hay que tener cuidado con el contador para no dejar ciclo infinito
        while (a < b) {
            System.out.println(a);
            a++; //con esto aumenta en 1 cada vuelta hasta ser menor que b
        }
        System.out.println(a); //muestra 10 porque es el numero en que termino el ciclo
    }
}
