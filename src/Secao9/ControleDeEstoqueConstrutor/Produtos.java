package Secao9.ControleDeEstoqueConstrutor;

public class Produtos {

    String nomeProduto;
    double preco;
    int quantidade;

    public Produtos (String nomeProduto, double preco, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

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