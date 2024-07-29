package Modulo2;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int perfecto = 0;

        System.out.print("ingresa el numero: ");
        int numero = scanner.nextInt();

        for(int i=1; i<numero; i++){
            if (numero % i == 0) {
                perfecto += i;
            }
        }

        if (perfecto == numero) {
            System.out.println("el numero es perfecto");
        }else{
            System.out.println("el numero no es perfecto");
        }
        scanner.close();
    }
}
