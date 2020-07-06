package Secao15.ReservaQuartoException.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Secao15.ReservaQuartoException.Model.Entities.ReservaQuarto;
import Secao15.ReservaQuartoException.Model.Exceptions.DomainException;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Número do Quarto: ");
            Integer numeroQuarto = entrada.nextInt();
            System.out.print("Data de CheckIn (dd/MM/aaaa): ");
            Date dataCheckin = sdf.parse(entrada.next());
            System.out.print("Data de CheckOut (dd/MM/aaaa): ");
            Date dataCheckout = sdf.parse(entrada.next());

            ReservaQuarto reservaQuarto = new ReservaQuarto(numeroQuarto, dataCheckin, dataCheckout);
            System.out.println("Reserva: " + reservaQuarto);

            System.out.println();
            System.out.println("Entre com os dados para atualizar a reserva: ");
            System.out.print("Data de CheckIn (dd/MM/aaaa): ");
            dataCheckin = sdf.parse(entrada.next());
            System.out.print("Data de CheckOut (dd/MM/aaaa): ");
            dataCheckout = sdf.parse(entrada.next());

            reservaQuarto.atualizarDatas(dataCheckin, dataCheckout);
            System.out.println("Reserva: " + reservaQuarto);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido");
        } catch (DomainException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro Inesperado");
        }

    }

}