package Secao5;
/* Com base na tabela abaixo, escreva um programa utilizando if/else que leia o código de um item e a quantidade deste item.
 * A seguir, calcule e mostre o valor da conta a pagar.
 * 1 - Cachorro quente - 4,00
 * 2 - X Salada - 4,50
 * 3 - X Bacon - 5,00
 * 4 - Torrada Simples - 2,00
 * 5 - Refrigerante - 1,50 */

import java.util.Scanner;

public class PedidoRestaurante {

    public static void main(String[] args) {
        int codigo, quantidade;
        double preco;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o código do produto: ");
        codigo = scanner.nextInt();
        System.out.println("Informe a quantidade: ");
        quantidade = scanner.nextInt();

        if (codigo == 1) {
            preco = quantidade * 4.00;
            System.out.println("Cachorro quente");
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Preço Total: R$ " + preco);
        } else if (codigo == 2) {
            preco = quantidade * 4.50;
            System.out.println("X Salada");
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Preço Total: R$ " + preco);
        } else if (codigo == 3) {
            preco = quantidade * 5.00;
            System.out.println("X Bacon");
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Preço Total: R$ " + preco);
        } else if (codigo == 4) {
            preco = quantidade * 2.00;
            System.out.println("Torrada Simples");
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Preço Total:  R$ " + preco);
        } else if (codigo == 5) {
            preco = quantidade * 1.50;
            System.out.println("Refrigerante");
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Preço Total: R$ " + preco);
        } else {
            System.out.println("Código Inválido");
        }
    }
}