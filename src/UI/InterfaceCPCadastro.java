package ui;
import recursos.Cores;
import java.util.Scanner;
import db.Banco;

public class InterfaceCPCadastro implements Interface {

    Banco db = Banco.instancia();

    @Override
    public void mostrarInterface() {
        String senhaCliente;
        String eMailCliente;
        Cliente cliente = null;

        do {
        System.out.println(Cores.ANSI_YELLOW_2 + "CADASTRO" + Cores.ANSI_RESET);
        System.out.print(Cores.ANSI_GREEN_2 + """
[E-mail]: """ + Cores.ANSI_RESET);       
        eMailCliente = scanner.nextLine();

        System.out.print(Cores.ANSI_GREEN_2 + """
[Senha]: """ + Cores.ANSI_RESET);       
        eMailCliente = scanner.nextLine();
        
        cliente = db.buscarCliente(email, senha)

         while( )cliente == null;

    }
}
