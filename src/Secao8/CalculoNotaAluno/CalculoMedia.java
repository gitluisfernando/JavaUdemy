package Secao8.CalculoNotaAluno;

public class CalculoMedia {
    String nomeAluno;
    double nota1, nota2, nota3;

    public double calculoMediaFinal() {
        nota1 = nota1 * 0.30;
        nota2 = nota2 * 0.35;
        nota3 = nota3 * 0.35;
        return nota1 + nota2 + nota3;
    }

    public double avaliacaoFinal() {
        if (calculoMediaFinal() < 6.0) {
            double notaFaltante = 6.0 - calculoMediaFinal();
            return notaFaltante;
        } else {
            return 0.0;
        }
    }

    public void resultadoAprovacao() {
        if (calculoMediaFinal() < 6.0) {
            System.out.println("Reprovado, faltou " + avaliacaoFinal());
        } else {
            System.out.println("Aprovado");
        }
    }

}