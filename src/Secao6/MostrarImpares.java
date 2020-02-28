package Secao6;
/* Utilizando o For, Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
 * X, se for o caso.
 */

import java.util.Scanner;

public class MostrarImpares {

    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de X: ");
        x = scanner.nextInt();
        System.out.println("Os valores ímpares de " + x + " são: ");

        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }

}