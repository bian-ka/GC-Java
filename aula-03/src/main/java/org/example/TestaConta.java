package org.example;
import java.util.Scanner;
//exercicio 01 da aula 03
public class TestaConta {

    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Lana Del Rey", "000.000.000-00", "122-122-22", "Love Song", "California, LA");

        minhaConta.deposita(250.0);
        minhaConta.saca(50.0);
        minhaConta.verificarInformacoes();

        ContaBancaria outraConta = new ContaBancaria("Satoru Gojo", "123.456.789-10", "123-456", "Jujuso Kaisen", "Tokio, Japão");

        minhaConta.transfere(outraConta, 25.0);

        outraConta.deposita(200.0);
        outraConta.transfere(minhaConta, 950.0);
        outraConta.verificarInformacoes();

    }
}
