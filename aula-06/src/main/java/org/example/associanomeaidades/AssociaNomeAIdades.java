package org.example.associanomeaidades;
import java.util.Map;

//exercicio 02 aula-06
public class AssociaNomeAIdades {

    private Map<String, Integer> nomesEIdades;

    public AssociaNomeAIdades(Map<String, Integer> nomesEIdades) {
        this.nomesEIdades = nomesEIdades;
    }

    public void imprimeIdadeApartirDeUmNome(String entradaNome) {
        if (nomesEIdades.containsKey(entradaNome)) {
            System.out.println("A idade é: " + nomesEIdades.get(entradaNome));
        } else {
            System.out.println("Não encontrado. Tente novamente.");
        }
    }

    public void imprimePessoasNaTerceiraIdade() {
        for (Map.Entry<String, Integer> nomeEIdade : this.nomesEIdades.entrySet()) {
            if (nomeEIdade.getValue() > 60) {
                System.out.println( "Pessoas na terceira idade:  " + nomeEIdade.getKey());
            }
        }
    }
}
