package Secao13.PedidosEnum;

import java.util.Date;

public class Pedido {

    private Integer idPedido;
    private Date dataPedido;
    private StatusPedido statusPedido;

    public Pedido() {

    }

    public Pedido(Integer idPedido, Date dataPedido, StatusPedido statusPedido) {
        this.idPedido = idPedido;
        this.dataPedido = dataPedido;
        this.statusPedido = statusPedido;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", dataPedido=" + dataPedido +
                ", statusPedido=" + statusPedido +
                '}';
    }

}
