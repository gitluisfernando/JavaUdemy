package Secao8.CalculoSalarioFuncionario;

public class CalculoSalario {
    String nomeFuncionario;
    double salarioBruto;
    double valorImposto;

    public double calculoSalarioLiquido() {
        double salarioLiquido = salarioBruto - valorImposto;
        return salarioLiquido;
    }

    public void incrementarSalario(double percentualAumento) {
        salarioBruto = salarioBruto + salarioBruto * percentualAumento / 100;
    }

    public String toString() {
        return nomeFuncionario + ", R$ " + calculoSalarioLiquido();
    }

}
