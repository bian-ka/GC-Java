package org.example;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// exercicio 05 da aula-05
public class FilaImpressao {
    public static void main(String[] args) {

        List<Impressao> impressoes = new LinkedList<>();

        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Adicionando documentos a fila.");
            System.out.println("Nome: ");
            String entradaNome = scanner.nextLine();
            System.out.println("Número de páginas: ");
            int entradaNPaginas = scanner.nextInt();

            Impressao novaImpressao = new Impressao(entradaNome, entradaNPaginas);
            impressoes.add(novaImpressao);

            System.out.println("Digite '1' para adicionar um novo documento a fila.");
            System.out.println("Digite '2' para imprimir todos os documentos.");
            int imprimir = scanner.nextInt();

            if (imprimir == 2) {
                break;
            }
        }

        System.out.println("Imprimindo documentos da fila: " + impressoes);
    }
}