package produtos;

import recursos.Cores;

// Todos os produtos da loja estão nesta classe
public enum Produtos {

    BANANA(1.90, "Banana", "Frutas", 1), LARANJA(0.95, "Laranja", "Frutas", 2), ACEROLA(10.9, "Acerola", "Frutas", 3), MACA(2.99, "Maçã", "Frutas", 4), MELAO(5.80, "Melão", "Frutas", 5),
    ALFACE(2.86, "Alface","Vegetais", 6), ACELGA(5.36, "Acelga ", "Vegetais", 7), CEBOLA(0.89, "Cebola", "Vegetais", 8), COUVE(3.13, "Couve", "Vegetais", 9), BATATA(2.34, "Batata","Vegetais", 10),
    ARROZ(5.80, "Arroz", "Basico", 11), MACARRAO(2.42, "Macarrão", "Basico", 12), MIOJO(1.40, "Miojo", "Basico", 13), FEIJAO(9.5, "Feijão", "Basico", 14), 
    SAL(3.08,"Sal", "Basico", 15), ACUCAR(3.76, "Açúcar", "Basico", 16), 
    PASSATEMPO(2.09, "Passatempo", "Biscoitos", 17), COOKIE(3.99,"Cookie","Biscoitos", 18), BONO(2.60, "Bono", "Biscoitos", 19), RECHEADINHO(2.60, "Recheadinho", "Biscoitos", 20);
 
    private final double valor;
    private double preco;
    private final String nome;
    private final String setor;
    private final int id; 
    private int qtd = 1;

    private Produtos(double valor, String nome, String setor, int id) {
        this.valor = valor;
        this.nome = nome;
        this.setor = setor;
        this.id = id;
        this.preco = valor * this.qtd;
    }

    public int getQtd() {
        return qtd;
    }

    // O cliente pode alterar a quantidade de unidades que deseja levar por meio deste atributo
    public void setQtd(int novaQtd) {
        this.qtd = novaQtd;
        this.preco = this.valor * novaQtd;
    }

    public double getPreco() {
        return preco;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format(Cores.ANSI_GREEN_2 + "[%d]%s: R$%.2f (Qtd:%d)" + Cores.ANSI_RESET, id, nome, preco, qtd);
    }

}
