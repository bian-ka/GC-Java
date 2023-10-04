package org.example;
import java.util.Scanner;

//exercicio 01 da aula 05
public class CalculaSomaEMedia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + " número inteiro: ");
            numeros[i] = input.nextInt();
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        double media = (double) soma / 5;
        System.out.println("A soma de todos os numeros é: " + soma);
        System.out.println("A média de todos os números é: " + media);

    }
}
