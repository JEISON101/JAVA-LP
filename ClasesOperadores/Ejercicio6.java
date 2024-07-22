package ClasesOperadores;

public class Ejercicio6 {
    public static void main(String[] args) {
        int ladoCuadrado = 8;
        double area = ladoCuadrado*ladoCuadrado;
        int perimetro = ladoCuadrado*4;

        System.out.println("el area del cuadrado es de : "+ area);
        System.out.println("el perimetro del cuadrado es de : "+ perimetro);

        int baseTriangulo = 9;
        int alturatriangulo = 8;
        int lodoUnotriangulo = 8;
        int lodoDostriangulo = 8;

        area = 0.5*baseTriangulo*alturatriangulo;
        perimetro =alturatriangulo+lodoUnotriangulo+lodoDostriangulo;

        System.out.println("el area del triangulo es : "+ area);
        System.out.println("el perimetro del triangulo es : "+ perimetro);

        int baseRectangulo = 8;
        int alturaRectangulo = 4;

        area = baseRectangulo*alturaRectangulo;
        perimetro = (baseRectangulo+alturaRectangulo)*2;

        System.out.println("el area del rectangulo es : "+ area);
        System.out.println("el perimetro del rectangulo es : "+ perimetro);

    }
}
