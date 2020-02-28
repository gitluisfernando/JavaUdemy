package Secao6;
/* Utilizando For.
 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
 * Lembrando que, por definição, fatorial de 0 é 1.
 */

import java.util.Scanner;

public class FatorialDeUmNumero {

    public static void main(String[] args) {
        int N, fatorial;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        N = scanner.nextInt();

        fatorial = 1;

        for (int i = 1; i <= N; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + N + " é " + fatorial);
    }

}