package org.example;

//exercicio 02 da aula 04
public class Quadrado extends FormaGeometrica {

    private double lado;

    public Quadrado (double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
