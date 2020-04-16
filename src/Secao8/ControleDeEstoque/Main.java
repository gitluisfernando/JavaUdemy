package Secao8.ControleDeEstoque;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Produtos produtos = new Produtos();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe os dados do produto:");
        System.out.println("Nome: ");
        produtos.nomeProduto = entrada.nextLine();
        System.out.println("Preço: ");
        produtos.preco = entrada.nextDouble();
        System.out.println("Quantidade: ");
        produtos.quantidade = entrada.nextInt();
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
