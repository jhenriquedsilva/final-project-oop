package humanos;

import produtos.Carrinho;
import produtos.Produtos;

public class Cliente extends Pessoa {

    private Carrinho carrinho = new Carrinho();

    public Cliente(String nome, int idade, String eMail, String senha) {
        super(nome, idade, eMail, senha);
    }

    public void adicionarNoCarrinho(Produtos novoProduto) {
        carrinho.adicionarCarrinho(novoProduto);
    }

     public void removerDoCarrinho(String nomeDoProduto) {
        carrinho.removerDoCarrinho(nomeDoProduto);
    }

}
