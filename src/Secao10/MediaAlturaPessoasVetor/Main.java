package Secao10.MediaAlturaPessoasVetor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanhoArray;

        System.out.println("Informe o tamanho do array: ");
        tamanhoArray = entrada.nextInt();

        double[] vetor = new double[tamanhoArray];
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.println("Informe a altura: ");
            vetor[i] = entrada.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < tamanhoArray; i++) {
            soma = soma + vetor[i];
        }

        double media = soma / tamanhoArray;
        System.out.println("A média das alturas é " + media);

    }

}