package Secao8.Triangulo;

public class Triangulo {
    double ladoA;
    double ladoB;
    double ladoC;
    double perimetro;

    public double areaTriangulo() {
        perimetro = (ladoA + ladoB + ladoC) / 2;
        double area = Math.sqrt(perimetro * (perimetro - ladoA) * (perimetro - ladoB) * (perimetro - ladoC));
        return area;
    }

}