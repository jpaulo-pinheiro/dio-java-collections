package main.java.map.ordenacao;

public class Evento {
  //atributos
  private String nome;
  private String atracao;

  public Evento(String nome, String atracao) {
    this.nome = nome;
    this.atracao = atracao;
  }

  public String getNome() {
    return nome;
  }

  public String getAtracao() {
    return atracao;
  }

  @Override
  public String toString() {
      return "\n\tEvento {" +
              "\n\t\tnome: '" + nome + '\'' +
              ",\n\t\tatração: " + atracao + '\'' +
              "\n\t}\n";
  }
}
