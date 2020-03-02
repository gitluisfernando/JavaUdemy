package Secao6;
/* Utilizando For
 * Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
 * começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
 * exemplo.
 */

import java.util.Scanner;

public class QuadradoECuboDeUmValor {

    public static void main(String[] args) {
        int N, quadrado, cubo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro positivo: ");
        N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            quadrado = (int) Math.pow(i, 2);
            cubo = (int) Math.pow(i, 3);
            System.out.println(i + ", " + quadrado + ", " + cubo);
        }
    }

}