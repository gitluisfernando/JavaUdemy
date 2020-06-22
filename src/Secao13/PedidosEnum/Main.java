package Secao13.PedidosEnum;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(1080, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);
        System.out.println(pedido.toString());

        StatusPedido statusPedido1 = StatusPedido.ENTREGUE;
        StatusPedido statusPedido2 = StatusPedido.valueOf("ENTREGUE");

        System.out.println(statusPedido1);
        System.out.println(statusPedido2);

    }

}
