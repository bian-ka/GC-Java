package org.example.aula02;

import java.util.Scanner;

public class SeparaString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite alguma coisa.");
        String entrada = scanner.nextLine();

        if (entrada.length() % 2 != 0) {
            int metade = entrada.length() / 2;
            String primeiraMetade = entrada.substring(0, metade);

            System.out.println("Primeira metade: " + primeiraMetade);
        }else {
            System.out.println("Ops! A string deve ter um número ímpar de caracteres.");
        }

        scanner.close();
    }
}
