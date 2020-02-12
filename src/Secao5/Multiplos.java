package Secao5;
/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
 * Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
 * ordem crescente ou decrescente. */

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        a = scanner.nextInt();

        System.out.println("Informe o segundo valor: ");
        b = scanner.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println(a + " e " + b + " são múltiplos");
        } else {
            System.out.println(a + " e " + b + " não são múltiplos");
        }
    }

}
