package Secao6;
/* Criar um programa que leia números inteiros e some eles. A entrada só deve ser executada e a ação interrompida quando
 * for digitado o número zero */

import java.util.Scanner;

public class SomarQuandoDigitarZero {

    public static void main(String[] args) {
        int numero, soma;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        numero = scanner.nextInt();

        soma = 0;

        while (numero != 0) {
            soma = soma + numero;
            System.out.println("Digite outro número inteiro: ");
            numero = scanner.nextInt();
        }

        System.out.println("A soma dos valores é: " + soma);
    }

}
