package org.example;

import java.util.Scanner;
import java.time.Year;
import java.time.MonthDay;

public class CalculaIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu ano de nascimento? ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = Year.now().getValue();

        int idade = anoAtual - anoNascimento;

        MonthDay dataAtual = MonthDay.now();

        if (dataAtual.isBefore(MonthDay.of(1, 1))) {
            idade--;
        }

        System.out.println("Sua idade é: " +idade + " anos");

        scanner.close();

    }
}
