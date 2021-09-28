package humanos;

import java.util.UUID;

// As classes funcionários e clientes herdarão desta classe.
public class Pessoa {
    private String nome;
    private int idade;
    private String eMail;
    private String senha;
    private String id;
    // Pode ser criado um enum para armazenar o endereço
    private String endereco;

    public Pessoa(String nome, int idade, String email, String senha) {
        setNome(nome);
        setIdade(idade);
        setEmail(email);
        setSenha(senha);
        setId(UUID.randomUUID().toString());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }

    public String getEmail() {
        return this.eMail;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
