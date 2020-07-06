package Secao15.ContaBancariaException.Application;

import java.util.InputMismatchException;
import java.util.Scanner;

import Secao15.ContaBancariaException.Model.Entities.ContaBancaria;
import Secao15.ReservaQuartoException.Model.Exceptions.DomainException;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Informe os dados da conta:");
            System.out.print("Número: ");
            Integer numeroConta = entrada.nextInt();
            System.out.print("Titular: ");
            entrada.nextLine();
            String titularConta = entrada.nextLine();
            System.out.print("Saldo Inicial: ");
            Double saldoInicial = entrada.nextDouble();
            System.out.print("Limite de Saque: ");
            Double limiteDeSaque = entrada.nextDouble();

            ContaBancaria contaBancaria = new ContaBancaria(numeroConta, titularConta, saldoInicial, limiteDeSaque);

            System.out.println("Informe um valor para saque: ");
            Double valorSaque = entrada.nextDouble();
            contaBancaria.saqueConta(valorSaque);

            System.out.println("Informe um valor para depósito: ");
            Double valorDeposito = entrada.nextDouble();
            contaBancaria.depositoConta(valorDeposito);

            System.out.println(contaBancaria);
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Conteúdo inválido");
        }

    }

}