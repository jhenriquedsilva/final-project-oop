import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> itens = new ArrayList<>();

    // Verifica se o array está vazio
    private boolean isEmpty() {
        return itens.size() == 0;
    }

    // Adiciona produtos no carrinho
    public void adicionarCarrinho(Produto novoProduto) {
        for (Produto produtoNoCarrinho : itens) {
            if (produtoNoCarrinho.getnomeDoProduto() == novoProduto.getnomeDoProduto()) {
                System.out.println("Produto já está no carrinho. Adicionado mais 1");
                int novaQuatidade = produtoNoCarrinho.getQuantidade() + 1;
                produtoNoCarrinho.setQuantidade(novaQuatidade); // Se o carrinho já possui o produto, muda-se a
                                                                // quantidade.
            } else {
                itens.add(novoProduto); // Se o carrinho ainda não possui o produto, este é adicionado no carrinho
                novoProduto.setQuantidade(novoProduto.getQuantidade() + 1);
                System.out.println("Produto adicionado no carrinho");
            }
        }

    }

    // Se a o carrinho não estiver vazio, fazer a remoção
    public Produto removerDoCarrinho(String nome) {
        if (!isEmpty()) {
            for (Produto produto : itens) {
                if (produto.getnomeDoProduto() == produto.getnomeDoProduto()) {
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

    public boolean diminuirQuantidade(String nome, int unidades) {
        for (Produto produto : itens) {
            if (produto.getnomeDoProduto() == nome) {
                if ((produto.getQuantidade() - unidades) >= 0) {
                    int quantidade = produto.getQuantidade();
                    quantidade -= unidades;
                    produto.setQuantidade(quantidade);
                    return true;
                } else if ((produto.getQuantidade() - unidades) < 0) {
                    System.out.println("Você não pode retirar toda essa quantidade.");
                    return false;
                }
            }
        }
        System.out.println("Produto não existe no carrinho.");
        return false;
    }

}
