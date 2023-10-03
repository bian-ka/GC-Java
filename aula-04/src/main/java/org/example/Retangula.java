package org.example;

//exercicio 02 da aula 04
public class Retangula extends FormaGeometrica {

    private double base;
    private double altura;

    public Retangula(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
