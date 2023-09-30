package org.example.aula02;
//exercicio 07 aula 02
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (i <= 5) {
            System.out.println("Digite um número: ");
            double entrada = scanner.nextDouble();
            if (entrada < 300000)
                System.out.println("Leônidas dia: UM POUCO MAIS!!");
            else
                System.out.println("Leônidas dia: UM POUCO MENOS!!");
            i++;
        }
        scanner.close();
    }
}
