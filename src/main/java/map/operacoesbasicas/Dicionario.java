package main.java.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> palavraMap;
    private static final String DICIONARIO_VAZIO = "O dicionário está vazio.";

    public Dicionario() {
        palavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        palavraMap.put(palavra, definicao);
    }

    public void removerPalavra(String nome) {
        if (!oDicionarioEstaVazio()) {
            palavraMap.remove(nome);
        } else {
            throw new RuntimeException(DICIONARIO_VAZIO);
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicaoPorPalavra = null;
        if (!oDicionarioEstaVazio()) {
            definicaoPorPalavra = palavraMap.get(palavra);
        } else {
            throw new RuntimeException(DICIONARIO_VAZIO);
        }

        return definicaoPorPalavra;
    }

    private boolean oDicionarioEstaVazio() {
        return palavraMap.isEmpty();
    }

    public void exibirPalavras() {
        System.out.println(palavraMap);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Adicionar palavras
        dicionario.adicionarPalavra("computador",
            "máquina destinada ao processamento de dados, capaz de obedecer a instruções que visam produzir certas transformações nesses dados para alcançar um fim determinado.");
        dicionario.adicionarPalavra("sistema", "conjunto de elementos, concretos ou abstratos, intelectualmente organizados.");
        dicionario.adicionarPalavra("aplicativo", "programa de computador concebido para processar dados eletronicamente, facilitando e reduzindo o tempo de execução de uma tarefa pelo usuário.");
        dicionario.adicionarPalavra("internet", "rede de computadores dispersos por todo o planeta que trocam dados e mensagens utilizando um protocolo comum, unindo usuários particulares, entidades de pesquisa, órgãos culturais, institutos militares, bibliotecas e empresas de toda envergadura inicial por vezes maiúsc.");
        dicionario.adicionarPalavra("inteligência artificial", "Ramo de pesquisa da Ciência da Computação que tem como objetivo desenvolver tecnologias que simulem a inteligência humana, como raciocínio, aprendizagem, linguagem, inferência e criatividade.");

        dicionario.exibirPalavras();

        try {
            // Remover uma palavra
            dicionario.removerPalavra("aplicativo");

            // Pesquisar palavra
            String nomePesquisa = "internet";
            String definicaoPesquisa = dicionario.pesquisarPorPalavra(nomePesquisa);
            System.out.println("Definição de " + nomePesquisa + ": " + definicaoPesquisa);

            // Pesquisar por nome inexistente
            String nomePesquisaNaoExistente = "aplicativo";
            String definicaoPesquisaInexistente = dicionario.pesquisarPorPalavra(nomePesquisaNaoExistente);
            if (definicaoPesquisaInexistente == null) {
                System.out.println("'" +  nomePesquisaNaoExistente + "' não está no dicionário.");
            } else {
                System.out.println("Definição de " + nomePesquisaNaoExistente + ": " + definicaoPesquisaInexistente);
            }
        } catch (RuntimeException rte) {
            System.out.println(rte.getMessage());
        }

    }

}
