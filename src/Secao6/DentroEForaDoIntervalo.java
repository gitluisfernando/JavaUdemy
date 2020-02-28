package Secao6;
/* Utilizando o For. Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
 * essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */

import java.util.Scanner;

public class DentroEForaDoIntervalo {

    public static void main(String[] args) {
        int X;
        int in = 0;
        int out = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos valores serão lidos: ");
        X = scanner.nextInt();

        for (int i = 0; i < X; i++) {
            System.out.println("Informe um número inteiro: ");
            int N = scanner.nextInt();

            if (N >= 10 && N <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }

}