package produtos;

import java.util.ArrayList;
import produtos.Produtos;

public class Carrinho {

    private ArrayList<Produtos> itens = new ArrayList<>();

    public Carrinho(){};

    // Verifica se o array está vazio
    private boolean isEmpty() {
        return itens.size() == 0;
    }

    // Adiciona produtos no carrinho
    public void adicionarCarrinho(Produtos novoProduto) {
        for (Produtos produtoNoCarrinho : itens) {
            if (produtoNoCarrinho.getNome() == novoProduto.getNome()) {
                System.out.println("Produto já está no carrinho. Adicionado mais 1");
            } else {
                itens.add(novoProduto); // Se o carrinho ainda não possui o produto, este é adicionado no carrinho
                System.out.println("Produto adicionado no carrinho");
            }
        }

    }

    // Se a o carrinho não estiver vazio, fazer a remoção
    public Produtos removerDoCarrinho(String nome) {
        if (!isEmpty()) {
            for (Produtos produto : itens) {
                if (produto.getNome() == produto.getNome()) {
                    itens.remove(produto);
                    return produto;
                }
            }
            return null; // Se o produto não existe no carrinho, retorna null
        } else {
            System.out.println("O carrinho está vazio");
            return null; // Se o carrinho está vazio, retorna null
        }
    }

}
