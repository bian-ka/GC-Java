package org.example;

import java.time.LocalDate;

// exercicio 04 da aula-05
public class Compra {

    private String nome;
    private LocalDate dataValidade;

    public Compra (String nome, LocalDate dataValidade) {
        this.nome = nome;
        this.dataValidade = dataValidade;
    }

    public String toString() {
        return ("N: " + nome + ", D: " + dataValidade);
    }
}
