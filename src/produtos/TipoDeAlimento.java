package produtos;

public enum TipoDeAlimento {
    FRUTA(1),
    VEGETAL(2),
    LACTICINIO(3),
    BISCOITO(4),
    LIMPEZA(5),
    HIGIENEPESSOAL(6),
    CARNE(7),
    NAOPERECIVEL(8),
    BEBIDAS(9);


    private final int valor;

    TipoDeAlimento(int valorOpcao){
        this.valor = valorOpcao;
    }   

    public int getValor(){return valor;}

}
