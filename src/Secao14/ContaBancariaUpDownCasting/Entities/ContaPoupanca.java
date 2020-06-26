package Secao14.ContaBancariaUpDownCasting.Entities;

public class ContaPoupanca extends ContaBancaria{

    private Double taxaDeJuros;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Integer numeroConta, String titularConta, Double saldoConta, Double taxaDeJuros) {
        super(numeroConta, titularConta, saldoConta);
        this.taxaDeJuros = taxaDeJuros;
    }

    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(Double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void atualizarSaldo() {
        saldoConta = saldoConta * taxaDeJuros;
    }

}
