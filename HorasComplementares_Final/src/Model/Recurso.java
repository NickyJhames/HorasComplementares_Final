package Model;

public class Recurso {

    String idCertificado, descricao;

    public Recurso(String idCertificado, String descricao) {
        this.idCertificado = idCertificado;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIdCertificado() {
        return idCertificado;
    }

    public void setIdCertificado(String idCertificado) {
        this.idCertificado = idCertificado;
    }

}
