package humanos;

import produtos.Carrinho;

public class Cliente extends Pessoa {

    // Por meio do carrinho, os itens do pedido serão armazenados
    public Carrinho carrinho = Carrinho.instancia();

    public Cliente(String nome, int idade, String eMail, String senha) {
        super(nome, idade, eMail, senha);
    }
}
