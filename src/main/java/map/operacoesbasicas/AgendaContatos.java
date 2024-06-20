package main.java.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> contatoMap;

    public AgendaContatos() {
        contatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        contatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!aAgendaDeContatosEstaVazia()) {
            contatoMap.remove(nome);
        } else {
            throw new RuntimeException("A agenda de contatos está vazia.");
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!aAgendaDeContatosEstaVazia()) {
            numeroPorNome = contatoMap.get(nome);
        } else {
            throw new RuntimeException("A agenda de contatos está vazia.");
        }

        return numeroPorNome;
    }

    private boolean aAgendaDeContatosEstaVazia() {
        return contatoMap.isEmpty();
    }

    public void exibirContatos() {
        System.out.println(contatoMap);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adicionar contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        // é este último que fica gravado por causa do método put que inclui/atualiza
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();

        try {
            // Remover um contato
            agendaContatos.removerContato("Maria");

            // Pesquisar número por nome
            String nomePesquisa = "João";
            Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
            System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

            // Pesquisar por nome inexistente
            String nomePesquisaNaoExistente = "Paula";
            Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
            if (numeroPesquisaNaoExistente == null) {
                System.out.println(
                        nomePesquisaNaoExistente + " não está na agenda de contatos.");
            } else {
                System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);
            }
        } catch (

        RuntimeException rte) {
            System.out.println(rte.getMessage());
        }

    }

}
