package Secao14.PagamentoFuncionariosPolimorfismo.Entities;

public class FuncionarioTerceirizado extends Funcionario {

    private Double despesaAdicionalFuncionario;

    public FuncionarioTerceirizado() {
        super();
    }

    public FuncionarioTerceirizado(String nomeFuncionario, Integer horasTrabalhoFuncionario,
                                   Double valorPorHoraFuncionario, Double despesaAdicionalFuncionario) {
        super(nomeFuncionario, horasTrabalhoFuncionario, valorPorHoraFuncionario);
        this.despesaAdicionalFuncionario = despesaAdicionalFuncionario;
    }

    public Double getDespesaAdicionalFuncionario() {
        return despesaAdicionalFuncionario;
    }

    public void setDespesaAdicionalFuncionario() {
        this.despesaAdicionalFuncionario = despesaAdicionalFuncionario;
    }

    @Override
    public Double pagamentoFuncionario() {
        return super.pagamentoFuncionario() + (despesaAdicionalFuncionario * 1.1);
    }

}