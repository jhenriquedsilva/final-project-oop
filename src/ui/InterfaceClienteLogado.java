package ui;

import humanos.Cliente;

// Interface que estabelce quais as interfaces de usuário precisam de um cliente logado para serem inicializadas.

public interface InterfaceClienteLogado {

  /**
   * Método abstrato que recebe um cliente logado.
   * 
   * @param cliente Cliente logado.
   */
  public abstract void mostrarInterface(Cliente cliente);
}