package org.example.agendatelefonica;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

// exercicio 03 aula-06
public class AgendaTelefonica {

    private TreeMap<String, Contato> nomesEContatos;
    private TreeMap<Localidade, List<Contato>> localidadeEContatos;

    public AgendaTelefonica(List<Contato> contatos) {
        this.nomesEContatos = new TreeMap<>();
        this.localidadeEContatos = new TreeMap<>();

        this.distribuirContatos(contatos);
    }

    private void distribuirContatos(List<Contato> contatos) {
        for (Contato contato: contatos) {
            this.nomesEContatos.put(contato.getNome(), contato);

            // TODO Usar lista de contatos, ao invés de só contato.
            List<Contato> contatosDaLocalidade = localidadeEContatos.get(contato.getLocalidade());

            // Se é o primeiro contato da Localidade
            if (contatosDaLocalidade == null) {
                contatosDaLocalidade = new ArrayList<>();
                contatosDaLocalidade.add(contato);
            } else { // se não é o primeiro contato da localidade
                contatosDaLocalidade.add(contato);
            }

            this.localidadeEContatos.put(contato.getLocalidade(), contatosDaLocalidade);

        }
    }

    public String toString(){
       return "Nomes e Contatos: " + nomesEContatos.toString() +
                "\n\nLocalidades e Contatos" + localidadeEContatos.toString();
    }
}
