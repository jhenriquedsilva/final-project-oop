package db;

import humanos.Cliente;
import humanos.Funcionario;
import db.utils.Arquivo;

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
        String dados = String.format("%s|%d|%s|%s", cliente.getNome(),cliente.getIdade(),cliente.getEmail(),cliente.getSenha());
        arquivo.escrever("lib/clientes.txt", dados);
    }

    public void inserirFuncionario(Funcionario funcionario) {
        String dados = String.format("%s|%d|%s|%s", funcionario.getNome(),funcionario.getIdade(),funcionario.getEmail(),funcionario.getSenha());
        arquivo.escrever("lib/funcionarios.txt", dados);
    }
    

    public Funcionario buscarFuncionario(String email) {
        String[] dados = arquivo.ler(email, "lib/funcionarios.txt");
        return new Funcionario(dados[0],Integer.parseInt(dados[1]),dados[2],dados[3]);
    }

    public Cliente buscarCliente(String email) {
        String[] dados = arquivo.ler(email, "lib/clientes.txt");
        return new Cliente(dados[0],Integer.parseInt(dados[1]),dados[2],dados[3]);
    }
    /*
    public Funcionario buscarFuncionarioPorNome(String nome) {
        for (Funcionario f : funcionarios) {
            if (f.getNome().equals(nome)) {
                return f;
            }
        }

        return null;
    }
    
    public Cliente buscarCliente(String id) {
        for (Cliente c : clientes) {
            if (c.getId().equals(id)) {
                return c;
            }
        }

        return null;
    }

    public Cliente buscarClientePorNome(String nome) {
        for (Cliente c : clientes) {
            if (c.getNome().equals(nome)) {
                return c;
            }
        }

        return null;
    }

    public Cliente buscarClientePorPedido(String pedidoId) {
        for (Pedidos p : pedidos) {
            if (p.getPedidoId().equals(pedidoId)) {
                return p.getCliente();
            }
        }

        return null;
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void adicionarCliente(Cliente c) {
        clientes.add(c);
    }

    public void adicionarPedido(Pedidos p) {
        pedidos.add(p);
    }

    public void removerPedido(Pedidos p) {
        pedidos.remove(p);
    }

    public void removerCliente(Cliente c) {
        clientes.remove(c);
    }

    public void removerFuncionario(Funcionario f) {
        funcionarios.remove(f);
    }
    */
}
