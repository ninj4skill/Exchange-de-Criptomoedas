package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import model.Login;
import view.Menu;

public class LoginDAO {
    private Connection conn;

    public LoginDAO(Connection conn) {
        this.conn = conn;
    }
    
    public ResultSet consultar(Login usuarios) throws SQLException{
        //esse código fica vulnerável pipipi :(
        //String sql = "select * from aluno where usuario = '"
        //        + aluno.getUsuario() + "' AND senha = '" + aluno.getSenha() 
        //        + "'";
        
        //String sql = "select * from aluno where usuario = ? AND senha = ?";
        String sql = "select * from usuarios where cpf = ? AND senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuarios.getCpf());
        statement.setString(2, usuarios.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public void inserir(Login usuarios) throws SQLException{
        String sql = "insert into usuarios(nome, cpf, senha) values('"
                + usuarios.getNome() + "', '" + usuarios.getCpf() + "', '"
                + usuarios.getSenha() + "') ";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    

}
