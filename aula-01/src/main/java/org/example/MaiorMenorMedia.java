package org.example;

import java.util.Scanner;

public class MaiorMenorMedia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite mais um número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Agora, digite o ultimo número:  ");
        double numero3 = scanner.nextDouble();

        double maior = Math.max(numero1, Math.max(numero2, numero3));
        double minimo = Math.min(numero1, Math.min(numero2, numero3));

        double media = (numero1 + numero2 + numero3) / 3.0;

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + minimo);
        System.out.println("A média aritmética é: " + media);

        scanner.close();
    }
}
