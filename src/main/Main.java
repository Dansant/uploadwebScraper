package main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main (String[] args){
        try {

            Document doc = Jsoup.connect("https://www.kabum.com.br/produto/105009/teclado-mecanico-gamer-hyperx-alloy-origins-core-rgb-switch-hyperx-red-abnt2-hx-kb7rdx-br").get();

            System.out.printf("\nNome: %s\n\n", doc.title());



            Elements produto = doc.getElementsByClass("sc-bQVnZi hgxyQz");


            for (Element products : produto) {


                String produtoValor = products.getElementsByClass("sc-lhuRmv cIGWul").text();
                String produtoDescricao = products.getElementsByClass("sc-iktFfs kHSrKt").text();
                String produtoTexto = products.getElementsByClass("sc-bYEvvW dHnsuj").text();
                String produtoInf = products.getElementsByClass("sc-hBmvmq QPbEZ").text();
                String produtoGarant = products.getElementsByClass("sc-aqkpO bFstbm").text();

                System.out.println(produtoValor);
                System.out.println(produtoDescricao);
                System.out.println(produtoTexto);
                System.out.println(produtoInf);
                System.out.printf(produtoGarant);


            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
