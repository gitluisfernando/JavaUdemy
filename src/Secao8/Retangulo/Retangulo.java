package Secao8.TrianguloCompleto;

public class Triangulo {

    double largura;
    double altura;

    public double calcularArea() {
        double area = largura * altura / 2;
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = 2 * (altura + largura);
        return perimetro;
    }

    public double diagonal() {
        
    }


}
