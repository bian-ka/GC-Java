package org.example;

public class ExemploDeUso {
    public static void main(String[] args) {

        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);
        Moto minhaMoto = new Moto("Honda", "CG 160 Fan", 2018);

        int distanciaCarro = 150;
        int distanciaMoto = 180;

        double custoCarro = meuCarro.calcularCustoViagem(distanciaCarro);
        double custoMoto = minhaMoto.calcularCustoViagem(distanciaMoto);

        System.out.println("O custo da viagem de carro é de R$: " + custoCarro);
        System.out.println("O custo da viagem de moto é de R$: " + custoMoto);
    }
}
