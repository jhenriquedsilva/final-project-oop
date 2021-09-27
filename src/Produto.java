3public class Produto {
    private String nomeDoProduto;
    private double preco;
    private int quantidade = 0;

    Produto(String nomeDoProduto, double preco, int quantidade) {
        setnomeDoProduto(nomeDoProduto);
        setPreco(preco);
        setQuantidade(quantidade);
    }
    
    public String getnomeDoProduto(){return this.nomeDoProduto;}

    public double getPreco(){return this.preco;}

    public int getQuantidade(){return this.quantidade;}

    public void setnomeDoProduto(String nomeDoProduto){this.nomeDoProduto = nomeDoProduto;}

    public void setPreco(double preco){this.preco = preco;}

    public void setQuantidade(int quantidade){this.quantidade = quantidade;}

}
