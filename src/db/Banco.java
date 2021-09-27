package db;

import java.util.ArrayList;

import humanos.Cliente;
import humanos.Funcionario;

// Singleton aplicado. Somente uma instância do
// banco de dados será acessada em todo o programa
public class Banco {
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

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
}
