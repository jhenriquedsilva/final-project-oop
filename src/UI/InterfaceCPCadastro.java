package ui;
import recursos.Cores;
import java.util.Scanner;
import db.Banco;
import humanos.Cliente;

// Interface em que o cliente já possui cadastro na loja.
public class InterfaceCPCadastro extends Cadastro implements Interface  {
    Scanner scanner = new Scanner(System.in);    
    Banco db = Banco.instancia();
    Cliente cliente;


    @Override
    public void fazerCadastro(){
            return;
    }    


    @Override // O método recebe o cadastro do cliente (e-mail e senha) e valida as informações
    public void entrarComCadastro(){
        String senhaCliente;
        String eMailCliente;

        do {
            System.out.println(Cores.ANSI_YELLOW_2 + "    CADASTRO" + Cores.ANSI_RESET);
            System.out.print(Cores.ANSI_GREEN_2 + """
    [E-mail]: """ + Cores.ANSI_RESET);       
            eMailCliente = scanner.nextLine();
    
            System.out.print(Cores.ANSI_GREEN_2 + """
    [Senha]: """ + Cores.ANSI_RESET);       
            senhaCliente = scanner.nextLine();
            
            cliente = db.buscarCliente(eMailCliente, senhaCliente);
    
            } while(cliente == null);
    }

    @Override // Chama o metodo de cadastro e as demais interfaces.
    public void mostrarInterface() {
        
        entrarComCadastro();
        new InterfaceProdutos().mostrarInterface(cliente);
        new InterfaceFinalizarCompra().mostrarInterface(cliente);
    }
}
