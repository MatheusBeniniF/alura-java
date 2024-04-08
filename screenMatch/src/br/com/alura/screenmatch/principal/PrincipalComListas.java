package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefao", 2015);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2010);
        outroFilme.avalia(6);
        Filme filmeDoPaulo = new Filme("DogVille", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2001);
        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificacao: " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("dps da ordenacao: " + buscaPorArtista);

        System.out.println("antes: " + lista);
        Collections.sort(lista);
        System.out.println("depois : " + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento).reversed());
        System.out.println("depois : " + lista);

    }
}
