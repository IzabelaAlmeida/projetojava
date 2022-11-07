import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String[] arrayPalavra = {"acbda", "fasdlkh", "poiwqd", "zxcqwtop", "qfgophl"};


        String[] lis = new String[0];
        for (String text : arrayPalavra) {

            lis = separadorPalavras(text);


        }
        maiorpalavra(lis);

    }

    private static String[] separadorPalavras(String palavras){

        int nChar = 0;
        StringBuilder novaPalavra = new StringBuilder();
        //ArrayList<String> array = new ArrayList<>();
        String[] array = new String[10];
        int n = 0;

        for (int i = 0; i < palavras.length(); i++) {

            if (palavras.charAt(i) >= nChar) {
                novaPalavra.append(palavras.charAt(i));
                array[n] = (String.valueOf(novaPalavra));
            } else {
                n++;
                novaPalavra = new StringBuilder("");
                novaPalavra.append(palavras.charAt(i));
                array[n] = (String.valueOf(novaPalavra));
            }
            nChar = palavras.charAt(i);
        }
        return array;
    }

    private static void maiorpalavra(String[] lis) {

        ArrayList<String> listaSequencia = new ArrayList<>();
        int f = 0;
        List<String> newTex = null;
        for (int i = 0; i < lis.length; i++) {
            if (lis[i] != null)
                if (lis[i].length() > f) {
                    listaSequencia.add(lis[i]);
                    f = lis[i].length();
                }

        }
        newTex = listaSequencia.stream().max(Comparator.reverseOrder()).stream().collect(Collectors.toList());

        Optional<String> newTex2 = newTex.stream().distinct().max(Comparator.reverseOrder());
        System.out.println(newTex2.get());

    }
}