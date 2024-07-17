package clase11appmov;

public class OperadoresJava {
    public static void main(String[] args) {
        
    //OPERADORES ARITMETICOS
        //variables
        int a = 20;
        int b = 5;
        int c = 18;
        
        //operación suma - resta - multiplicacion - división
        int resultado = a + b;
        int resultado2 = a - b;
        int resultado3 = a * b;
        int resultado4 = a / b;
        
        //resultado de una división, no la división en sí
        int resultado5 = a % b; //es exacta asi que da 0
        int resultado6 = a % c; //sobra una diferencia de la división
        
        System.out.println(resultado);
        System.out.println(a + "5"); //intentando sumar numero y cadena
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
        System.out.println("");
        System.out.println(resultado5);
        System.out.println(resultado6);
        System.out.println();
      
    /* ------------------------------------------------------------------------ */           
    //OPERADORES RELACIONALES
    //igualdad ==, desiguarldad !=, menor <, mayor >, menor o igual <=, mayor o igual >=
    //reciclando a y c => obtener true y false
    boolean resultado7 = (a == c);    
    boolean resultado8 = (a != c);    
    boolean resultado9 = (a < c);    
    boolean resultado10 = (a > c);    
    boolean resultado11 = (a <= c);    
    boolean resultado12 = (a >= c);    
    
    System.out.println(resultado7);
    System.out.println(resultado8);
    System.out.println(resultado9);
    System.out.println(resultado10);
    System.out.println(resultado11);
    System.out.println(resultado12);
    System.out.println();
        
  /* ------------------------------------------------------------------------ */    
    //OPERADORES LOGICOS
    // and &&, or ||, not !
    //reciclando a, b y c, agrego d ya que debo comparar
    int d = 20;
    
    boolean resultado13 = (a == d) && (a <= c);
    boolean resultado14 = !(a < c); //si va != es para hacer una comparación
    
    System.out.println(resultado13);
    System.out.println(resultado14);
    System.out.println();
    
  /* ------------------------------------------------------------------------ */    
    //OPERADORES DE ASIGNACIÓN
    //simple =, c/suma +=, c/resta -=, c/multiplicacion *=, c/division /=, c/módulo %=
    int contador = 0;
    
    //contador = contador + 1;
    contador += 8; 
    
    System.out.println(contador);
    System.out.println();
    
  /* ------------------------------------------------------------------------ */    
    //OPERADORES INCREMENTALES Y DECREMENTALES
    //pre incremento ++ (++a), post incremento ++ (a++), pre decremento (--b), post decremento (b--)
    int num = 5;
    int num2 = num;
    int num3 = ++num;
    int num4 = num--;
    
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);

    }
}
