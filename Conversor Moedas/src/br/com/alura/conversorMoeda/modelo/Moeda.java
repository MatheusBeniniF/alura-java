package br.com.alura.conversorMoeda.modelo;

public class Moeda {
    private String nome;
    private Double valor;

    public Moeda(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double valorConvertido(Double valor, Double valorEquivalente) {
        return valor * valorEquivalente;
    }
}
