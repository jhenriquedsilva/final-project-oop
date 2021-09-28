package cliente;

import java.util.Date;
import java.util.UUID;

import humanos.Cliente;

public class Pedidos {
  private String pedidoId;
  private String produtoId;
  private String setorProduto;
  private int quantidade;
  private Date dataCompra;
  private Date dataEntrega;

  private Cliente cliente;

  public Pedidos(String produtoId, String setorProduto, int quantidade, Date dataEntrega, Cliente cliente) {
    this.produtoId = produtoId;
    this.setorProduto = setorProduto;
    this.quantidade = quantidade;
    this.dataCompra = new Date();
    this.dataEntrega = dataEntrega;
    this.pedidoId = UUID.randomUUID().toString();
    this.cliente = cliente;
  }

  public String getPedidoId() {
    return pedidoId;
  }

  public String getProdutoId() {
    return produtoId;
  }

  public String getSetorProduto() {
    return setorProduto;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public Date getDataCompra() {
    return dataCompra;
  }

  public Date getDataEntrega() {
    return dataEntrega;
  }

  public Cliente getCliente() {
    return cliente;
  }
}
