package org.example;

import java.util.Scanner;

public class Carro extends Veiculo {

    private static final double custoPorQuilometro = 0.20;
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo,ano);
    }
    @Override
    public double calcularCustoViagem(int distancia) {
        return distancia * custoPorQuilometro;
    }
}
