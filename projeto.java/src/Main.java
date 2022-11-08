import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] arrayPalavra = {"acbda", "fasdlkh", "poiwqd", "zxcqwtop", "qfgophl"};

        int n = 0;
        ArrayList<String> lis = new ArrayList<>();
        for (String text : arrayPalavra) {
            lis.addAll(separadorPalavras(text));
        }
        maiorpalavra(lis);
    }
    private static ArrayList<String> separadorPalavras(String palavras) {

        int nChar = 0;
        StringBuilder novaPalavra = new StringBuilder();
        ArrayList<String> array = new ArrayList<>();
        int n = 0;

        for (int i = 0; i < palavras.length(); i++) {

            if (palavras.charAt(i) >= nChar) {
                novaPalavra.append(palavras.charAt(i));
                array.add(n, String.valueOf(novaPalavra));
            } else {
                n++;
                novaPalavra = new StringBuilder("");
                novaPalavra.append(palavras.charAt(i));
                array.add(n, String.valueOf(novaPalavra));
            }
            nChar = palavras.charAt(i);
        }
        return array;
    }
    private static void maiorpalavra(ArrayList<String> lis) {

        ArrayList<String> lista = new ArrayList<>();
        int n = 1;
        for (int i = 0; i < lis.size(); i++) {
            if (lis.get(i).length() > n) {
                lista.add(lis.get(i));
                n = lis.get(i).length();
            }
        }
        String texto = null;
        int n2 = 1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).length() > n2) {
                texto = lista.get(i);
                n2 = lista.get(i).length();
            }
        }
        System.out.println("Filtrando...");
        System.out.println(lis);
        System.out.println(lista + "\n");
        System.out.println("A maior sequencia é: " + texto);
    }
}