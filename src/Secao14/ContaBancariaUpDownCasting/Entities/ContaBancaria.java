package Secao14.ContaBancariaUpDownCasting.Entities;

public class ContaBancaria {

    private Integer numeroConta;
    private String titularConta;
    protected Double saldoConta;

    public ContaBancaria() {
    }

    public ContaBancaria(Integer numeroConta, String titularConta, Double saldoConta) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldoConta = saldoConta;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void saqueConta(Double valorSaque) {
        double taxaSaque = 5.0;
        saldoConta = saldoConta - valorSaque - taxaSaque;
    }

    public void depositoConta(Double valorDeposito) {
        saldoConta = saldoConta + valorDeposito;
    }

    @Override
    public String toString() {
        return '\n' +
                "######################" + '\n' +
                "Dados da Conta Bancária de " + titularConta + '\n' +
                "Número da Conta: " + numeroConta + '\n' +
                "Saldo: R$ " + saldoConta;
    }

}