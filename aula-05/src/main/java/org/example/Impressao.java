package org.example;

// exercicio 05 da aula-05
public class Impressao {

    private String nome;
    private int numeroPaginas;

    public Impressao (String nome, int numeroPaginas) {
        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
    }

    public String toString() {
        return ("\n" + "Nome: " + nome + ", Número páginas: " + numeroPaginas);
    }
}
