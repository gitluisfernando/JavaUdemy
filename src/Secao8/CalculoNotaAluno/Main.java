package Secao8.CalculoNotaAluno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CalculoMedia media = new CalculoMedia();

        System.out.println("Informe o nome do aluno: ");
        media.nomeAluno = entrada.nextLine();
        System.out.println("Informe a nota do primeiro trimestre: ");
        media.nota1 = entrada.nextDouble();
        System.out.println("Informe a nota do segundo trimestre: ");
        media.nota2 = entrada.nextDouble();
        System.out.println("Informe a nota do terceiro trimestre: ");
        media.nota3 = entrada.nextDouble();

        media.calculoMediaFinal();
        media.avaliacaoFinal();
        media.resultadoAprovacao();
    }

}
