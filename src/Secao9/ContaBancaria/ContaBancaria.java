package Secao9.ContaBancaria;

public class ContaBancaria {

    private String numeroConta;
    private String nomeTitular;
    private double saldoConta;

    public ContaBancaria(String numeroConta, String nomeTitular, double saldoConta) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldoConta = saldoConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void depositoConta(double valorDeposito) {
        saldoConta = saldoConta + valorDeposito;
    }

    public void saqueConta(double valorSaque) {
        saldoConta = saldoConta - valorSaque - 5.00;
    }

    public String toString() {
        return "Conta " + numeroConta + ", Titular: " + nomeTitular + ", Saldo: R$ " + saldoConta;
    }

}