package org.example;

import java.time.LocalTime;

public class ContaBancaria {

    public static void main(String[] args) {

        ContaBancaria ContaBancaria = new ContaBancaria();
    }

    String nome;
    private String cpf;
    int identificadorConta;
    String banco;
    private String endereco;
    private double saldo;

    public void saca (double valor) {
        if (this.saldo >= valor) {
            this.saldo = saldo - valor;
        }else {
            System.out.println("O saque não pode ser realizado.");
        }
    }

    public void deposita (double valor) {
        this.saldo = saldo + valor;
    }

    public double pix (ContaBancaria destino, double valor) {
        if(this.saldo >= valor) {
            this.saldo = saldo - valor;
            destino.saldo = destino.saldo + valor;
        }else {
            System.out.println("Não foi possível realizar a transferencia pix.");
        }
        return this.saldo;
    }

    public void transfere (ContaBancaria destino, double valor) {
        LocalTime seteHoras = LocalTime.of(19,0);
        LocalTime oitoHoras = LocalTime.of(8,0);
        if (this.saldo >= valor && LocalTime.now().isBefore(seteHoras) && LocalTime.now().isAfter(oitoHoras)) {
            this.saldo = this.saldo - valor;
            destino.saldo = destino.saldo + valor;
        }else {
            System.out.println("A transferência não pode ser realizada.");
        }
    }

    public double verificaSaldo(double saldo) {
        System.out.println("O saldo atual é: " + saldo);
        return saldo;
    }

    public void verificarHoraraio() {
        LocalTime horarioAtual = LocalTime.now();
        System.out.println("Horário atual: " + horarioAtual);
    }

    public void verificarInformacoes() {
        System.out.println("Estas são as informações da conta bancária: " + nome + cpf + identificadorConta + banco + endereco);
    }

}