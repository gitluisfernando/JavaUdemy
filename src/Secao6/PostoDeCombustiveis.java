package Secao6;
/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
 * um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
 * 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
 * que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível
 */

import java.util.Scanner;

public class PostoDeCombustiveis {

    public static void main(String[] args) {

        int tipoCombustivel;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Álcool \n2. Gasolina \n3. Diesel \n4. Fim");
        System.out.println("Informe o tipo de combustível desejado: ");
        tipoCombustivel = scanner.nextInt();

        while (tipoCombustivel != 4) {
            if (tipoCombustivel == 1) {
                alcool = alcool + 1;
            } else if (tipoCombustivel == 2) {
                gasolina = gasolina + 1;
            } else if (tipoCombustivel == 3) {
                diesel = diesel + 1;
            }

            System.out.println("Digite um novo código, ou digite 4 para encerrar: ");
            tipoCombustivel = scanner.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }

}
