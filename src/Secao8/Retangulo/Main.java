package Secao8.Retangulo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a largura e a altura do retângulo:");
        System.out.println("Largura: ");
        retangulo.largura = entrada.nextDouble();
        System.out.println("Altura: ");
        retangulo.altura = entrada.nextDouble();

        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
        System.out.println("Diagonal: " + retangulo.calcularDiagonal());

    }

}
