package org.example;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// exercicio 03 da aula-05
public class ListaDeTarefas {
    public static void main(String[] args) {

        List<Tarefa> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Escolha uma opção.");
            System.out.println("1. Adicionar tarefa.");
            System.out.println("2. Remover tarefa.");
            System.out.println("3. Exibir todas as tarefas");
            int entradaMenu = scanner.nextInt();

            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            switch (entradaMenu) {
                case 1:
                    System.out.println("Titulo: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Data '2000-03-20': ");
                    String data = scanner.nextLine();
                    System.out.println("Descrição: ");
                    String descricao = scanner.nextLine();

                    Tarefa tarefa = new Tarefa(titulo, LocalDate.parse(data), descricao);
                    lista.add(tarefa);
                    break;

                case 2:
                    System.out.println("Digite o número da tarefa que deseja remover: ");
                    int remover = scanner.nextInt();
                    lista.remove(remover);
                    break;

                case 3:
                    System.out.println(lista);
            }

            System.out.println("Escolha");
            System.out.println("1. menu");
            System.out.println("2. sair");
            int escolha = scanner.nextInt();

            if (escolha == 2) {
                break;
            }

        }

    }
}
