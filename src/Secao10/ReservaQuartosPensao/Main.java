package Secao10.ReservaQuartosPensao;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner entrada = new Scanner(System.in);
        QuartosPensao[] vetorPensao = new QuartosPensao[10];

        System.out.println("Quantos quartos serão alugados? ");
        int numerQuartosAlugados = entrada.nextInt();

        for (int i = 1; i <= numerQuartosAlugados; i++) {
            System.out.println();
            System.out.println("Aluguel #" + i + ":");
            System.out.print("Nome: ");
            entrada.nextLine();
            String nomeEstudante = entrada.nextLine();
            System.out.print("Email: ");
            String emailEstudante = entrada.nextLine();
            System.out.print("Quarto: ");
            int quarto = entrada.nextInt();
            vetorPensao[quarto] = new QuartosPensao(nomeEstudante, emailEstudante);
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < 10; i++) {
            if (vetorPensao[i] != null) {
                System.out.println(i + ": " + vetorPensao[i]);
            }
        }
        entrada.close();
    }
}