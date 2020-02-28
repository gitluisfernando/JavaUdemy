package Secao6;
//Utilizando For. Ler um número inteiro N e calcular todos os seus divisores.

import java.util.Scanner;

public class CalcularDivisores {

    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
            }
        }

    }

}