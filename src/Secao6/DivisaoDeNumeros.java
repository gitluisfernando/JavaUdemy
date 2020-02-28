package Secao6;
/* Utilizando For
 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
 * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */

import java.util.Scanner;

public class DivisaoDeNumeros {

    public static void main(String[] args) {
        int N;
        double dividendo, divisor, divisao;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas divisões serão realizadas? ");
        N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Informe o dividendo: ");
            dividendo = scanner.nextDouble();
            System.out.println("Informe o divisor: ");
            divisor = scanner.nextDouble();

            if (divisor != 0) {
                divisao = dividendo / divisor;
                System.out.println("Resultado da divisão: " + divisao);
            } else {
                System.out.println("Divisão impossível");
            }
        }

    }

}