package Secao10.Matriz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o tamanho da matriz bidimensional: ");
        int n = entrada.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Informe o valor da linha " + i + ", coluna " + j + ":");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println();

        System.out.println("Diagonal Principal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        int contador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    contador++;
                }
            }
        }
        System.out.println("Total de números negativos: " + contador);

    }

}