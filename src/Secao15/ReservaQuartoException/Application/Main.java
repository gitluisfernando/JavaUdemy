package Secao15.ReservaQuartoException.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Secao15.ReservaQuartoException.Model.Entities.ReservaQuarto;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Número do Quarto: ");
        Integer numeroQuarto = entrada.nextInt();
        System.out.print("Data de CheckIn (dd/MM/aaaa): ");
        Date dataCheckin = sdf.parse(entrada.next());
        System.out.print("Data de CheckOut (dd/MM/aaaa): ");
        Date dataCheckout = sdf.parse(entrada.next());

        if (!dataCheckout.after(dataCheckin)) {
            System.out.println("Erro na reserva: A data de Checkout deve ser superior a de Checkin");
        } else {
            ReservaQuarto reservaQuarto = new ReservaQuarto(numeroQuarto, dataCheckin, dataCheckout);
            System.out.println("Reserva: " + reservaQuarto);

            System.out.println();
            System.out.println("Entre com os dados para atualizar a reserva: ");
            System.out.print("Data de CheckIn (dd/MM/aaaa): ");
            dataCheckin = sdf.parse(entrada.next());
            System.out.print("Data de CheckOut (dd/MM/aaaa): ");
            dataCheckout = sdf.parse(entrada.next());

            String erro = reservaQuarto.atualizarDatas(dataCheckin, dataCheckout);
            if (erro != null) {
                System.out.println("Erro na reserva: " + erro);
            } else {
                System.out.println("Reserva: " + reservaQuarto);
            }
        }

    }

}