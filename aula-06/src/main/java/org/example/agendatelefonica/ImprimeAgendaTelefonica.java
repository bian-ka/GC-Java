package org.example.agendatelefonica;

import java.util.ArrayList;
import java.util.List;

// exercicio 03 aula-06
public class ImprimeAgendaTelefonica {
    public static void main(String[] args) {

        Contato contatoDenji;
        contatoDenji = new Contato("12323-123", "Denji", "Rua Um, Japão", Localidade.CENTRO);


        Contato contatoAki = new Contato("99999-999", "Aki Hayakawa", "Rua Tres, Japão", Localidade.CENTRO);
        Contato contatoPower = new Contato("11111-111", "Power", "Rua Sangue, Japão",Localidade.OESTE);
        Contato contatoPochita = new Contato("77777-777", "Pochita", "Rua Laranja, Japão", Localidade.SUL);
        Contato contatoKishibe = new Contato("62626-666", "Kishibe", "Rua Fumaça, Japão", Localidade.NORTE);
        Contato contatoMakima = new Contato("88866-686", "Makima", "Rua Controle, Japão", Localidade.LESTE);
        Contato cotatoDemonioDaQueda = new Contato("0000-000", "Demonio da Queda", "Rua inferno, Inferno", Localidade.LESTE);

        List<Contato> contatos;
        contatos = new ArrayList<>();

        contatos.add(contatoDenji);
        contatos.add(contatoAki);
        contatos.add(contatoPower);
        contatos.add(contatoPochita);
        contatos.add(contatoKishibe);
        contatos.add(contatoMakima);
        contatos.add(cotatoDemonioDaQueda);

        AgendaTelefonica agendaTelefonica = new AgendaTelefonica(contatos);
        System.out.println(agendaTelefonica);
    }
}
