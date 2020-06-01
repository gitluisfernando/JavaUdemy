package Secao9.ControleDeEstoqueEncapsulamento;

import java.util.Scanner;

import Secao9.ControleDeEstoqueConstrutor.Produtos;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe os dados do produto:");
        System.out.println("Nome: ");
        String nomeProduto = entrada.nextLine();
        System.out.println("Preço: ");
        double preco = entrada.nextDouble();
        System.out.println("Quantidade: ");
        int quantidade = entrada.nextInt();

        Produtos produtos = new Produtos(nomeProduto, preco, quantidade);

        System.out.println("Dados do Produto: " + produtos.toString());

        System.out.println("Entre com a quantidade de produtos a serem adicionadas ao estoque: ");
        int quantidadeAdicionar = entrada.nextInt();
        produtos.adicionarProdutos(quantidadeAdicionar);
        System.out.println("Dados do Produto Atualizados: " + produtos.toString());

        System.out.println("Entre com a quantidade de produtos a serem removidos do estoque: ");
        int quantidadeRemover = entrada.nextInt();
        produtos.removerProdutos(quantidadeRemover);
        System.out.println("Dados do Produto Atualizados: " + produtos.toString());
    }

}
