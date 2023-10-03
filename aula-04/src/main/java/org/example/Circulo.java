package org.example;

//exercicio 02 da aula 04
public class Circulo extends FormaGeometrica {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
