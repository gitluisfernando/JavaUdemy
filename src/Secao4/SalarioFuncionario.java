package Secao4;
/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
 * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário */

import java.util.Scanner;

public class SalarioFuncionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoFuncionario;
        double horasTrabalho, valorHora, salario;

        System.out.println("Informe o código do funcionário: ");
        codigoFuncionario = scanner.nextInt();

        System.out.println("Quantas horas trabalhou: ");
        horasTrabalho = scanner.nextDouble();

        System.out.println("Qual o valor da hora: ");
        valorHora = scanner.nextDouble();

        salario = horasTrabalho * valorHora;

        System.out.println("Código do Funcionário: " + codigoFuncionario);
        System.out.println("Salário: R$ " + salario);
    }

}
