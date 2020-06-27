package Secao14.PagamentoFuncionariosPolimorfismo.Entities;

public class Funcionario {

    private String nomeFuncionario;
    private Integer horasTrabalhoFuncionario;
    private Double valorPorHoraFuncionario;

    public Funcionario() {
    }

    public Funcionario(String nomeFuncionario, Integer horasTrabalhoFuncionario, Double valorPorHoraFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.horasTrabalhoFuncionario = horasTrabalhoFuncionario;
        this.valorPorHoraFuncionario = valorPorHoraFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Integer getHorasTrabalhoFuncionario() {
        return horasTrabalhoFuncionario;
    }

    public void setHorasTrabalhoFuncionario(Integer horasTrabalhoFuncionario) {
        this.horasTrabalhoFuncionario = horasTrabalhoFuncionario;
    }

    public Double getValorPorHoraFuncionario() {
        return valorPorHoraFuncionario;
    }

    public void setValorPorHoraFuncionario() {
        this.valorPorHoraFuncionario = valorPorHoraFuncionario;
    }

    public Double pagamentoFuncionario() {
        return horasTrabalhoFuncionario * valorPorHoraFuncionario;
    }

}