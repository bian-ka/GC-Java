package org.example;
import java.time.LocalDate;

// exercicio 06 da aula-05
public class Reserva {

    private String nome;
    private String local;
    private String cpf;
    private String quemReservou;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;

    public Reserva (String nome, String local, String cpf, String quemReservou, LocalDate dataEntrada, LocalDate dataSaida) {
        this.nome = nome;
        this.local = local;
        this.cpf = cpf;
        this.quemReservou = quemReservou;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public String toString () {
        return ("\n" + "Nome: " + nome + ", Local: " + local + ", Cpf: " + cpf + ", Quem reservou: " + quemReservou + ", Data de entrada: " + dataEntrada + ", Data de saída: " + dataSaida);
    }

}
