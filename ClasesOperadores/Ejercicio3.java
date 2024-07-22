package ClasesOperadores;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numeroUno = 8;
        int numeroDos = 2;
        int auxiliar = 0;

        System.out.println("1: "+numeroUno);
        System.out.println("2: "+numeroDos);

        auxiliar = numeroUno;
        numeroUno = numeroDos;
        numeroDos = auxiliar;

        System.out.println("1: "+numeroUno);
        System.out.println("2: "+numeroDos);
    }
}
