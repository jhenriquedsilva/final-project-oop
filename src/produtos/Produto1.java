package produtos;

public class Produto1 {

  public enum Vegetal {

    ALFACE(1.7), CENOURA(1.25), BETERRABA(2.38), ACELGA(3.49), REPOLHO(1.50), BERINJELA(5.99);

    private double precoQuilo;
    private int quantidade = 0;

    private Vegetal(double precoQuilo) {
      this.precoQuilo = precoQuilo;
    }

    public void setQuantidade(int quantidade) {
      this.quantidade = quantidade;
    }

    public int getQuantidade() {
      return this.quantidade;
    }
  }

  public enum Fruta {
    BANANA(1.7), LARANJA(1.25), MARACUJA(2.38), ACEROLA(3.49), REP(1.50), BERINJELA(5.99);

    private double precoQuilo;
    private int quantidade = 0;

    private Vegetal(double precoQuilo) {
      this.precoQuilo = precoQuilo;
    }

    public void setQuantidade(int quantidade) {
      this.quantidade = quantidade;
    }

    public int getQuantidade() {
      return this.quantidade;
    }
  }

}