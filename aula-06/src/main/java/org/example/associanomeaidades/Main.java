package org.example.associanomeaidades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//exercicio 02 aula-06
public class Main {

    public static void main(String[] args) {
        Map<String, Integer> nomesEIdades = new HashMap<>();
        nomesEIdades.put("Satoru Gojo", 28);
        nomesEIdades.put("Itadori", 15);
        nomesEIdades.put("Fushiguro", 16);
        nomesEIdades.put("Getou", 27);
        //terceira idade
        nomesEIdades.put("Sukuna", 1000);
        nomesEIdades.put("Toji", 62);

        AssociaNomeAIdades nomesEIdadesDoJujutsuKaisen = new AssociaNomeAIdades(nomesEIdades);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String entradaNome = scanner.nextLine();

        nomesEIdadesDoJujutsuKaisen.imprimeIdadeApartirDeUmNome(entradaNome);

        nomesEIdadesDoJujutsuKaisen.imprimePessoasNaTerceiraIdade();
    }
}
