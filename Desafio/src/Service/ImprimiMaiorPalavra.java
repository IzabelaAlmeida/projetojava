package Service;

import Model.NovaPalavra;

import java.util.ArrayList;

public class ImprimiMaiorPalavra {
    static void maiorpalavra(ArrayList<String> lis) {

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
        NovaPalavra novaPalavra = new NovaPalavra();
        novaPalavra.setMaiorPalavra(texto);

        System.out.println("Filtrando...");
        System.out.println(lis);
        System.out.println(lista + "\n");
        System.out.println("A maior sequencia é: " + novaPalavra.getMaiorPalavra());
    }
}
