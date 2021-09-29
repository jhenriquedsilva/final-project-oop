package ui;
import java.util.Scanner;
import recursos.Cores;

public class InterfaceCliente implements Interface {
    
    Scanner scanner = new Scanner(System.in);

    int decisaoCliente;

    @Override
    public void mostrarInterface() {
        System.out.println(Cores.ANSI_YELLOW_2 + "CADASTRO" + Cores.ANSI_RESET);
        System.out.println(Cores.ANSI_GREEN_2 + """
[1] Possui Cadastro 
[2] Não possui cadastro """ + Cores.ANSI_RESET);
        

    System.out.print(Cores.ANSI_YELLOW_2 + "Selecionar: " + Cores.ANSI_RESET);
    decisaoCliente = Integer.parseInt(scanner.nextLine());
    System.out.println("");
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
