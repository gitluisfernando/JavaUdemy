package Secao13.PedidoDeProdutos.Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedidos {

    private Date dataHoraPedido;
    private StatusPedido statusPedido;
    private Clientes cliente;
    private List<ItensPedido> itensPedido = new ArrayList<>();
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


    public Pedidos(Date dataHoraPedido, StatusPedido statusPedido, Clientes cliente) {
        this.dataHoraPedido = dataHoraPedido;
        this.statusPedido = statusPedido;
        this.cliente = cliente;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public List<ItensPedido> getItensPedido() {
        return itensPedido;
    }

    public void adicionarItem(ItensPedido itemPedido) {
        itensPedido.add(itemPedido);
    }

    public void removerItem(ItensPedido itemPedido) {
        itensPedido.remove(itemPedido);
    }

    public Double totalPedido() {
        Double somaTotal = 0.0;
        for (ItensPedido item : itensPedido) {
            somaTotal = somaTotal + item.subTotal();
        }
        return somaTotal;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Data/Hora Pedido: ");
        stringBuilder.append(sdf.format(dataHoraPedido) + "\n");
        stringBuilder.append("Status do Pedido: ");
        stringBuilder.append(statusPedido + "\n");
        stringBuilder.append("Cliente: ");
        stringBuilder.append(cliente + "\n");
        stringBuilder.append("Itens Pedido:\n");
        for (ItensPedido item : itensPedido) {
            System.out.println(item + "\n");
        }
        stringBuilder.append("Preço Total: R$");
        stringBuilder.append(String.format("%.2f", totalPedido()));
        return stringBuilder.toString();
    }
}