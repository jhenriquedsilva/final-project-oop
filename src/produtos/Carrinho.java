package produtos;

import java.util.ArrayList;

public class Carrinho {

  // Onde os itens do carrinho ficarão armazenados
  private ArrayList<Produtos> itens = new ArrayList<Produtos>();

  // O carrinho implementa o padrão de projeto Singleton
  private static Carrinho carrinho;

  private Carrinho() {
  }

  /**
   * Retorna uma instância da classe Carrinho.
   * 
   * @return Carrinho
   */
  public static Carrinho instancia() {
    if (carrinho == null) {
      carrinho = new Carrinho();
    }
    return carrinho;
  }

  /**
   * Verifica se a lista de itens do carrinho está vazia.
   * 
   * @return boolean
   */
  public boolean isEmpty() {
    return itens.size() == 0;
  }

  /**
   * Adiciona um produto ao carrinho.
   * 
   * @param novoProduto Instância da classe Produtos
   */
  public void adicionarCarrinho(Produtos novoProduto) {
    // Verifica se já existe o produto no carrinho
    for (Produtos p : itens) {
      if (p.equals(novoProduto)) {
        // Caso exista, ele só incrementa a quantidade
        p.setQtd(p.getQtd() + 1);
        return;
      }
    }

    itens.add(novoProduto);
  }

  /**
   * Remove um produto do carrinho.
   * 
   * @param id Id do produto a ser removido
   */
  public void removerDoCarrinho(int id) {
    if (!isEmpty()) {
      Produtos p = this.buscarProduto(id);

      if (p != null) {
        itens.remove(p);
      }
    } else {
      System.out.println("O carrinho está vazio");
    }
  }

  /**
   * Retorna uma instância do produto do carrinho referente ao id passado.
   * 
   * @param id Id do produto
   * @return Produtos
   */
  public Produtos buscarProduto(int id) {
    for (Produtos produto : itens) {
      if (produto.getId() == id) {
        return produto;
      }
    }
    return null;
  }

  /**
   * Exibe todos os produtos no carrinho
   */
  public void mostrarProdutosNoCarrinho() {
    for (Produtos produto : itens) {
      System.out.println(produto);
    }
  }

  /**
   * Retorna uma lista com todos os IDs dos produtos no carrinho.
   * 
   * @return ArrayList<Integer>
   */
  public ArrayList<Integer> getIds() {
    ArrayList<Integer> ids = new ArrayList<Integer>();
    for (Produtos produto : itens) {
      ids.add(produto.getId());
    }
    return ids;
  }

  /**
   * Retorna o valor total de produtos no carrinho.
   * 
   * @return double
   */
  public double calcularTotal() {
    double total = 0.0;
    for (Produtos produto : itens) {
      total += produto.getPreco();
    }
    return total;
  }

}
