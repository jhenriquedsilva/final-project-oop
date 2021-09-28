package UI;

import java.util.Scanner;
import recursos.Cores;
import db.EscritoraDeArquivoDeTexto;
import db.LeitoraDeArquivoDeTexto;

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
        InterfaceCPCadastro interfaceDoClienteComCadastro = new InterfaceCPCadastro();
        interfaceDoClienteComCadastro.mostrarInterface();
        break;
        case 2:
        InterfaceCNPCadastro interfaceDoClienteSemCadastro = new InterfaceCNPCadastro();
        interfaceDoClienteSemCadastro.mostrarInterface();
        break;

        case 3:
        }
    }   
}
