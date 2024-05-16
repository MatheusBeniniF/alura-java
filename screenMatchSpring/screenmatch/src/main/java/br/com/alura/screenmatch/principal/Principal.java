package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosEpisodios;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporadas;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);

    private ConsumoApi consumo = new ConsumoApi();

    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";

    private final String SEASON = "&season=";

    private final String API_KEY = "&apikey=af37b6b6";

    public void exibeMenu(){
        System.out.println("Digite o nome da serie");
        var nomeSerie = leitura.nextLine();

        String endereco = ENDERECO + nomeSerie.replace(" ", "+") + API_KEY;
        var json = consumo.obterDados(endereco);

        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);

        List<DadosTemporadas> temporadas = new ArrayList<>();

        for (int i = 1; i <= dados.totalTemporadas(); i++) {
            endereco = ENDERECO + nomeSerie.replace(" ", "+" ) + SEASON + i + API_KEY;
            json = consumo.obterDados(endereco);
            DadosTemporadas dadosTemporada = conversor.obterDados(json, DadosTemporadas.class);
            temporadas.add(dadosTemporada);
        }

        temporadas.forEach(System.out::println);
        
        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));
    }
}
