package ui;

import recursos.Cores;
import java.util.Scanner;
import db.Banco;
import humanos.Cliente;
   
public class InterfaceCPCadastro extends Cadastro implements Interface {
  private Scanner scanner = new Scanner(System.in);
  private Banco db = Banco.instancia();
  private Cliente cliente;

  @Override
  public void fazerCadastro() {
    return;
  }

  /**
   * Exibe a interface de login para o usuário
   */
  @Override
  public void entrarComCadastro() {
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

    } while (cliente == null);
  }

  /**
   * Exibe a interface de login para o usuário
   */
  @Override
  public void mostrarInterface() {

    entrarComCadastro();
    new InterfaceProdutos().mostrarInterface(cliente);
    new InterfaceFinalizarCompra().mostrarInterface(cliente);
  }
}
