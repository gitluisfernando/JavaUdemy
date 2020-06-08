package Secao10.ReservaQuartosPensao;

public class QuartosPensao {
    private String nomeEstudante;
    private String emailEstudante;

    public QuartosPensao(String nomeEstudante, String emailEstudante) {
        this.nomeEstudante = nomeEstudante;
        this.emailEstudante = emailEstudante;
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }

    public String getEmailEstudante() {
        return emailEstudante;
    }

    public void setEmailEstudante(String emailEstudante) {
        this.emailEstudante = emailEstudante;
    }

    public String toString() {
        return nomeEstudante + ", " + emailEstudante;
    }
}