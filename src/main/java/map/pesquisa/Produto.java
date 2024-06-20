package main.java.map.pesquisa;

public class Produto {
    // atributos
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "\n\tProduto {" +
                "\n\t\tnome: '" + nome + '\'' +
                ",\n\t\tquantidade: " + quantidade + '\'' +
                ",\n\t\tpreço: " + preco + '\'' +
                "\n\t}\n";
    }
}