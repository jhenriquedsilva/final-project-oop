package db;

import db.utils.Crypto;
import db.utils.Arquivo;
import humanos.Cliente;

import java.util.UUID;

// A classe Banco será a interface de comunicação com
// o arquivo de texto que guarda as informações do cliente
public class Banco {

    // Por meio desta variável são feitas as
    // leituras e escritas no arquivo de texto
    private Arquivo arquivo = new Arquivo();

    // Implementa o padrão de projeto Singleton
    private static Banco banco;
    private Banco() {}
    public static Banco instancia() {
        if (banco == null) {
            banco = new Banco();
        }
        return banco;
    }

    // Guarda as informações do cliente no arquivo de texto
    // quaando ele realiza o cadastro
    public void inserirCliente(Cliente cliente) {
        Crypto c = new Crypto();

        String dados = String.format("%s;%s;%d;%s;%s", UUID.randomUUID(), cliente.getNome(), cliente.getIdade(), cliente.getEmail(), c.encrypt(cliente.getSenha()));
        arquivo.escrever("lib/clientes.txt", dados);
    }

    // Busca as informações do cliente para que ele possa fazer login,
    // retornando uma instância do cliente
    public Cliente buscarCliente(String email, String senha) {
        String[] dados = arquivo.ler(email, senha, "lib/clientes.txt");
        if (dados == null) {
            return null;
        } else {
            return new Cliente(dados[1],Integer.parseInt(dados[2]),dados[3],dados[4]);
        }
    
    }


}
