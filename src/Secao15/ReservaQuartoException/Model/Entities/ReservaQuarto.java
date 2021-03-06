package Secao15.ReservaQuartoException.Model.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import Secao15.ReservaQuartoException.Model.Exceptions.DomainException;

public class ReservaQuarto {

    private Integer numeroQuarto;
    private Date dataCheckin;
    private Date dataCheckout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ReservaQuarto(Integer numeroQuarto, Date dataCheckin, Date dataCheckout) throws DomainException {
        if (!dataCheckout.after(dataCheckin)) {
            throw new DomainException("A data de Checkout deve ser superior a de Checkin");
        }
        this.numeroQuarto = numeroQuarto;
        this.dataCheckin = dataCheckin;
        this.dataCheckout = dataCheckout;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getDataCheckin() {
        return dataCheckin;
    }

    public Date getDataCheckout() {
        return dataCheckout;
    }

    public Long duracaoEstadia() {
        long diferenca = dataCheckout.getTime() - dataCheckin.getTime(); //Retorna a diferença em Milisegundos
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS); //Transforma o resultado em dias
    }

    public void atualizarDatas(Date dataCheckin, Date dataCheckout) throws DomainException {
        Date agora = new Date();
        if (dataCheckin.before(agora) || dataCheckout.before(agora)) {
            throw new DomainException("A data não pode ser inferior a data atual");
        } else if (!dataCheckout.after(dataCheckin)) {
            throw new DomainException("A data de Checkout deve ser superior a de Checkin");
        }
        this.dataCheckin = dataCheckin;
        this.dataCheckout = dataCheckout;
    }

    @Override
    public String toString() {
        return "Quarto " +
                numeroQuarto +
                ", Checkin: " + sdf.format(dataCheckin) +
                ", Checkout: " + sdf.format(dataCheckout) +
                ", " + duracaoEstadia() +
                " noites.";
    }

}