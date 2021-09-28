package UI;
import recursos.Cores;
import java.util.Scanner;

public class InterfaceCPCadastro implements Interface {
    Scanner scanner = new Scanner(System.in);
    String eMailCliente;
    String senhaCliente;

    @Override
    public void mostrarInterface() {
        System.out.println(Cores.ANSI_YELLOW_2 + "CADASTRO" + Cores.ANSI_RESET);
        System.out.print(Cores.ANSI_GREEN_2 + """
[E-mail]: """ + Cores.ANSI_RESET);       
        eMailCliente = scanner.nextLine();
        System.out.print(Cores.ANSI_GREEN_2 + """
[Senha]: """ + Cores.ANSI_RESET);       
        eMailCliente = scanner.nextLine();
    }

}