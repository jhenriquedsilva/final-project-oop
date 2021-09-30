package db;

import db.utils.Crypto;
import db.utils.Arquivo;

import humanos.Cliente;
import humanos.Funcionario;

import java.util.UUID;

public class Banco {

    private Arquivo arquivo = new Arquivo();

    private static Banco banco;

    private Banco() {}

    public static Banco instancia() {
        if (banco == null) {
            banco = new Banco();
        }
        return banco;
    }

    public void inserirCliente(Cliente cliente) {
        Crypto c = new Crypto();

        String dados = String.format("%s;%s;%d;%s;%s", UUID.randomUUID(), cliente.getNome(), cliente.getIdade(), cliente.getEmail(), c.encrypt(cliente.getSenha()));
        arquivo.escrever("lib/clientes.txt", dados);
    }

    public Cliente buscarCliente(String email, String senha) {
        String[] dados = arquivo.ler(email, senha, "lib/clientes.txt");
        if (dados == null) {
            return null;
        } else {
            return new Cliente(dados[1],Integer.parseInt(dados[2]),dados[3],dados[4]);
        }
    
    }

    public void inserirFuncionario(Funcionario funcionario) {
        String dados = String.format("%s;%s;%d;%s;%s", UUID.randomUUID(), funcionario.getNome(),funcionario.getIdade(),funcionario.getEmail(),funcionario.getSenha());
        arquivo.escrever("lib/funcionarios.txt", dados);
    }
    

    public Funcionario buscarFuncionario(String email, String senha) {
        String[] dados = arquivo.ler(email, senha, "lib/funcionarios.txt");
        return new Funcionario(dados[0],Integer.parseInt(dados[1]),dados[2],dados[3]);
    }
}
