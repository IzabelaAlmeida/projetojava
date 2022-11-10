package Service;

import Model.PalavrasParaFiltrar;

import java.util.ArrayList;

public class StartTranformaArray {
   public void startTranformaArray(){

       PalavrasParaFiltrar array = new PalavrasParaFiltrar();

        ArrayList<String> lis = new ArrayList<>();
        for (String text : array.getArrayPalavra()) {
            lis.addAll(SeparadorPalavras.separadorPalavras(text));
        }
        ImprimiMaiorPalavra.maiorpalavra(lis);
    }
}
