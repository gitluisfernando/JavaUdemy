package Secao15.ContaBancariaException.Model.Entities;

import Secao15.ReservaQuartoException.Model.Exceptions.DomainException;

public class ContaBancaria {

    private Integer numeroConta;
    private String titularConta;
    private Double saldoConta;
    private Double limiteSaque;

    public ContaBancaria(Integer numeroConta, String titularConta, Double saldoConta, Double limiteSaque) throws DomainException {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldoConta = saldoConta;
        this.limiteSaque = limiteSaque;
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

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void depositoConta(Double valorDeposito) {
        saldoConta = saldoConta + valorDeposito;
    }

    public void saqueConta(Double valorSaque) throws DomainException {
        if (valorSaque > limiteSaque) {
            throw new DomainException("Limite de Saque Excedido");
        } else if (valorSaque > saldoConta) {
            throw new DomainException("Saldo Insuficiente");
        } else {
            saldoConta = saldoConta - valorSaque;
        }
    }

    @Override
    public String toString() {
        return "Conta Bancária: " + '\n' +
                "Número Conta: " + numeroConta +
                ", Titular: " + titularConta +
                ", Saldo Atual: R$ " + String.format("%.2f", saldoConta) +
                ", Limite Saque: R$ " + String.format("%.2f", limiteSaque) + ".";
    }

}