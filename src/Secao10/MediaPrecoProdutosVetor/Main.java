package Secao10.MediaPrecoProdutosVetor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanhoArray;

        System.out.println("Informe o tamanho do array: ");
        tamanhoArray = entrada.nextInt();

        Produto[] vetor = new Produto[tamanhoArray];

        for (int i = 0; i < vetor.length; i++) {
            entrada.nextLine();
            System.out.println("Informe o nome do produto: ");
            String nomeProduto = entrada.nextLine();
            System.out.println("Informe o preço do produto: ");
            double precoProduto = entrada.nextDouble();
            vetor[i] = new Produto(nomeProduto, precoProduto);
        }

        double somaPreco = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            somaPreco = somaPreco + vetor[i].getPrecoProduto();
        }

        double mediaPreco = somaPreco / tamanhoArray;
        System.out.println("A média dos preços é de " + mediaPreco);

    }

}