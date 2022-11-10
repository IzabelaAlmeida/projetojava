package Service;

import java.util.ArrayList;

public class SeparadorPalavras {
    static ArrayList<String> separadorPalavras(String palavras) {

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
}
