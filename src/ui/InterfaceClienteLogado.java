package ui;

import humanos.Cliente;

// Interface que estabelce quais as interfaces de usuário precisam de um cliente logado para serem inicializadas.

public interface InterfaceClienteLogado {
    
    // Função abstrata criada para implementar as interfaces de usuário com o cliente logado.
    public abstract void mostrarInterface(Cliente cliente);
}