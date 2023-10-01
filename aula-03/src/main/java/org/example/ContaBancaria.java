package org.example;
import java.time.LocalTime;
//exercicio 01 da aula 03
public class ContaBancaria {

    public String nome;
    private String cpf;
    public String identificadorConta;
    public String banco;
    private String endereco;
    private double saldo;
    //construtor
    public ContaBancaria(String nome, String cpf, String identificadorConta, String banco, String endereco) {
        this.nome = nome;
        this.cpf =cpf;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = 0.0;
    }
    //SACA
    public void saca (double valor) {
        if (this.saldo >= valor) {
            this.saldo = saldo - valor; //saldo-= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso");
        } else {
            System.out.println("O saque não pode ser realizado pois o é saldo insuficiente");
        }
    }
    //DEPOSITA
    public void deposita (double valor) {
        if (this.saldo >= 0) {
            this.saldo = saldo += valor; //saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Depósito não pode ser realizado. Tente novamente mais tarde.");
        }

    }
    //PIX CONFERIR!!!
    public double pix (double valor) {
        if(this.saldo >= valor) {
            this.saldo = saldo -= valor; //saldo -= valor;
            System.out.println("Tranferência PIX no valor de R$" + valor + " realizado com sucesso.");
        }else {
            System.out.println("Não foi possível realizar a transferência PIX. Tente novamente mais tarde.");
        }
        return this.saldo;
    }
    //TRANSFERE
    public void transfere (ContaBancaria destino, double valor) {
        LocalTime seteHoras = LocalTime.of(19,0);
        LocalTime oitoHoras = LocalTime.of(8,0);
        if (this.saldo >= valor && LocalTime.now().isBefore(seteHoras) && LocalTime.now().isAfter(oitoHoras)) {
            this.saldo = this.saldo - valor;
            destino.deposita(valor);
            System.out.println("Transferência de R$" + valor + " realizada para a conta de " + destino.getNome() + ".");
        } else {
            System.out.println("A transferência não pode ser realizada por falta de saldo.");
        }
    }
    //VERIFICA SALDO
    public double verificaSaldo(double saldo) {
        System.out.println("O saldo atual é: " + saldo);
        return saldo;
    }
    //VERIFICA HORARIO
    public void verificarHoraraio() {
        LocalTime horarioAtual = LocalTime.now();
        System.out.println("Horário atual: " + horarioAtual);
    }
    //VERIFICA INFORMAÇÕES
    public void verificarInformacoes() {
        System.out.println("Nome do títular: " + nome);
        System.out.println("CPF do títular: " + cpf);
        System.out.println("Número identificador da conta: " + identificadorConta);
        System.out.println("Banco: " + banco);
        System.out.println("Endereço do títular: " + endereco);
        verificaSaldo(saldo);
        verificarHoraraio();

    }

    public String getNome() {
        return nome;
    }
}
