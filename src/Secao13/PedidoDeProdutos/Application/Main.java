package Secao13.PedidoDeProdutos.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Secao13.PedidoDeProdutos.Entities.Clientes;
import Secao13.PedidoDeProdutos.Entities.ItensPedido;
import Secao13.PedidoDeProdutos.Entities.Pedidos;
import Secao13.PedidoDeProdutos.Entities.Produtos;
import Secao13.PedidoDeProdutos.Entities.StatusPedido;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Informe os dados do cliente:");
        System.out.print("Nome: ");
        String nomeCliente = entrada.nextLine();
        System.out.print("E-mail: ");
        String emailCliente = entrada.nextLine();
        System.out.print("Data de Nascimento (dd/mm/aaaa): ");
        Date dataNascimento = sdf.parse(entrada.next());

        Clientes cliente = new Clientes(nomeCliente, emailCliente, dataNascimento);

        System.out.println("Informe os dados do pedido:");
        System.out.print("Status: ");
        StatusPedido statusPedido = StatusPedido.valueOf(entrada.next());

        Pedidos pedido = new Pedidos(new Date(), statusPedido, cliente);

        System.out.print("Informe a quantidade de itens do pedido: ");
        int qtdItensPedido = entrada.nextInt();
        for (int i = 1; i <= qtdItensPedido; i++) {
            System.out.println("Informe os dados do item #" + i + " :");
            System.out.print("Nome do Produto: ");
            entrada.nextLine();
            String nomeProduto = entrada.nextLine();
            System.out.print("Preço do Produto: ");
            Double precoProduto = entrada.nextDouble();

            Produtos produto = new Produtos(nomeProduto, precoProduto);

            System.out.print("Quantidade: ");
            int quantidadeItem = entrada.nextInt();

            ItensPedido itemPedido = new ItensPedido(quantidadeItem, precoProduto, produto);

            pedido.adicionarItem(itemPedido);
        }

        System.out.println();
        System.out.println("Sumário do Pedido:");
        System.out.println(pedido);

    }

}