package humanos;

import produtos.Carrinho;

public class Cliente extends Pessoa {
  public Carrinho carrinho = Carrinho.instancia();

  /**
   * Construtor da classe Cliente
   * 
   * @param nome  Nome do cliente
   * @param idade Idade do cliente
   * @param eMail Email do cliente
   * @param senha Senha do cliente
   */
  public Cliente(String nome, int idade, String eMail, String senha) {
    super(nome, idade, eMail, senha);
  }
}
