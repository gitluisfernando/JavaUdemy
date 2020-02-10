package Secao4;
/* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
 * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */

import java.util.Scanner;

public class DiferencaDoisProdutos {

    public static void main(String[] args) {
        int valor1, valor2, valor3, valor4, diferencaProdutos;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        valor1 = scanner.nextInt();

        System.out.println("Informe o segundo valor: ");
        valor2 = scanner.nextInt();

        System.out.println("Informe o terceiro valor: ");
        valor3 = scanner.nextInt();

        System.out.println("Informe o quarto valor: ");
        valor4 = scanner.nextInt();

        diferencaProdutos = ((valor1 * valor2) - (valor3 * valor4));
        System.out.println("Diferença: " + diferencaProdutos);
    }

}
