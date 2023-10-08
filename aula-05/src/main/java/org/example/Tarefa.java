package org.example;
import java.time.LocalDate;

// exercicio 03 da aula-05
public class Tarefa {

    private String titulo;
    private LocalDate data;
    private String descricao;

    public Tarefa (String titulo, LocalDate data, String descricao) {
        this.titulo = titulo;
        this.data = data;
        this.descricao = descricao;
    }

    public String toString() {
        return "\n" + "T: " + titulo + ", D: " + data.toString() + ", Desc: " + descricao;
    }

}
