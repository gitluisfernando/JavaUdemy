package Secao5;
//Utilizar condição ternária para conceder um desconto

import java.util.Scanner;

public class DescontoTernario {

    public static void main(String[] args) {
        double preco, desconto = 0;
        Scanner scanner = new Scanner(System.in);
        desconto = 0;

        System.out.println("Informe o valor consumido: ");
        preco = scanner.nextInt();

        desconto = (preco < 20.00) ? preco * 0.1 : preco * 0.05;

        System.out.println("Valor consumido: " + preco);
        System.out.println("Valor do desconto: " + desconto);
    }

}
