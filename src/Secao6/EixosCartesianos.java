package Secao6;
/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
 * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
 * menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 */

import java.util.Scanner;

public class EixosCartesianos {

    public static void main(String[] args) {

        int x, y;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de X: ");
        x = scanner.nextInt();

        System.out.println("Informe o valor de Y: ");
        y = scanner.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Q3");
            } else if (x > 0 && y < 0) {
                System.out.println("Q4");
            }

            System.out.println("Informe um novo valor para X: ");
            x = scanner.nextInt();

            System.out.println("Informe um novo valor para Y: ");
            y = scanner.nextInt();
        }

    }

}