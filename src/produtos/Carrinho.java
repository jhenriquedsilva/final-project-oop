package produtos;

import java.util.ArrayList;

public class Carrinho {

    // Onde os itens do carrinho ficarão armazenados
    private ArrayList<Produtos> itens = new ArrayList<Produtos>();

    // O carrinho implementa o padrão de projeto Singleton
    private static Carrinho carrinho;
    private Carrinho() {}
    public static Carrinho instancia() {
        if (carrinho == null) {
            carrinho = new Carrinho();
        }
        return carrinho;
    }

    // Verifica se não há itens no carrinho
    public boolean isEmpty() {
        return itens.size() == 0;
    }

    // Adiciona produtos no carrinho
    public void adicionarCarrinho(Produtos novoProduto) {
        // Verifica se já existe o produto no carrinho
        for (Produtos p : itens){
            if (p.equals(novoProduto)){
                // Caso exista, ele só incrementa a quantidade
                p.setQtd(p.getQtd() + 1);
                return;
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

    // Busca o produto no carrinho pelo id e retorna o produto
    public Produtos buscarProduto(int id) {
        for (Produtos produto : itens) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    // Imprime todos os produtos que estão no carrinho
    public void mostrarProdutosNoCarrinho() {
        for (Produtos produto : itens) {
            System.out.println(produto);
        }
    }

    // Retorna os ids dos produtos
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
