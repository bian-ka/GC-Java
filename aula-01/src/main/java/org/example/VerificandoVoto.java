package org.example;

import java.util.Scanner;

public class VerificandoVoto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira sua idade: ");

        int idade = scanner.nextInt();

        if (idade < 16 ){
            System.out.println("Você não pode votar.");
        }else if (idade >= 16 && idade <= 17) {
            System.out.println("Seu voto é facultativo.");
        }else if(idade >= 18 && idade <= 65) {
            System.out.println("Você é obrigada a votar.");
        }else {
            System.out.println("Seu voto é facultativo");
        }

        scanner.close();
    }
}
