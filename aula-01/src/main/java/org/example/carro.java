package org.example;

import java.util.Scanner;

public class carro extends exercicio01 {
    //Scanner carro = new Scanner(System.in);

    @Override
    public double calcularCustoViagem(int distancia) {
       return distancia * 0.20;
    }
}