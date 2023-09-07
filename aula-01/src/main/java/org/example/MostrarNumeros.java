package org.example;

import java.util.Scanner;

public class MostrarNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");

        int numero2 = scanner.nextInt();

        System.out.println("Primeiro número: " + numero1);
        System.out.println("Segundo número: " + numero2);
    }

}
