package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            if(palavrasMap.containsKey(palavra)){
                palavrasMap.remove(palavra);
            } else    {
                throw new RuntimeException("A palavra '" + palavra + "' não está presente no texto.");
            }
        }  else    {
            throw new RuntimeException("Texto vazio.");
        }
    }

    public String encontrarPalavraMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
          if (entry.getValue() > maiorContagem) {
            maiorContagem = entry.getValue();
            linguagemMaisFrequente = entry.getKey();
          }
        }
        return linguagemMaisFrequente;
      }

    public void exibirContagemPalavras() {
        System.out.println(palavrasMap);
    }

    public static void main(String[] args) {
        ContagemPalavras palavrasMap = new ContagemPalavras();
    
        // Adiciona linguagens e suas contagens
        
        palavrasMap.adicionarPalavra("Java", 2);
        palavrasMap.adicionarPalavra("Python", 8);
        palavrasMap.adicionarPalavra("JavaScript", 1);
        palavrasMap.adicionarPalavra("C#", 6);
     
        try{
            palavrasMap.removerPalavra("teste");           
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        
        // Exibe a contagem total de linguagens
        palavrasMap.exibirContagemPalavras();
    
        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = palavrasMap.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
      }
}
