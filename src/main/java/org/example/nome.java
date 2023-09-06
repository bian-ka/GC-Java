package org.example;

import java.util.Scanner;

public class nome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome: ");

        String nome = scanner.nextLine();

        System.out.println("Seu nome é: " + nome);

        scanner.close();
    }
}