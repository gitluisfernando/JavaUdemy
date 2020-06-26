package Secao14.ContaBancariaHeranca.Entities;

public class ContaCorporativa extends ContaBancaria {

    private Double limiteEmprestimo;
    ContaBancaria contaBancaria = new ContaBancaria();

    public ContaCorporativa() {
        super();
    }

    public ContaCorporativa(Integer numeroConta, String titularConta, Double saldoConta, Double limiteEmprestimo) {
        super(numeroConta, titularConta, saldoConta);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo() {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void realizarEmprestimo(Double valorEmprestimo) {
        if (valorEmprestimo <= limiteEmprestimo) {
            depositoConta(valorEmprestimo);
        } else {
            System.out.println("Valor acima do limite de empréstimo");
            System.out.println("Valor solicitado: " + valorEmprestimo);
            System.out.println("Limite de empréstimo: " + limiteEmprestimo);
        }

    }

    @Override
    public String toString() {
        return  '\n' +
                "######################" + '\n' +
                "Dados da Conta Bancária de " + getTitularConta() + '\n' +
                "Número da Conta: " + getNumeroConta() + '\n' +
                "Saldo: R$ " + getSaldoConta() + '\n' +
                "Limite para Empréstimo: R$ " + getLimiteEmprestimo();
    }

}