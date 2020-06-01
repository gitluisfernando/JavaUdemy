package Secao9.ControleDeEstoqueEncapsulamento;

public class Produtos {

    private String nomeProduto;
    private double preco;
    private int quantidade;

    public Produtos(String nomeProduto, double preco, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    /* Foi criado apenas o get da quantidade pq ela já tem um método para dar entrada e saída em estoque
     * mantendo assim a integridade da quantidade em estoque
    */
    public int getQuantidade() {
        return quantidade;
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