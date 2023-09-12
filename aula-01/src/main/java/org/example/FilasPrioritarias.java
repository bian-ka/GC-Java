package org.example;

import java.util.Scanner;

public class FilasPrioritarias {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione uma opção:");
        System.out.println("1. Gestante");
        System.out.println("2. Idoso");
        System.out.println("3. Pessoa com Deficiência (PCD)");
        System.out.println("4. Nenhuma das alternativas");
        System.out.println("Escolha uma opção (1/2/3/4):");

        int opcao = scanner.nextInt();

        if (opcao == 1 || opcao == 2 || opcao == 3) {
            System.out.println("Você tem direito á fila prioritária.");
        }else if (opcao == 4) {
            System.out.println("Você não tem direito á fila prioritária");
        }else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
