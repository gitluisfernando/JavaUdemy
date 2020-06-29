package Secao14.ImpostoDeRendaAbstract.Entities;

public abstract class Pessoa {

    protected String nomePessoa;
    protected Double rendaAnualPessoa;

    public Pessoa() {
    }

    public Pessoa(String nomePessoa, Double rendaAnualPessoa) {
        this.nomePessoa = nomePessoa;
        this.rendaAnualPessoa = rendaAnualPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public Double getRendaAnualPessoa() {
        return rendaAnualPessoa;
    }

    public void setRendaAnualPessoa(Double rendaAnualPessoa) {
        this.rendaAnualPessoa = rendaAnualPessoa;
    }

    public abstract Double calculoImposto();

}