package Secao8.CalculoSalarioFuncionario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CalculoSalario salario = new CalculoSalario();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário: ");
        salario.nomeFuncionario = entrada.nextLine();
        System.out.println("Informe o salário bruto: ");
        salario.salarioBruto = entrada.nextDouble();
        System.out.println("Informe o valor de imposto: ");
        salario.valorImposto = entrada.nextDouble();

        System.out.println("Empregado: " + salario.toString());

        System.out.println("Informe o percentual de aumento do salário: ");
        double percentualAumento = entrada.nextDouble();
        salario.incrementarSalario(percentualAumento);

        System.out.println("Salário atualizado: " + salario.toString());
    }

}
