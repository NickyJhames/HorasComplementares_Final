
package Model;


public class Pessoa {
    int id;
            
    String nome,email,senha,cpf,telefone ;

    public Pessoa(String cpf, String senha, String telefone, String nome, String email) {
        this.cpf = cpf;
        this.senha = senha;
        this.telefone = telefone;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
