package org.example;

import java.util.Scanner;

public class CompraAutomovel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua idade? ");
        int idade = scanner.nextInt();

        System.out.println("Digite o valor do seu salário.");
        double salario = scanner.nextDouble();

        if (idade >= 18 && salario >= 2000.0) {
            System.out.println("Você pode comprar um automóvel!");
        } else {
            System.out.println("Você não pode comprar um automóvel.");
        }

        scanner.close();
    }
}
