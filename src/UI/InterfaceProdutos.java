package ui;
import recursos.Cores;

public class InterfaceProdutos implements Interface{

    @Override
    public void mostrarInterface() {
        System.out.println(Cores.ANSI_YELLOW_2 + "BARATOSHOP" + Cores.ANSI_RESET);
    }
    
    // mostrar produtos
}
