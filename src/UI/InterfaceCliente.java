package ui;
import java.util.Scanner;
import recursos.Cores;

public class InterfaceCliente implements Interface {
    
    private Scanner scanner = new Scanner(System.in);

    private int decisaoCliente;

    @Override // Inicia a interface principal de cadastro do cliente
    public void mostrarInterface() {
        System.out.println(Cores.ANSI_YELLOW_2 + "    CADASTRO" + Cores.ANSI_RESET);
        System.out.println(Cores.ANSI_GREEN_2 + """
[1] Possui Cadastro 
[2] Não possui cadastro """ + Cores.ANSI_RESET);
        

    System.out.print(Cores.ANSI_YELLOW_2 + "Selecionar: " + Cores.ANSI_RESET);
    decisaoCliente = Integer.parseInt(scanner.nextLine());
    System.out.println("");
    // O cliente seleciona a opção de "possui cadastro" ou de "não possui cadastro".
    switch (decisaoCliente) {
        case 1:
        new InterfaceCPCadastro().mostrarInterface();
        break;

        case 2:
        new InterfaceCNPCadastro().mostrarInterface();
        break;
        }
    }   
}
