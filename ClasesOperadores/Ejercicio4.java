package ClasesOperadores;

public class Ejercicio4{
    public static void main(String[] args) {
        boolean estado = true;

        //no se puede realizar la comparacion porque no son el mismo tipo de dato
        if ((estado == 2)||(2>1)) {
            System.out.println(estado);
        }
    }
}