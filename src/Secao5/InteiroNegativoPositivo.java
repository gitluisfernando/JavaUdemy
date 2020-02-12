package Secao5;
//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class InteiroNegativoPositivo {

    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O número " + numero + " é negativo");
        } else {
            System.out.println("O número " + numero + " é positivo");
        }
    }

}
