package org.example.livro;

// exercicio 01 aula-06
public class Livros {
    public String titulo;
    public String categoria;

    public Livros (String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return titulo + categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTitulo() {
        return titulo;
    }
}
