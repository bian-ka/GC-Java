package org.example.aula02;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

        int operacao;
        double resultado = 0;

        System.out.println("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = input.nextDouble();

        System.out.println("Digite a operação desejada");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("Operação: ");
        operacao = input.nextShort();

        switch (operacao) {
            case 1:
               resultado  = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("ERRO: Divisor não pode ser zero. Tente novamente.");
                    break;
                }
                resultado = num1 / num2;
                break;

        }

        System.out.println("O resultado da operação é: " + resultado);

        System.out.println("Digite qualquer coisa para continuar e N para encerrar.");
        String entrada = input.next();

        if(entrada.equalsIgnoreCase("n")) {
            break;
        }
        }
    }
}
