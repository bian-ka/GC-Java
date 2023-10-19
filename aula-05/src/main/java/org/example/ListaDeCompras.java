package org.example;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// exercicio 04 da aula-05
public class ListaDeCompras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Compra> compras = new ArrayList<Compra>();

        while (true) {
            System.out.println("Lista de Compras");
            System.out.println("1. Adicionar itens");
            System.out.println("2. Remover itens");
            System.out.println("3. Exibir lista atual");
            int escolha = scanner.nextInt();

            if(scanner.hasNextLine()) {
                scanner.nextLine();
            }

            switch (escolha) {
                case 1:
                    System.out.println("Novo item!");
                    System.out.println("Nome: ");
                    String nomeItem = scanner.nextLine();
                    System.out.println("Data (2000-12-01): ");
                    String dataItem = scanner.nextLine();

                    Compra novaLista = new Compra(nomeItem, LocalDate.parse(dataItem));
                    compras.add(novaLista);
                    break;

                case 2:
                    System.out.println("Digite o número do item que deseja remover: ");
                    int remover = scanner.nextInt();
                    compras.remove(remover);
                    break;

                case 3:
                    System.out.println("Lista de compras atual: ");
                    System.out.println(compras);

            }

            System.out.println("1. Para voltar ao Menu.");
            System.out.println("2. Para sair");
            int entrada = scanner.nextInt();

            if(entrada == 2) {
                break;
            }
        }
    }
}
