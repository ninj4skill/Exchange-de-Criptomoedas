
package DAO;

public class ConexaoAdm {
         public Connection getConnection() throws SQLException{
        Connection conexao = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/ninja_bank","postgres","guedes");
        return conexao;    
}
