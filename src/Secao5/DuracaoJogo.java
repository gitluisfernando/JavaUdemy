package Secao5;

import java.util.Scanner;

public class DuracaoJogo {

    public static void main(String[] args) {
        int horaInicial, horaFinal, duracaoJogo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a hora inicial do jogo: ");
        horaInicial = scanner.nextInt();

        System.out.println("Informe a hora final do jogo: ");
        horaFinal = scanner.nextInt();

        if (horaInicial > horaFinal) {
            duracaoJogo = ((24 - horaInicial) + (horaFinal - 0));
            System.out.println("O jogo durou " + duracaoJogo + " horas");
        } else if (horaInicial == horaFinal) {
            System.out.println("O jogo durou 24 horas");
        } else {
            duracaoJogo = horaFinal - horaInicial;
            System.out.println("O jogo durou " + duracaoJogo + " horas");
        }
    }

}
