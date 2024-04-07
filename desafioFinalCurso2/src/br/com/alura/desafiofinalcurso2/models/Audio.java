package br.com.alura.desafiofinalcurso2.models;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void reproduz() {
        this.totalReproducoes++;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curte() {
        this.curtidas++;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
