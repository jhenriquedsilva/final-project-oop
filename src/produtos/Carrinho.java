package produtos;

import java.util.ArrayList;
import produtos.Produtos;

public class Carrinho {

    private ArrayList<Produtos> itens = new ArrayList<Produtos>();

    private static Carrinho carrinho;

    private Carrinho() {}

    public static Carrinho instancia() {
        if (carrinho == null) {
            carrinho = new Carrinho();
        }
        return carrinho;
    }

    // Verifica se o array está vazio
    private boolean isEmpty() {
        return itens.size() == 0;
    }

    // Adiciona produtos no carrinho
    public void adicionarCarrinho(Produtos novoProduto) {
        // Verifica o carrinho está vazio
        if(!isEmpty()){
            // Verifica se já existe o produto no carrinho
            for (Produtos p : itens){
                if (p.equals(novoProduto)){
                    // Caso exista, ele só incrementa a quantidade
                    p.setQtd(p.getQtd() + 1);
                    return;
                }
            }
        }

        itens.add(novoProduto);
    }

    // Se a o carrinho não estiver vazio, fazer a remoção
    public void removerDoCarrinho(int id) {
        if (!isEmpty()) {
            for (Produtos produto : itens) {
                if (produto.getId() == id) {
                    itens.remove(produto);
                }
            }
        } else {
            System.out.println("O carrinho está vazio");
        }
    }

    public Produtos buscarProduto(int id) {
        for (Produtos produto : itens) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    // Imprime todos os produtos que estãoo no carrinho
    public void mostrarProdutosNoCarrinho() {
        for (Produtos produto : itens) {
            System.out.println(produto);
        }
    }

    // Pega os ids dos produtos
    public ArrayList<Integer> getIds() {
        ArrayList<Integer> ids = new ArrayList<Integer>();
        for (Produtos produto : itens) {
            ids.add(produto.getId());
        }
        return ids;
    }

    // Calcula o preço total da compra
    public double calcularTotal() {
        double total = 0.0;
        for (Produtos produto : itens) {
            total += produto.getValor();
        }
        return total;
    }

}
