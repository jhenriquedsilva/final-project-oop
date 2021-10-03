package db;

import db.utils.Crypto;
import db.utils.Arquivo;
import humanos.Cliente;

import java.util.UUID;

// A classe Banco será a interface de comunicação com
// o arquivo de texto que guarda as informações do cliente
public class Banco {

  /**
   * Instancia um novo objeto Arquivo para obter acesso aos métodos de leitura e
   * escrita no arquivo de dados utilizado na aplicação
   */
  private Arquivo arquivo = new Arquivo();

  // Implementa o padrão de projeto Singleton
  private static Banco banco;

  private Banco() {
  }

  /**
   * Retorna a instância da classe Banco
   * 
   * @return banco
   */
  public static Banco instancia() {
    if (banco == null) {
      banco = new Banco();
    }
    return banco;
  }

  /**
   * Insere um novo cliente no arquivo de dados do sistema
   * 
   * @param cliente Cliente a ser inserido
   */
  public void inserirCliente(Cliente cliente) {
    Crypto c = new Crypto();

    String dados = String.format("%s;%s;%d;%s;%s", UUID.randomUUID(), cliente.getNome(), cliente.getIdade(),
        cliente.getEmail(), c.encrypt(cliente.getSenha()));
    arquivo.escrever("lib/clientes.txt", dados);
  }

  /**
   * Busca o cliente no arquivo de dados
   * 
   * @param email email do cliente
   * @param senha senha do cliente
   * @return Cliente
   */
  public Cliente buscarCliente(String email, String senha) {
    String[] dados = arquivo.ler(email, senha, "lib/clientes.txt");
    if (dados == null) {
      return null;
    } else {
      return new Cliente(dados[1], Integer.parseInt(dados[2]), dados[3], dados[4]);
    }

  }

}
