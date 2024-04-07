package br.com.alura.screenmatch.modelo;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoOlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacaoes;
    private int duracaoEmMinutos;

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
}
