public class Produto {
    private String nomeDoProduto;
    private double preco;
    private int quantidade = 0;

    private SetoresDeProdutos setor;

    Produto(String nomeDoProduto, double preco, int quantidade, SetoresDeProdutos setor) {
        setnomeDoProduto(nomeDoProduto);
        setPreco(preco);
        setQuantidade(quantidade);
        setSetor(setor);
    }

    public String getnomeDoProduto() {
        return this.nomeDoProduto;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setnomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setSetor(SetoresDeProdutos setor) {
        this.setor = setor;
    }

    public void getSetor(SetoresDeProdutos setor) {
        return this.setor;
    }

}
