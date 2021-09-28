package produtos;

public enum SetoresDeProdutos {
    FRUTAS(1), VEGETAIS(2), LACTICINIOS(3), BISCOITOS(4), LIMPEZA(5), HIGIENEPESSOAL(6), CARNES(7), NAOPERECIVEL(8),
    BEBIDAS(9);

    private final int valor;

    SetoresDeProdutos(int valorOpcao) {
        this.valor = valorOpcao;
    }

    public int getValor() {
        return valor;
    }

}
