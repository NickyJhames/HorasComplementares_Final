package Controller;
//##############################################################################

import Model.Aluno;
import Model.Certificado;
import Model.Coordenador;
import Model.Pessoa;
import Model.Recurso;
import Model.Restricoes;
//##############################################################################
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
//##############################################################################
//##############################################################################
//##############################################################################

public class HorasComplementaresController {

    ConexaoController conexao;
    //#####################################
    Aluno aluno;
    Coordenador coordenador;
    Certificado certificado;
    Pessoa pessoa;
    Recurso recurso;
    Restricoes restricao;
    String idUsuario;
    int idTipo;

    //#####################################
    public HorasComplementaresController() {
        conexao = new ConexaoController();

    }

//##############################################################################
    public String logaPessoa(String idUsuario) {
        String sql = ("SELECT aluno.cpf,aluno.senha,aluno.telefone,aluno.nome,aluno.email FROM aluno WHERE(aluno.idAluno=" + idUsuario + ")");
        this.idUsuario=idUsuario;
        pessoa = new Pessoa(select(sql, "cpf"), select(sql, "senha"), select(sql, "telefone"), select(sql, "nome"), select(sql, "email"));
        pessoa.setId(Integer.parseInt(idUsuario));
        return Integer.toString(pessoa.getId());
    }

//#############################@@@MODEL@@@######################################
//############################################################################## 
    public boolean gravaAluno(String Matricula, String Semestre, String Nome,
            String Endereco, String Cpf, String Telefone, String Email, String Senha) {
        //#####################################################################
        int matricula = Integer.parseInt(Matricula);
        int semestre = Integer.parseInt(Semestre);
        //######################################################################
        aluno = new Aluno(matricula, semestre, Nome, Endereco, Cpf, Telefone, Email, Senha);
        gravaSQL("aluno");
        return true;
    }
//##############################################################################
//############################################################################## 
    public boolean editaAluno(String Matricula, String Semestre, String Nome,
            String Endereco, String Cpf, String Telefone, String Email, String Senha,String idUsuario) {
        //#####################################################################
        int matricula = Integer.parseInt(Matricula);
        int semestre = Integer.parseInt(Semestre);
        this.idUsuario=idUsuario;
        //######################################################################
        aluno = new Aluno(matricula, semestre, Nome, Endereco, Cpf, Telefone, Email, Senha);
        gravaSQL("editaaluno");
        return true;
    }
//##############################################################################

    public boolean gravaCertificado(String idUsuario,String nome, String Ch, String Data, String local,
            int validado, int idTipo) {
        //#####################################################################
        int ch = Integer.parseInt(Ch);
        this.idTipo = idTipo;
        //######################################################################
        //controller.grava();
        certificado = new Certificado(idUsuario,nome, ch, Data, local, validado);

        gravaSQL("certificado");
        return true;
    }
//##############################################################################

    public boolean gravaAtestado(String Matricula, String Semestre, String Nome,
            String Endereco, String Cpf, String Telefone, String Email, String Senha) {
        //#####################################################################
        int matricula = Integer.parseInt(Matricula);
        int semestre = Integer.parseInt(Semestre);
        //######################################################################
        aluno = new Aluno(matricula, semestre, Nome, Endereco, Cpf, Telefone, Email, Senha);
        gravaSQL("aluno");
        return true;
    }
//##############################################################################

    public boolean gravaRecurso(String idCertificado, String descricao,String idUsuario) {
        recurso = new Recurso(idCertificado, descricao);
        this.idUsuario=idUsuario;
        gravaSQL("recurso");
        return true;
    }
//##############################################################################

    public boolean gravaRestricoes( String chmin,String chmax,int tipo) {
        this.idTipo=tipo;
        restricao = new Restricoes(Integer.parseInt(chmin), Integer.parseInt(chmax));
        gravaSQL("restricao");
        return true;
    }
//##############################################################################

