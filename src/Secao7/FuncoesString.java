package Secao7;

public class FuncoesString {

    public static void main(String[] args) {

        String textoOriginal = "abcde FGHIJ ABC abc DEFG";
        String lowerCase = textoOriginal.toLowerCase();
        String upperCase = textoOriginal.toUpperCase();
        String cortarAPartirDe = textoOriginal.substring(2);
        String cortarAPartirDeAte = textoOriginal.substring(2, 9);
        String substituir = textoOriginal.replace("a", "x");

        System.out.println("String original: " + textoOriginal);
        System.out.println("Lower Case: " + lowerCase);
        System.out.println("Upper Case: " + upperCase);
        System.out.println("Texto cortado: " + cortarAPartirDe);
        System.out.println("Texto cortado: " + cortarAPartirDeAte);
        System.out.println("Texto substituído: " + substituir);

    }

}