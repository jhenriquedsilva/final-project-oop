import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> itens = new ArrayList<>();

    public void adicionarCarrinho(Produto produto) {
        itens.add(produto);
    }

    public Produto removerDoCarrinho(String nome) {
        for(Produto produto : itens) {
            if(produto.getnomeDoProduto() == nome) {
                itens.remove(produto);
                return produto;
            }
        }
        return null;
    }

    public boolean diminuirQuantidade(String nome, int unidades) {
        for(Produto produto : itens) {
            if(produto.getnomeDoProduto() == nome) {
                if ((produto.getQuantidade() - unidades) >= 0) {
                    int quantidade = produto.getQuantidade();
                    quantidade -= unidades;
                    produto.setQuantidade(quantidade);
                    return true;
                }else if((produto.getQuantidade() - unidades) < 0){
                    System.out.println("Você não pode retirar toda essa quantidade.");
                    return false;
                }
            }
        }
        System.out.println("Produto não existe no carrinho.");
        return false;
    }
    
}
