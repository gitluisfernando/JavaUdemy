package Secao5;
//Escreva um programa que interprete os dias da semana utilizando Switch-Case

import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {
        int dia;
        String diaDaSemana;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o dia: ");
        dia = scanner.nextInt();

        switch (dia) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda-Feira";
                break;
            case 3:
                diaDaSemana = "Terça-Feira";
                break;
            case 4:
                diaDaSemana = "Quarta-Feira";
                break;
            case 5:
                diaDaSemana = "Quinta-Feira";
                break;
            case 6:
                diaDaSemana = "Sexta-Feira";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
            default:
                diaDaSemana = "Parâmetro Inválido";
                break;
        }

        System.out.println("Dia da semana: " + diaDaSemana);

    }

}
