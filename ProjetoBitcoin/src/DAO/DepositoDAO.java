package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import model.Deposito;
import model.Login;


public class DepositoDAO {
    
    public String cpfLogado;
    private Connection conn;
    
    public ResultSet consultar(Login usuarios) throws SQLException{
        
        String sql = "select cpf from usuarios where senha = ? ";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuarios.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;        
    }
    
    public void atualizar(Deposito carteira) throws SQLException{
        String sql = "update carteira set saldo = ? where senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, carteira.getSenha());
        statement.setDouble(2, carteira.getSaldoReais());
        statement.execute();
        conn.close();
    }
    
}
