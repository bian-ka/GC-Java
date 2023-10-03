package org.example;
import java.util.ArrayList;
import java.util.Scanner;

//exercicio 02 da aula 04
public class ListaFormasGeometricas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<FormaGeometrica> formas =  new ArrayList<>();

        formas.add(new Retangula(5,10));
        formas.add(new Circulo(10));
        formas.add(new Triangulo(8,15));
        formas.add(new Quadrado(7));
        formas.add(new Losango(3,6));

        for (FormaGeometrica forma : formas) {
            System.out.println("A área da forma: " + forma.getClass().getSimpleName() + " = " + forma.calcularArea());
        }
    }
}
