package Modulo2;

public class Ejercicio1 {

    public static void main(String[] args) {

        int factorial = 1;
        int numero = 3;

        for(int i=1; i<=numero; i++){
            factorial *= i;
        }
    
        System.out.println("El factorial de "+numero+" es: "+factorial);
    }
}