    public boolean gravaTipo(String Matricula, String Semestre, String Nome,
            String Endereco, String Cpf, String Telefone, String Email, String Senha) {
        //#####################################################################
        int matricula = Integer.parseInt(Matricula);
        int semestre = Integer.parseInt(Semestre);
        //######################################################################
        aluno = new Aluno(matricula, semestre, Nome, Endereco, Cpf, Telefone, Email, Senha);
        gravaSQL("aluno");
        return true;
    }

//##############################################################################
//#########################@@@ConexãoBanco@@@###################################
//##############################################################################
    ResultSet result;

    public boolean gravaSQL(String sql) {
        switch (sql) {
            case "aluno":
                sql = ("Insert into aluno (Matricula, Semestre,nome, endereco, cpf, telefone, email, senha) "+ "values('" + Integer.toString(aluno.getMatricula()) + "', '" + Integer.toString(aluno.getSemestre()) + "', '" + aluno.getNome() + "', "+ "'" + aluno.getEndereco() + "','" + aluno.getCpf() + "', '" + aluno.getTelefone() + "', '" + aluno.getEmail() + "', '" + aluno.getSenha() + "')");
                break;
            case "editaaluno":
                sql = ("UPDATE aluno SET Matricula = '" + Integer.toString(aluno.getMatricula()) + "', Semestre = '" + Integer.toString(aluno.getSemestre()) + "', nome = '" + aluno.getNome() + "', endereco = "+ "'" + aluno.getEndereco() + "', cpf = '" + aluno.getCpf() + "', telefone = '" + aluno.getTelefone() + "', email = '" + aluno.getEmail() + "', senha = '" + aluno.getSenha()  + "' WHERE idAluno ='" + idUsuario+ "';");
                break;
            case "certificado":
                sql = "Insert into certificado (nome, CH, Data,local,validado, Aluno_idAluno, tipo_idTipo) values('" + certificado.getNome() + "', '"+ certificado.getCh()+ "', '" + certificado.getData() + "', '" + certificado.getLocal() + "', '" + Integer.toString(certificado.getValidado()) + "','" + certificado.getIdAluno() + "','" + (Integer.toString(idTipo) ) + "')";
                break;
            case "recurso":
                sql = "Insert into recurso (idCertificado, descricao, aluno_idAluno) values('" + recurso.getIdCertificado()+ "', '"+ recurso.getDescricao()+ "', '" + idUsuario + "')";
                break;
            case "restricao":
                sql = "Insert into restrições ( Maximo, Minimo, tipo_idTipo) values('" + restricao.getMaximo()+ "', '"+ restricao.getMinimo()+ "', '" + Integer.toString(idTipo) + "')";
                break;
                
        }
        System.out.println(sql);
        conexao.conectar();
        try {
            conexao.sql(sql);
            return true;
        } catch (SQLException ex) {
            return false;
        } finally {
            conexao.desconectar();
        }
    }

//##############################################################################    
    public String select(String sql, String filter) {

        try {
            System.out.println(sql);
            conexao.conectar();
            String result = null;
            ResultSet rs = conexao.pesquisa(sql);
            while (rs.next()) {
                result = rs.getString(filter);
            }

            return result;

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        return null;
    }
    
     public ResultSet selectrs(String sql, String filter) {

        try {
            System.out.println(sql);
            conexao.conectar();
            
            ResultSet rs = conexao.pesquisa(sql);
            while (rs.next()) {
                rs.getString(filter);
            }

            return rs;

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        return null;
    }
//##############################################################################

    public void carregaComboBox(JComboBox comboBox, String sql) {
        try {
            conexao.conectar();
            String result = null;
            ResultSet rs = conexao.pesquisa(sql);
            while (rs.next()) {
                comboBox.addItem(rs.getString("nome"));
            }
            rs.close();
            conexao.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu erro ao carregar a Combo Box", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

}
