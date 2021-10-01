package humanos;

// import java.util.UUID;

// Esta classe guarda as informações principais de um cliente.
public class Pessoa {
    private String nome;
    private int idade;
    private String eMail;
    private String senha;

    public Pessoa(String nome, int idade, String email, String senha) {
        setNome(nome);
        setIdade(idade);
        setEmail(email);
        setSenha(senha);
        // this.id = UUID.randomUUID().toString();
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

}
