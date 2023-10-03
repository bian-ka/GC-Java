package org.example;

//exercicio 02 da aula 04
public class Losango extends FormaGeometrica {

    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }
    @Override
    public double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }
}
