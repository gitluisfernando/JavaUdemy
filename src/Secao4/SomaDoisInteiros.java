package Secao4;

import java.util.Scanner;

public class SomaDoisInteiros {

    public static void main(String[] args) {
        int valor1, valor2, soma;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        valor1 = scanner.nextInt();

        System.out.println("Informe o segundo valor: ");
        valor2 = scanner.nextInt();

        soma = valor1 + valor2;
        System.out.println("Soma: " + soma);
    }

}
