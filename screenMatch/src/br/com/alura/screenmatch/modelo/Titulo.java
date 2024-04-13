package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.excessao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nome;
    private int anoDeLancamento;
    @SerializedName("Year")
    private boolean incluidoNoOlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacaoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) throws ErroDeConversaoDeAnoException {
        this.nome = meuTituloOmdb.title();
        if(meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Nao consegui converter o ano");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoOlano(boolean incluidoNoOlano) {
        this.incluidoNoOlano = incluidoNoOlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoOlano() {
        return incluidoNoOlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("nome do fulme: " + nome);
        System.out.println("ano de lancamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacaoes++;
    }

    public double obterMedias(){
        return somaDasAvaliacoes/totalDeAvaliacaoes;
    }

    public int getTotalDeAvaliacaoes(){
        return totalDeAvaliacaoes;
    }

    @Override
    public int compareTo(Titulo titulo) {
        return this.getNome().compareTo(titulo.getNome());
    }

    @Override
    public String toString() {
        return
                "nome = " + nome +
                " anoDeLancamento = " + anoDeLancamento +
                " duracao = " + duracaoEmMinutos;
    }
}
