package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexaoController{
     
    // strings de conexão
    String databaseURL = "jdbc:mysql://localhost/horas_complementares";
    String usuario = "root";
    String senha = "";
    String driverName = "com.mysql.jdbc.Driver";
    Connection conexao;
   
    public boolean conectar(){
    try {
     Class.forName(driverName).newInstance();
      conexao= DriverManager.getConnection(databaseURL, usuario, senha);
      return true;
    }
    catch (SQLException ex) {
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
      return false;
    }
    catch (Exception e) {
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);return false;
    } 
    }
    
    public void desconectar()
    {
       conexao=null;
    }
    
    public boolean sql(String query) throws SQLException{ 
      try{
        Statement st = conexao.createStatement(); 
        st.executeUpdate(query);
//        PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(query);
 //       stmt.executeUpdate();
 //       stmt.close();
        //conexao.close();
//        conectar();
System.out.println("OK");
        return true;
        }catch(SQLException w){
            System.out.println("Erro");
                return false;
        }
        
    }   
public ResultSet pesquisa(String query){ 
      try{
        conectar();
        Statement sb;
        sb=conexao.createStatement();
        ResultSet rs=sb.executeQuery(query);
        return rs;
        }catch(SQLException w){
                System.out.println(w);
                }
        return null;
    }   
                
}
