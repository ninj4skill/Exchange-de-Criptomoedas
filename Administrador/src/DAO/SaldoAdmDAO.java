
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import model.SaldoAdm;

public class SaldoAdmDAO {
     private Connection conn;

    public SaldoAdmDAO(Connection conn) {
        this.conn = conn;
    }
     
     
 public ResultSet consultar(SaldoAdm usuarios) throws SQLException{
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
}
