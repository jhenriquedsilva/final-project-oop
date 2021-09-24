package humanos;


// As classes funcionários e clientes herdarão desta classe.
public class Pessoa {
    private String nome;
    private int idade;
    private String eMail;
    private String senha;
    // Pode ser criado um enum para armazenar o endereço
    private String endereco;

    public Pessoa(String nome, int idade, String eMail, String senha) {
        setNome(nome);
        setIdade(idade);
        setEmail(eMail);
        setSenha(senha);
    }
    
    public void setNome(String nome){this.nome = nome;}

    public String getNome(){return this.nome;}

    public void setIdade(int idade){this.idade = idade;}

    public int getIdade(){return this.idade;}

    public void setEmail(String eMail){this.eMail = eMail;}

    public String getEmail(){return this.eMail;}

    public void setSenha(String senha){this.senha = senha;}

    public String getSenha(){return this.senha;}

    public void setEndereco(String endereco){this.endereco = endereco;}

    public String getEndereco(){return this.endereco;}
    
}
