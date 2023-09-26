package org.example;
//exercicio 01 aula-04
import java.util.Scanner;

public class Moto extends Veiculo {
    private static final double custoPorQuilometro = 0.15;
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double calcularCustoViagem(int distancia) {
        return distancia * custoPorQuilometro;
    }

}
