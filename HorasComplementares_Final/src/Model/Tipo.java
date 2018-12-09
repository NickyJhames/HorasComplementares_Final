
package Model;

public class Tipo {
    String nome;
    int chmaxima, codigo;

    public Tipo(String nome, int chmaxima, int codigo) {
        this.nome = nome;
        this.chmaxima = chmaxima;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getChmaxima() {
        return chmaxima;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setChmaxima(int chmaxima) {
        this.chmaxima = chmaxima;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
}
