package Secao14.PrecoProdutosPolimorfismo.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Secao14.PrecoProdutosPolimorfismo.Entities.Produtos;
import Secao14.PrecoProdutosPolimorfismo.Entities.ProdutosImportados;
import Secao14.PrecoProdutosPolimorfismo.Entities.ProdutosUsados;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner entrada = new Scanner(System.in);
        List<Produtos> listaProdutos = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Informe o número de produtos: ");
        Integer numeroProdutos = entrada.nextInt();

        for (int i = 1; i <= numeroProdutos; i++) {
            System.out.println("Dados do produto # " + i);
            System.out.print("Normal, Importado ou Usado? (N/I/U): ");
            Character tipoProduto = entrada.next().charAt(0);
            System.out.print("Nome: ");
            entrada.nextLine();
            String nomeProduto = entrada.nextLine();
            System.out.print("Preço: ");
            Double precoProduto = entrada.nextDouble();
            if (tipoProduto == 'N') {
                listaProdutos.add(new Produtos(nomeProduto, precoProduto));
            } else if (tipoProduto == 'I') {
                System.out.print("Taxa de Alfândega: ");
                Double taxaAlfandega = entrada.nextDouble();
                listaProdutos.add(new ProdutosImportados(nomeProduto, precoProduto, taxaAlfandega));
            } else if (tipoProduto == 'U') {
                System.out.print("Data de Fabricação (DD/MM/AAAA): ");
                Date dataFabricacao = sdf.parse(entrada.next());
                listaProdutos.add(new ProdutosUsados(nomeProduto, precoProduto, dataFabricacao));
            }
        }

        System.out.println();
        System.out.println("ETIQUETAS DE PREÇO:");
        for (Produtos produtos : listaProdutos) {
            System.out.println(produtos.etiquetaDePreco());
        }

    }

}