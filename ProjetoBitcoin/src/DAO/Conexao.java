package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import model.Login;

public class Conexao {
    
    public Connection getConnection() throws SQLException{
        Connection conexao = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/ninja_bank","postgres","guedes");
        return conexao;                
    }
        
    
    
}
