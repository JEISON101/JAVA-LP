package Modulo2;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        int numero = 6;

        for(int i=1; i<=numero; i++){
            if (numero % i == 0) {
                System.out.println("divisor: "+ i);
            }
            
        }
    }
}
