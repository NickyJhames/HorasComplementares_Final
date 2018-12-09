
package Model;

import java.util.Date;


public class Atestado {
    String obs, resultado;
    Date dataemissao, dataencerramento;
    int chtotal;
    Certificado certificado;
    Aluno aluno;

    public Atestado(String obs, String resultado, Date dataemissao, Date dataencerramento, int chtotal, Certificado certificado, Aluno aluno) {
        this.obs = obs;
        this.resultado = resultado;
        this.dataemissao = dataemissao;
        this.dataencerramento = dataencerramento;
        this.chtotal = chtotal;
        this.certificado= certificado;
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Certificado getCertificado() {
        return certificado;
    }

    public String getObs() {
        return obs;
    }

    public String getResultado() {
        return resultado;
    }

    public Date getDataemissao() {
        return dataemissao;
    }

    public Date getDataencerramento() {
        return dataencerramento;
    }

    public int getChtotal() {
        return chtotal;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void setDataemissao(Date dataemissao) {
        this.dataemissao = dataemissao;
    }

    public void setDataencerramento(Date dataencerramento) {
        this.dataencerramento = dataencerramento;
    }

    public void setChtotal(int chtotal) {
        this.chtotal = chtotal;
    }

    public void setCertificado(Certificado certificado) {
        this.certificado = certificado;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
        
}
