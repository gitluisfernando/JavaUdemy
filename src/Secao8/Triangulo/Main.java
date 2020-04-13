package Secao8.Triangulo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangulo trianguloX = new Triangulo();
        Triangulo trianguloY = new Triangulo();

        System.out.println("Informe as medidas do triângulo X:");
        trianguloX.ladoA = scanner.nextDouble();
        trianguloX.ladoB = scanner.nextDouble();
        trianguloX.ladoC = scanner.nextDouble();
        System.out.println("Informe as medidas do triângulo Y:");
        trianguloY.ladoA = scanner.nextDouble();
        trianguloY.ladoB = scanner.nextDouble();
        trianguloY.ladoC = scanner.nextDouble();

        double areaX = trianguloX.areaTriangulo();
        double areaY = trianguloY.areaTriangulo();

        System.out.println("A área do Triângulo X é: " + areaX);
        System.out.println("A área do Triângulo Y é: " + areaY);

        if (areaX > areaY) {
            System.out.println("O Triângulo X é maior");
        } else {
            System.out.println("O Triângulo Y é maior");
        }
    }

}