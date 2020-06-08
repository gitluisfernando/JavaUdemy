package Secao10.ExemploForEach;

public class Main {

    public static void main(String[] args) {
        String[] vetor = new String[] { "Bianca", "Isailda", "Ademir" };

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("--------------------");

        for (String objeto : vetor) {
            System.out.println(objeto);
        }
    }

}
