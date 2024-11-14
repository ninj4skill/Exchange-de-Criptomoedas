package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import model.Saldo;

public class SaldoDAO {
    
    private Connection conn;

    public SaldoDAO(Connection conn) {
        this.conn = conn;
    }
    
    public ResultSet consultar(Saldo usuarios) throws SQLException{
        
        String sql = "select * from usuarios where cpf = ? AND senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuarios.getCpf());
        statement.setString(2, usuarios.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
        
    }
    
    public ResultSet consultarsaldo(Saldo usuarios) throws SQLException{
        
        String sql = "select * from carteira where senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuarios.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
        
    }
    
}


