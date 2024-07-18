package clase12appmov;

//se ejecuta primero y evalua la condición después
public class CicloDoWhile {
    
    public static void main(String[] args) {
        
        //generalmente esta variable se llama contador, porque da la cantidad de vueltas
        int contador = 0;

        //hay que tener cuidado con el contador para no dejar ciclo infinito
        do {
            System.out.println(contador);
            contador++;
        } while (contador < 10); //esta la condicional que en el while va primero
        
    }
    
}
