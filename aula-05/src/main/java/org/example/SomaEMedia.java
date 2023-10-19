package org.example;
import java.util.Scanner;

//exercicio 01 da aula-05
public class SomaEMedia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arrayNumeros [] = new int[5];

        for (int numeroAtual = 0; numeroAtual < 5; numeroAtual++) {
            System.out.println("Digite " + (numeroAtual + 1) + " número inteiro:");
            arrayNumeros[numeroAtual] = scanner.nextInt();
        }

        int soma = 0;
        //para cada "numero" dentro de "arrayNumeros", "soma" recebe o valor armazenado em "soma" (é zero) mais "numero". Numero é a minha entrada.
        for (int numero : arrayNumeros) {
            soma = soma + numero;
        }

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + soma / 5.0  );
    }
}
