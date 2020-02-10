package Secao4;
// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {
        double pi, raio, area;
        Scanner scanner = new Scanner(System.in);

        pi = 3.14159;

        System.out.println("Informe o raio do círculo: ");
        raio = scanner.nextDouble();

        area = pi * (raio * raio);
        System.out.println("A área do círculo é: " + area);
    }

}
