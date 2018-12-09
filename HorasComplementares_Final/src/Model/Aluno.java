
package Model;

import java.util.Date;


public class Aluno extends Pessoa{
    int matricula, semestre;
    String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

     
    public Aluno(int matricula, int semestre, String nome, String endereco, String cpf, String telefone, String email, String senha) {
        super(cpf, senha, telefone, nome, email);
        this.matricula = matricula;
        this.semestre = semestre;
        this.nome=nome;
        this.endereco=endereco;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public int getMatricula() {
        return matricula;
    }

   

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
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

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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
