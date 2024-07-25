package Modulo2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> divisores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int factorial = 1;
        int perfecto = 0;
        
        System.out.print("ingresa el numero para realizar las operaciones: ");
        int numero = scanner.nextInt();
        
        int aleatorio = random.nextInt(numero + 1);

        for(int i=1; i<=numero; i++){
            suma += i;
            factorial *= i;

            if (numero % i == 0) {
                perfecto += i;
                divisores.add(i);
            }

            if (i*i == numero){
                System.out.println("la raiz cuadrada es : "+ i);
            }
        }   

        System.out.println("la suma de las iteraciones es : " + suma);
        System.out.println("numero aleatorio : " + aleatorio);
        System.out.println("sus divisores son : " + divisores);
        System.out.println("el factorial es : " + factorial);
        
        if (perfecto-numero == numero) {
            System.out.println("el numero es perfecto");
        }else{
            System.out.println("el numero no es perfecto");
        }

        scanner.close();
    }
}
