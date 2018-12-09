    package Model;

import java.util.Date;

public class Certificado {
    int codigo, ch, chvalida;
    String  local, nome;
    int validado;
    String data,idAluno;
    Tipo tipoobj;
    Restricoes restricao;

    public Certificado(String idAluno,String nome, int ch, String data,String local,int validado) {
        this.idAluno = idAluno;
        this.ch = ch;    
        this.local = local;
        this.validado = validado;
        this.data = data;
        this.nome=nome;
    }

    public String getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(String idAluno) {
        this.idAluno = idAluno;
    }

    public Restricoes getRestricao() {
        return restricao;
    }

    
    
    public int getCodigo() {
        return codigo;
    }

    public int getCh() {
        return ch;
    }

    public int getChvalida() {
        return chvalida;
    }

    public Tipo getTipoobj() {
        return tipoobj;
    }

    public String getLocal() {
        return local;
    }

    public int getValidado() {
        return validado;
    }

    public String getData() {
        return data;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public void setChvalida(int chvalida) {
        this.chvalida = chvalida;
    }

    public void setTipoobj(Tipo tipoobj) {
        this.tipoobj = tipoobj;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setValidado(int validado) {
        this.validado = validado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setRestricao(Restricoes restricao) {
        this.restricao = restricao;
    }
    
    
}
