package org.example.desenhavel;

// exercicio 01 aula-07
public class Quadrado implements Desenhavel {
    @Override
    public void desenhar() { //implementações diferentes para o método desenhar();
        System.out.println("Vou desenhar um quadrado.");
    }

    public void desenharQuadrado() { //método específico da classe
        System.out.println("Legal desenhar quadrados!");
    }
}
