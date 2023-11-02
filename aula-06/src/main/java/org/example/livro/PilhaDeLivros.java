package org.example.livro;
import java.util.ArrayList;
import java.util.Stack;

// exercicio 01 aula-06
public class PilhaDeLivros {
    public static void main(String[] args) {

        Stack<Livros> pilha = new Stack<>();

        pilha.push(new Livros("O Pequeno Príncipe", " Literatura Infantil"));
        pilha.push(new Livros("Uma Breve História do Tempo", " Ciência"));
        pilha.push(new Livros("1984", " Ficção"));
        pilha.push(new Livros("A Culpa é das Estrelas", " Romance"));
        pilha.push(new Livros("O Códio da Vinci", " Ficção"));
        pilha.push(new Livros("Se Eu Ficar", " Romance"));

        ArrayList<String> generosExibidos = new ArrayList<>(pilha.size());

        for (int i = 0; i < pilha.size(); i ++) {
            Livros livroAtual = pilha.get(i);
            String generoAtual = livroAtual.getCategoria();

            boolean generoJaFoiExibido = false;
            for (int j = 0; j < generosExibidos.size(); j++) {
                if (generoAtual.equalsIgnoreCase(generosExibidos.get(j))) {
                    generoJaFoiExibido = true;
                    break;
                }
            }

            if (generoJaFoiExibido) {
                continue;
            } else {
                generosExibidos.add(generoAtual);
            }

            System.out.println("Gênero de " + generoAtual + ":");

            for (int j = i; j < pilha.size(); j++) {
                Livros livroParaSerExebidos = pilha.get(j);
                if (livroParaSerExebidos.getCategoria().equalsIgnoreCase(generoAtual)) {
                    System.out.println(
                        "- " +
                        livroParaSerExebidos.getTitulo()
                    );
                }
            }
        }

        while(pilha.empty() == false) {
            pilha.pop();
        }

        System.out.println(pilha);

    }
}
