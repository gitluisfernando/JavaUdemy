package Secao13.PostagensStringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario comentario1 = new Comentario("Have a nice trip");
        Comentario comentario2 = new Comentario("Wow thath's awesome!");

        Post postagem1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12
        );
        postagem1.adicionarComentario(comentario1);
        postagem1.adicionarComentario(comentario2);

        Comentario comentario3 = new Comentario("Good night");
        Comentario comentario4 = new Comentario("May the Force be with you");

        Post postagem2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night guy",
                "See you tomorrow",
                5
        );
        postagem2.adicionarComentario(comentario3);
        postagem2.adicionarComentario(comentario4);

        System.out.println(postagem1);
        System.out.println(postagem2);

    }

}
