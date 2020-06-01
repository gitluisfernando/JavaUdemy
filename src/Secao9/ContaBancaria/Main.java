package Secao9.ContaBancaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        String numeroConta = entrada.nextLine();
        System.out.println("Digite o nome do titular: ");
        String nomeTitular = entrada.nextLine();
        System.out.println("Deseja realizar um depósito inicial (S/N)?");
        String simOuNao = entrada.nextLine();
        double saldoInicial = 0.0;
        if (simOuNao.equals("S")) {
            System.out.println("Informe o valor do depósito inicial: ");
            saldoInicial = entrada.nextDouble();
        }

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldoInicial);

        System.out.println("Dados da conta criada: " + conta.toString());

        System.out.println("Informe o valor do depósito: ");
        double valorDeposito = entrada.nextDouble();
        conta.depositoConta(valorDeposito);
        System.out.println("Dados atualizados da conta: " + conta.toString());

        System.out.println("Informe o valor do saque: ");
        double valorSaque = entrada.nextDouble();
        conta.saqueConta(valorSaque);
        System.out.println("Dados atualizados da conta: " + conta.toString());

    }

}