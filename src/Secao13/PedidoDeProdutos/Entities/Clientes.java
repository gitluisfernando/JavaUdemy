package Secao13.PedidoDeProdutos.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clientes {

    private String nomeCliente;
    private String emailCliente;
    private Date dataNascimentoCliente;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Clientes(String nomeCliente, String emailCliente, Date dataNascimentoCliente) {
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.dataNascimentoCliente = dataNascimentoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public Date getDataNascimentoCliente() {
        return dataNascimentoCliente;
    }

    public void setDataNascimentoCliente(Date dataNascimentoCliente) {
        this.dataNascimentoCliente = dataNascimentoCliente;
    }

    @Override
    public String toString() {
        return nomeCliente + " (" + sdf.format(dataNascimentoCliente) + ") - " + emailCliente;
    }

}