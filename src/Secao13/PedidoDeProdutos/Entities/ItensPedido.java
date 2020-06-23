package Secao13.PedidoDeProdutos.Entities;

import Secao10.MediaPrecoProdutosVetor.Produto;

public class ItensPedido {

    private Integer quantidadeItem;
    private Double precoItem;
    private Produtos produto;

    public ItensPedido(Integer quantidadeItem, Double precoItem, Produtos produto) {
        this.quantidadeItem = quantidadeItem;
        this.precoItem = precoItem;
        this.produto = produto;
    }

    public Integer getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(Integer quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public Double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(Double precoItem) {
        this.precoItem = precoItem;
    }

    public Produtos getProduto() {
        return produto;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }

    public Double subTotal() {
        return quantidadeItem * precoItem;
    }

    @Override
    public String toString() {
        return produto.getNomeProduto()
                + ", R$"
                + String.format("%.2f", precoItem)
                + ", Quantidade: "
                + quantidadeItem +
                ", Subtotal: R$"
                + String.format("%.2f", subTotal());
    }

}