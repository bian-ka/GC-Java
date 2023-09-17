package org.example.aula02;

import java.util.Scanner;

public class InverteString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite alguma coisa.");
        String entrada = scanner.nextLine();

        String invertida = inverterString(entrada);
        System.out.println("Foi isso que você digitou?" + invertida);

        scanner.close();
    }

    public static String inverterString(String str){
        StringBuilder invertida = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida.append(str.charAt(i));
        }
        return invertida.toString();
    }
}
