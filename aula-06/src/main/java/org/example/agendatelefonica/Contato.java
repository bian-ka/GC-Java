package org.example.agendatelefonica;

// exercicio 03 aula-06
public class Contato {
    private String telefone;
    private String nome;
    private String endereco;
    private Localidade localDaCidade;

    public Contato (String telefone, String nome, String endereco, Localidade localDaCidade) {
        this.telefone = telefone;
        this.nome = nome;
        this.endereco = endereco;
        this.localDaCidade = localDaCidade;
    }

    public String getNome() {
        return this.nome;
    }

    public Localidade getLocalidade() {
        return this.localDaCidade;
    }

    public String toString() {
        return "{Nome: " + nome +
                "\nTelefone: " + telefone +
                "\nEndereço: " + endereco + "}";
    }
}
