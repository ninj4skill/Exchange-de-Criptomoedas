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

    public DepositoDAO(Connection conn) {
        this.conn = conn;
    }
    
    
    
    public ResultSet consultar(Deposito usuarios) throws SQLException{
        
        String sql = "SELECT * FROM usuarios WHERE cpf = ? AND senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuarios.getCpf());
        statement.setString(2, usuarios.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;   
        
    }
    
    public ResultSet atualizar(Deposito carteira) throws SQLException{
        
        String sql = "update carteira set saldo = ? where senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, carteira.getSaldoReais());
        statement.setString(2, carteira.getSenha());
        statement.execute();
        return statement.getResultSet();
        
    }
    
//    public boolean inserirSaldo(String senha, double saldo) throws SQLException {
//        
//        String sql = "INSERT INTO carteira (senha, saldo) VALUES (?, ?)";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setString(1, senha);
//        statement.setDouble(2, saldo);
//        int rowsInserted = statement.executeUpdate();
//        return rowsInserted > 0; 
//        
//    }
    
}
