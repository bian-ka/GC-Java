package org.example;

import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salarioMinimo = 1320.0;

        System.out.println("Digite o valor do seu salário: ");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeSlariosMinimos = salarioUsuario / salarioMinimo;

        System.out.println("Você recebe aproximadamente " + quantidadeSlariosMinimos + " salários mínimos.");

        scanner.close();
    }



}
