package ui;
import recursos.Cores;
import java.util.Scanner;
import db.Banco;
import humanos.Cliente;

public class InterfaceCNPCadastro implements Interface {
        Scanner scanner = new Scanner(System.in);
        Banco db = Banco.instancia();

    @Override
    public void mostrarInterface() {
        String nomeCliente;
        int idadeCliente;
        String eMailCliente;
        String senhaCliente;

        System.out.println(Cores.ANSI_YELLOW_2 + "    CADASTRO" + Cores.ANSI_RESET);
        System.out.print(Cores.ANSI_GREEN_2 + """
[Nome]: """ + Cores.ANSI_RESET);       
        nomeCliente = scanner.nextLine();
        System.out.print(Cores.ANSI_GREEN_2 + """
[Idade]: """ + Cores.ANSI_RESET);       
        idadeCliente = Integer.parseInt(scanner.nextLine());
        System.out.print(Cores.ANSI_GREEN_2 + """
[E-mail]: """ + Cores.ANSI_RESET);       
        eMailCliente = scanner.nextLine();
        System.out.print(Cores.ANSI_GREEN_2 + """
[Senha]: """ + Cores.ANSI_RESET);       
        senhaCliente = scanner.nextLine();
        
        Cliente cliente = new Cliente(nomeCliente, idadeCliente, eMailCliente, senhaCliente);

        db.inserirCliente(cliente);
        new InterfaceProdutos().mostrarInterface();
        new InterfaceFinalizarCompra().mostrarInterface();
    }
}
