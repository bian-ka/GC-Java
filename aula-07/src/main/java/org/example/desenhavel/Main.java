package org.example.desenhavel;

// exercicio 01 aula-07
public class Main {
    public static void main(String[] args) {

        Circulo novoCirculo = new Circulo();
        Quadrado novoQuadrado = new Quadrado();

        novoCirculo.desenhar();
        novoQuadrado.desenhar();
        novoQuadrado.desenharQuadrado();
    }
}
