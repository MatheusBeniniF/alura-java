package br.com.alura.desafiocurso3.models;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: " +
                "descricao='" + descricao + '\'' +
                " valor=" + valor;
    }

    @Override
    public int compareTo(Compra compra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(compra.valor));
    }
}
