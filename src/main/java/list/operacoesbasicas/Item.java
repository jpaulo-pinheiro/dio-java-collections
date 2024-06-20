package main.java.list.operacoesbasicas;

public class Item {
  
  // atributos
  private String nome;
  private double preco;
  private int quantidade;

  public Item(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public int getQuantidade() {
      return quantidade;
  }

  public void setQuantidade(int quantidade) {
      this.quantidade = quantidade;
  }

  public double getPreco() {
      return preco;
  }

  public void setPreco(double preco) {
      this.preco = preco;
  }

  public String getDescricao() {
    return nome;
  }

  @Override
  public String toString() {
    return "Item: " + nome + ", preço: " + preco + ", quantidade: " + quantidade;
  }
}
