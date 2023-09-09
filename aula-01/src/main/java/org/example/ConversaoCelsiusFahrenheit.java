package org.example;

import java.util.Scanner;

public class ConversaoCelsiusFahrenheit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius.");
        double temperaturaCelsius = scanner.nextDouble();

        double fahrenheit = (temperaturaCelsius * 9/5) + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);

        scanner.close();
    }
}
