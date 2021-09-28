package db;

import java.util.ArrayList;

import cliente.Pedidos;
import humanos.Cliente;
import humanos.Funcionario;

public class Banco {
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Pedidos> pedidos = new ArrayList<Pedidos>();

    public static Banco getInstance() {
        return new Banco();
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Funcionario buscarFuncionario(String id) {
        for (Funcionario f : funcionarios) {
            if (f.getId().equals(id)) {
                return f;
            }
        }

        return null;
    }

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
}
