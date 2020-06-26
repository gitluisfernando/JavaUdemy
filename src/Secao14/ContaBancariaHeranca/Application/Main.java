package Secao14.ContaBancariaHeranca.Application;

import java.text.ParseException;
import java.util.Scanner;

import Secao14.ContaBancariaHeranca.Entities.ContaBancaria;
import Secao14.ContaBancariaHeranca.Entities.ContaCorporativa;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Nova Conta");
        System.out.print("Para Pessoa Física Digite 1 - Conta Corporativa Digite 2: ");
        System.out.println();
        Integer tipoConta = entrada.nextInt();

        if (tipoConta == 1) {
            System.out.println("Digite o número da conta: ");
            Integer numeroConta = entrada.nextInt();
            System.out.println("Digite o nome do titular: ");
            String nomeTitular = entrada.next();
            System.out.println("Deseja realizar um depósito inicial (S/N)?");
            String simOuNao = entrada.next();
            Double saldoInicial = 0.0;
            if (simOuNao.equals("S")) {
                System.out.println("Informe o valor do depósito inicial: ");
                saldoInicial = entrada.nextDouble();
            }

            ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldoInicial);

            System.out.println("Saldo Inicial: R$ " + contaBancaria.getSaldoConta());
            System.out.println("Informe um valor para depósito: ");
            Double valorDeposito = entrada.nextDouble();
            contaBancaria.depositoConta(valorDeposito);
            System.out.println("Saldo Atualizado: R$ " + contaBancaria.getSaldoConta());
            System.out.println("Informe um valor para saque: ");
            Double valorSaque = entrada.nextDouble();
            if (valorSaque < contaBancaria.getSaldoConta()) {
                contaBancaria.saqueConta(valorSaque);
            } else {
                System.out.println("Saldo Insuficiente");
            }
            System.out.println("Saldo Atualizado: R$ " + contaBancaria.getSaldoConta());

            System.out.println(contaBancaria);
        } else if (tipoConta == 2) {
            System.out.println("Digite o número da conta: ");
            Integer numeroConta = entrada.nextInt();
            System.out.println("Digite o nome do titular: ");
            String nomeTitular = entrada.next();
            System.out.println("Deseja realizar um depósito inicial (S/N)?");
            String simOuNao = entrada.next();
            Double saldoInicial = 0.0;
            if (simOuNao.equals("S")) {
                System.out.println("Informe o valor do depósito inicial: ");
                saldoInicial = entrada.nextDouble();
            }
            System.out.println("Informe o limite para empréstimo ao cliente: ");
            Double limiteEmprestimo = entrada.nextDouble();

            ContaCorporativa contaCorporativa = new
                    ContaCorporativa(numeroConta, nomeTitular, saldoInicial, limiteEmprestimo);

            System.out.println("Saldo Inicial: R$ " + contaCorporativa.getSaldoConta());
            System.out.println("Informe um valor para depósito: ");
            Double valorDeposito = entrada.nextDouble();
            contaCorporativa.depositoConta(valorDeposito);
            System.out.println("Saldo Atualizado: R$ " + contaCorporativa.getSaldoConta());
            System.out.println("Informe um valor para saque: ");
            Double valorSaque = entrada.nextDouble();
            if (valorSaque < contaCorporativa.getSaldoConta()) {
                contaCorporativa.saqueConta(valorSaque);
            } else {
                System.out.println("Saldo Insuficiente");
            }
            System.out.println("Saldo Atualizado: R$ " + contaCorporativa.getSaldoConta());
            System.out.println("Informe um valor para empréstimo: R$");
            Double valorEmprestimo = entrada.nextDouble();
            contaCorporativa.realizarEmprestimo(valorEmprestimo);
            System.out.println("Saldo Atualizado: R$ " + contaCorporativa.getSaldoConta());

            System.out.println(contaCorporativa);
        } else {
            System.out.println("Dígito inválido. Recomece o cadastro");
        }

    }

}