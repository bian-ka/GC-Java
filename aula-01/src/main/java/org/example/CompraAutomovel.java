package org.example;

import java.util.Scanner;

public class CompraAutomovel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade.");
        int idade = scanner.nextInt();

        System.out.println("Por favor, digite seu salário.");
        double salario = scanner.nextDouble();

        if(idade >= 18 && salario >= 2000.0) {
            System.out.println("Você pode comprar um automóvel!");
        }else{
            System.out.println("Sinto muito, você não pode comprar um automóvel.");
        }

        scanner.close();

    }
}
