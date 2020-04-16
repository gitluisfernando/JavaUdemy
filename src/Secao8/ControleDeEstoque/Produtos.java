package Secao8.ControleDeEstoque;

public class Produtos {

    String nomeProduto;
    double preco;
    int quantidade;

    public double valorTotalEmEstoque() {
        double valorTotalEstoque = preco * quantidade;
        return valorTotalEstoque;
    }

    public void adicionarProdutos(int quantidadeEntrada) {
        quantidade = quantidade + quantidadeEntrada;
    }

    public void removerProdutos(int quantidadeSaida) {
        quantidade = quantidade - quantidadeSaida;
    }

    public String toString() {
        return nomeProduto + ", R$ " + preco + ", " + quantidade + " unidades. Total: R$ " + valorTotalEmEstoque();
    }

}