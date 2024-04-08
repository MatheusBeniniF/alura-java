import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefao", 2015);
        meuFilme.setDuracaoEmMinutos(210);
        System.out.println("Duracao do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.obterMedias());
        System.out.println("Total de avaliacoes: " + meuFilme.getTotalDeAvaliacaoes());

        Serie lost = new Serie("Lost", 2001);
        lost.setEpisodiosPorTemporada(10);
        lost.setTemporadas(10);
        lost.setMinutosPorEpisodios(50);
        System.out.println("Duracao da serie: " + lost.getDuracaoEmMinutos() + " minutos");

        Filme outroFilme = new Filme("Avatar", 2010);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);

        System.out.println("Tempo necessario para assistir: "+ calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setSerie(lost);
        episodio.setNumero(1);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme("DogVille", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista de filme: " + listaDeFilmes.size());
        System.out.println("Primeiro item da lista: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
    }
}