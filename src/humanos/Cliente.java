package humanos;

import produtos.Carrinho;
import produtos.Produtos;

public class Cliente extends Pessoa {

    private Carrinho carrinho = Carrinho.instancia();

    public Cliente(String nome, int idade, String eMail, String senha) {
        super(nome, idade, eMail, senha);
    }
}
