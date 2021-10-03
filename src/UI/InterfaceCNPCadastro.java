package ui;

import recursos.Cores;
import java.util.Scanner;
import db.Banco;
import humanos.Cliente;

/**
 * Classe que representa a interface de cadastro de clientes
 */
public class InterfaceCNPCadastro extends Cadastro implements Interface {
  Scanner scanner = new Scanner(System.in);
  Banco db = Banco.instancia();
  Cliente cliente;

  /**
   * Sobrescrita do método de cadastro de clientes da classe pai
   */
  @Override
  public void entrarComCadastro() {
    return;
  }

  /**
   * O método faz o cadastro do cliente, recebendo os atributos: Nome; Idade;
   * E-mail; Senha.
   */
  @Override
  public void fazerCadastro() {
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

    cliente = new Cliente(nomeCliente, idadeCliente, eMailCliente, senhaCliente); // Cria o objeto cliente

    db.inserirCliente(cliente); // Insere o cliente no banco de dados
  }

  /**
   * Sobrescrita do método que exibe a interface de cadastro de clientes
   */
  @Override // Chama o metodo de fazer cadastro e as demais interfaces.
  public void mostrarInterface() {

    fazerCadastro();
    new InterfaceProdutos().mostrarInterface(cliente);
    new InterfaceFinalizarCompra().mostrarInterface(cliente);
  }
}
