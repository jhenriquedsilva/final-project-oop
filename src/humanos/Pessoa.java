package humanos;

// Esta classe guarda as informações principais de um cliente.
public class Pessoa {
  private String nome;
  private int idade;
  private String eMail;
  private String senha;

  /**
   * Construtor da classe Pessoa.
   * 
   * @param nome  Nome da pessoa.
   * @param idade Idade da pessoa.
   * @param email Email da pessoa.
   * @param senha Senha da pessoa.
   */
  public Pessoa(String nome, int idade, String email, String senha) {
    setNome(nome);
    setIdade(idade);
    setEmail(email);
    setSenha(senha);
  }

  /**
   * Altera o nome da pessoa.
   * 
   * @param nome Novo nome da pessoa.
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Retorna o nome da pessoa.
   * 
   * @return Nome da pessoa.
   */
  public String getNome() {
    return this.nome;
  }

  /**
   * Altera a idade da pessoa.
   * 
   * @param idade Nova idade da pessoa.
   */
  public void setIdade(int idade) {
    this.idade = idade;
  }

  /**
   * Retorna a idade da pessoa.
   * 
   * @return Idade da pessoa.
   */
  public int getIdade() {
    return this.idade;
  }

  /**
   * Altera o email da pessoa.
   * 
   * @param eMail Novo email da pessoa.
   */
  public void setEmail(String eMail) {
    this.eMail = eMail;
  }

  /**
   * Retorna o email da pessoa.
   * 
   * @return Email da pessoa.
   */
  public String getEmail() {
    return this.eMail;
  }

  /**
   * Altera a senha da pessoa.
   * 
   * @param senha Nova senha da pessoa.
   */
  public void setSenha(String senha) {
    this.senha = senha;
  }

  /**
   * Retorna a senha da pessoa.
   * 
   * @return Senha da pessoa.
   */
  public String getSenha() {
    return this.senha;
  }

}
