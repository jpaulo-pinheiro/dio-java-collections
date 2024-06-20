package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

  // atributo
  private List<Item> itemList;

  public CarrinhoDeCompras() {
    this.itemList = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    itemList.add(new Item(nome, preco, quantidade));
  }

  public void removerItem(String nome) {
    List<Item> itemParaRemover = new ArrayList<>();
    if (!itemList.isEmpty()) {
      for (Item t : itemList) {
        if (t.getDescricao().equalsIgnoreCase(nome)) {
          itemParaRemover.add(t);
        }
      }
      itemList.removeAll(itemParaRemover);
    } else {
      System.out.println("O carrinho está vazio!");
    }
  }

  public double calcularValorTotal() {
    double valorTotal = 0;
    for (Item item : itemList) {
      valorTotal += (item.getPreco() * item.getQuantidade());
    }
    return valorTotal;
  }

  public void exibirItens() {
    if (!itemList.isEmpty()) {
      System.out.println(itemList);
    } else {
      System.out.println("O Carrinho está vazio!");
    }
  }

  public int obterNumeroTotalItens() {
    return itemList.size();
  }

  public static void main(String[] args) {
    // Criando uma instância da classe CarrinhoDeCompras
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    // Adicionando itens ao carrinho
    carrinho.adicionarItem("Notebook", 10000, 10);
    carrinho.adicionarItem("SmartPhone", 6000, 5);
    carrinho.adicionarItem("SmartWatch", 2000, 15);

    // Exibindo o número total de itens no carrinho
    System.out.println("Você tem " + carrinho.obterNumeroTotalItens() + " itens no carrinho");

    // Exibindo os itens no carrinho
    carrinho.exibirItens();

    // Exibindo o valor total dos itens no carrinho
    System.out.println("Valor total " + carrinho.calcularValorTotal() + " no carrinho");

    // Removendo um item do carrinho
    carrinho.removerItem("SmartPhone");

    // Exibindo o número total atualizado de itens no carrinho
    System.out.println("Você tem " + carrinho.obterNumeroTotalItens() + " itens no carrinho");

    // Exibindo os itens atualizados no carrinho
    carrinho.exibirItens();

    // Exibindo o valor total dos itens atualizado no carrinho
    System.out.println("Valor total " + carrinho.calcularValorTotal() + " no carrinho");

    // Removendo um item do carrinho
    carrinho.removerItem("Notebook");

    // Exibindo o número total atualizado de itens no carrinho
    System.out.println("Você tem " + carrinho.obterNumeroTotalItens() + " itens no carrinho");

    // Exibindo o valor total dos itens atualizado no carrinho
    System.out.println("Valor total " + carrinho.calcularValorTotal() + " no carrinho");

    // Removendo um item do carrinho
    carrinho.removerItem("SmartWatch");

    // Exibindo o número total atualizado de itens no carrinho
    System.out.println("Você tem " + carrinho.obterNumeroTotalItens() + " itens no carrinho");

    // Exibindo os itens atualizados no carrinho
    carrinho.exibirItens();

    // Exibindo o valor total dos itens atualizado no carrinho
    System.out.println("Valor total " + carrinho.calcularValorTotal() + " no carrinho");

    // Removendo um item do carrinho vazio
    carrinho.removerItem("Computador");

    // Exibindo o número total de itens no carrinho após tentar remover de uma lista
    // vazia
    System.out.println("Agora você tem " + carrinho.obterNumeroTotalItens() + " itens no carrinho");
  }
}