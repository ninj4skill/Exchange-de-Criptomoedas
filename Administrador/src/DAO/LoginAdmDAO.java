
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import model.LoginAdm;

public class LoginAdmDAO {
    private Connection conn;

    public LoginAdmDAO(Connection conn) {
        this.conn = conn;
    }

 public ResultSet consultar(LoginAdm usuarios) throws SQLException{
        //esse código fica vulnerável pipipi :(
        //String sql = "select * from aluno where usuario = '"
        //        + aluno.getUsuario() + "' AND senha = '" + aluno.getSenha() 
        //        + "'";
        
        //String sql = "select * from aluno where usuario = ? AND senha = ?";
        String sql = "select * from usuarios where cpf = ? AND senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuarios.getCpfAdm());
        statement.setString(2, usuarios.getSenhaAdm());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public void inserir(LoginAdm usuarios) throws SQLException{
        String sql = "insert into usuarios(nome, cpf, senha) values('"
                + usuarios.getNomeAdm() + "', '" + usuarios.getCpfAdm() + "', '"
                + usuarios.getSenhaAdm() + "') ";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    
}
    
    

