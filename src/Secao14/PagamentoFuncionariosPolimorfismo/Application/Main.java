package Secao14.PagamentoFuncionariosPolimorfismo.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Secao14.PagamentoFuncionariosPolimorfismo.Entities.Funcionario;
import Secao14.PagamentoFuncionariosPolimorfismo.Entities.FuncionarioTerceirizado;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Funcionario> listaFuncionarios = new ArrayList<>();

        System.out.print("Informe o número de funcionários: ");
        Integer numeroFuncionarios = entrada.nextInt();

        for (int i = 1; i <= numeroFuncionarios; i++) {
            System.out.println("Dados do funcionário #" + i);
            System.out.print("É funcinário terceirizado? (S/N) ");
            Character simNao = entrada.next().charAt(0);
            System.out.print("Nome: ");
            entrada.nextLine();
            String nomeFuncionario = entrada.nextLine();
            System.out.print("Horas trabalhadas: ");
            Integer horasTrabalhadas = entrada.nextInt();
            System.out.print("Valor por hora: ");
            Double valorPorHora = entrada.nextDouble();
            if (simNao == 'S') {
                System.out.print("Despesa adicional: ");
                Double despesaAdicional = entrada.nextDouble();
                FuncionarioTerceirizado funcionarioTerceirizado = new FuncionarioTerceirizado(
                        nomeFuncionario, horasTrabalhadas, valorPorHora, despesaAdicional);
                listaFuncionarios.add(funcionarioTerceirizado);
            } else {
                Funcionario funcionario = new Funcionario(
                        nomeFuncionario, horasTrabalhadas, valorPorHora);
                listaFuncionarios.add(funcionario);
            }
        }

        System.out.println();
        System.out.println("PAGAMENTOS: ");
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println(funcionario.getNomeFuncionario() + " - R$ " +
                    String.format("%.2f", funcionario.pagamentoFuncionario()));
        }

    }

}