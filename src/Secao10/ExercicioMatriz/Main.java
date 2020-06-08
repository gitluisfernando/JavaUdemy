package Secao10.ExercicioMatriz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o número de linhas da matriz: ");
        int m = entrada.nextInt();
        System.out.println("Informe o número de colunas da matriz: ");
        int n = entrada.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Informe o valor da linha " + i + ", coluna " + j + ":");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println();

        System.out.println("Informe um número para pesquisa na matriz: ");
        int numeroPesquisa = entrada.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == numeroPesquisa){
                    System.out.println("Número: " + numeroPesquisa);
                    System.out.println("Posição: " + i + ", " + j);
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Acima: " + matriz[i-1][j]);
                    }
                    if (j < matriz[i].length-1) {
                        System.out.println("Direita: " + matriz[i][j+1]);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("Abaixo: " + matriz[i+1][j]);
                    }
                }
            }
        }



    }

}
