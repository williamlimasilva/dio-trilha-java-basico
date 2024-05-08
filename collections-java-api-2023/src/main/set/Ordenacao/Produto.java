package main.set.Ordenacao;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private long cod;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long cod, String nome, double preco, int quantidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return getCod() == produto.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCod());
    }

    @Override
    public String toString() {
        return "[ cod = " + cod +
                ", nome = " + nome + '\'' +
                ", preco = " + preco +
                ", quantidade = " + quantidade + " ]\n";
    }

    public long getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
