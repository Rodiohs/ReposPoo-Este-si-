import models.Circulo;
import models.Cuadrado;
import models.Triangulo;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(9);
        Triangulo t = new Triangulo(9,3,6,2);
        Cuadrado cu = new Cuadrado(7,7,7,7);
        System.out.println("Area y perimetro del circulo: " + c.calculaArea() + ", "+ c.calculaPerimetro());
        System.out.println("Area y perimetro del triangulo: " + t.calculaArea() + ", "+ t.calculaPerimetro());
        System.out.println("Area y perimetro del cuadrado: " + cu.calculaArea() + ", "+ cu.calculaPerimetro());
    }
}