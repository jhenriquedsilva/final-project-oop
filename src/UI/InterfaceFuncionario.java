package ui;

import recursos.Cores;
import java.util.Scanner;

public class InterfaceFuncionario implements Interface {
    Scanner scanner = new Scanner(System.in);
    int decisaoCliente;

    @Override
    public void mostrarInterface() {

        System.out.println(Cores.ANSI_GREEN_2 + """
[1] Possui Cadastro 
[2] Não possui cadastro """ + Cores.ANSI_RESET);
        

    System.out.print(Cores.ANSI_YELLOW_2 + "Selecionar: " + Cores.ANSI_RESET);
    decisaoCliente = Integer.parseInt(scanner.nextLine());
    System.out.println("");
    switch (decisaoCliente) {
        case 1:
        
        break;
        case 2:
        
        break;

        case 3:
        }
    }
}