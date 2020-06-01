package Secao8.Retangulo;

public class Retangulo {

    double largura;
    double altura;

    public double calcularArea() {
        double area = largura * altura;
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = 2 * (altura + largura);
        return perimetro;
    }

    public double calcularDiagonal() {
        double diagonal = Math.sqrt(altura * altura + largura * largura);
        return diagonal;
    }
}