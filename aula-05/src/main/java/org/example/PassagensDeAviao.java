package org.example;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// exercicio 06 da aula-05
public class PassagensDeAviao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Reserva> sistemaReservas = new LinkedList<Reserva>();

        while (true) {

            System.out.println("Reservas de passagens de avião");
            System.out.println("1. Reservar passagem");
            System.out.println("2. Cancelar passagem");
            System.out.println("3. Exibir lista de reservas");
            int escolhaMenu = scanner.nextInt();

            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            switch (escolhaMenu) {
                case 1:
                    System.out.println("Nome: ");
                    String entradaNome = scanner.nextLine();
                    System.out.println("Local: ");
                    String entradaLocal = scanner.nextLine();
                    System.out.println("CPF: ");
                    String entradaCpf = scanner.nextLine();
                    System.out.println("Quem reservou: ");
                    String entradaQuemReservou = scanner.nextLine();
                    System.out.println("Data da entrada (2000-12-01): ");
                    String entradaDataEntrada = scanner.nextLine();
                    System.out.println("Data da saída: ");
                    String entradaDataSaida = scanner.nextLine();

                    Reserva novaReserva = new Reserva(entradaNome, entradaLocal, entradaCpf, entradaQuemReservou, LocalDate.parse(entradaDataEntrada), LocalDate.parse(entradaDataSaida));
                    sistemaReservas.add(novaReserva);
                    break;

                case 2:
                    System.out.println("Digite o número da reserva que deseja cancelar: ");
                    int cancelarReserva = scanner.nextInt();

                    sistemaReservas.remove(cancelarReserva);
                    break;

                case 3:
                    System.out.println("Lista de todas as reservas: ");
                    System.out.println(sistemaReservas);


            }

            System.out.println("Para voltar digite '1'.");
            System.out.println("Para sair digite '2'.");
            int entrada = scanner.nextInt();

            if (entrada == 2) {
                break;
            }
        }
    }
}
