package Secao14.ContaBancariaUpDownCasting.Application;

import java.text.ParseException;
import java.util.Scanner;

import Secao14.ContaBancariaUpDownCasting.Entities.ContaBancaria;
import Secao14.ContaBancariaUpDownCasting.Entities.ContaCorporativa;
import Secao14.ContaBancariaUpDownCasting.Entities.ContaPoupanca;

public class Main {

    public static void main(String[] args) throws ParseException {

        ContaBancaria contaBancaria = new ContaBancaria(123, "Bianca", 0.0);
        ContaCorporativa contaCorporativa = new ContaCorporativa(321, "Isailda", 0.0, 500.0);

        //UPCASTING
        ContaBancaria contaBancaria1 = contaCorporativa;
        ContaBancaria contaBancaria2 = new ContaCorporativa(111, "Ademir", 0.0, 500.0);
        ContaBancaria contaBancaria3 = new ContaPoupanca(222, "Luis", 0.0, 0.01);

        //DOWNCASTING
        ContaCorporativa contaCorporativa1 = (ContaCorporativa) contaBancaria2;

        /* Não é possível realizar o código abaixo pois a contaBancaria3 é do tipo ContaPoupanca
         *  e uma ContaCorporativa só pode ser do tipo ContaBancaria
         *  Em tempo de desenvolvimento não vai detectar, mas em tempo de execução vai dar erro.
         *  Para identificar em tempo de desenvolvimento é necessário utilizar o instanceof, conforme exemplo
         * */
        //ContaCorporativa contaCorporativa2 = (ContaCorporativa) contaBancaria3;

        /* Não irá passar por esse if
         * pois a contaBancaria3 não é uma instância de ContaCorporativa e sim de ContaPoupanca
         */
        if (contaBancaria3 instanceof ContaCorporativa) {
            ContaCorporativa contaCorporativa2 = (ContaCorporativa) contaBancaria3;
            contaCorporativa2.realizarEmprestimo(500.0);
            System.out.println("Não vai passar por aqui");
        }

        // Passará por esse if pois a contaBancaria3 é uma instância de ContaPoupanca
        if (contaBancaria3 instanceof ContaPoupanca) {
            ContaPoupanca contaPoupanca = (ContaPoupanca) contaBancaria3;
            contaPoupanca.atualizarSaldo();
            System.out.println("Por aqui passou");
        }

    }

}