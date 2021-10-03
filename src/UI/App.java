package ui;

import recursos.Cores;
import java.util.Scanner;


// A primeira interface do programa

public class App implements Interface {
    
    // Mostra a interface inicial da loja.
    @Override
    public void mostrarInterface(){
        Scanner scanner = new Scanner(System.in);
        int decisaoCliente;
        do {
             System.out.println("\n" + Cores.ANSI_YELLOW_2 + "    BEM-VINDO AO BARATOSHOP 🛍️" + Cores.ANSI_RESET);

        System.out.println(Cores.ANSI_GREEN_2 + """
[1] Cliente
[2] Sair """ + Cores.ANSI_RESET);
        System.out.print(Cores.ANSI_YELLOW_2 + "Selecionar: " + Cores.ANSI_RESET);
        decisaoCliente = Integer.parseInt(scanner.nextLine());
        System.out.println("");
        } while (decisaoCliente != 1 && decisaoCliente != 2 && decisaoCliente != 3);
        // Cliente decide se quer entrar na loja ou sair dela.
        switch (decisaoCliente){ 
            case 1:
            new InterfaceCliente().mostrarInterface();
            break;
            case 2:
            System.exit(0);
            

        scanner.close();
        }
    }
    
    public static void main(String[] args) throws Exception {
        //Inicializa a interface principal do APP, dando acesso às outras interfaces. 
        App InterfaceDoAPP = new App();
        InterfaceDoAPP.mostrarInterface();

        // quando remove o produto, o código para
        // quando altera a quantidade do produto, o total do carrinho não atualiza
        

    }
}
