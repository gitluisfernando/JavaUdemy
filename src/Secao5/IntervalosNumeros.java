package Secao5;
/* Utilizando IF/ELSE, você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
 * seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
 * nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. */

import java.util.Scanner;

public class IntervalosNumeros {

    public static void main(String[] args) {
        double numero;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número de 0 a 100: ");
        numero = scanner.nextDouble();

        if (numero >= 0 && numero <= 25) {
            System.out.println("O número " + numero + " está no intervalo [0,25]");
        } else if (numero > 25 && numero <= 50) {
            System.out.println("O número " + numero + " está no intervalo [25,50]");
        } else if (numero > 50 && numero <= 75) {
            System.out.println("O número " + numero + " está no intervalo [50,75]");
        } else if (numero > 75 && numero <= 100) {
            System.out.println("O número " + numero + " está no intervalo [75,100]");
        } else {
            System.out.println("Número fora de intervalo");
        }
    }

}
