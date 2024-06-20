package main.java.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavraSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraParaRemover = null;
        for (String c : palavraSet) {
            if(c.equals(palavra)){
                palavraParaRemover = c;
                break;
            }
        }
        palavraSet.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String palavra){
        return palavraSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavraSet);
    }

    public int contarPalavrasUnicas(){
        return palavraSet.size();
    }

    public static void main(String[] args) {

        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
    
        // Exibindo o número de palavras no conjunto (deve ser zero)
        System.out.println("Existem " + conjuntoPalavrasUnicas.contarPalavrasUnicas() + " palavra(s) dentro do Set de Palavras Únicas");
    
        // Adicionando palavras ao conjunto
        conjuntoPalavrasUnicas.adicionarPalavra("Alice");
        conjuntoPalavrasUnicas.adicionarPalavra("Bob");
        conjuntoPalavrasUnicas.adicionarPalavra("Charlie");
        conjuntoPalavrasUnicas.adicionarPalavra("David");
    
        // Exibindo as palavras no conjunto
        System.out.println("Palavras no conjunto:");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    
        // Exibindo o número atualizado de convidados no conjunto
        System.out.println("Existem " + conjuntoPalavrasUnicas.contarPalavrasUnicas() + " palavra(s) dentro do Set de Palavras Únicas");
    
        // Removendo uma palavra do conjunto
        conjuntoPalavrasUnicas.removerPalavra("Charlie");
        System.out.println("Existem " + conjuntoPalavrasUnicas.contarPalavrasUnicas() + " palavra(s) dentro do Set de Palavras Únicas");
    
        // Exibindo as palavras atualizadas no conjunto
        System.out.println("Palavras no conjunto após a remoção:");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
      }
    
}
