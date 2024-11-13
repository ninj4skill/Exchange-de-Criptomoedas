package controller;

import DAO.DepositoDAO;
import model.Deposito;
import model.Login;
import view.DepositoFrame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ControllerDeposito {
 
    private DepositoDAO depositodao;
    
    public ControllerDeposito(){
        this.depositodao = depositodao;
    }
    
    public void depositar(String CpfLogado, double ValorDeposito) throws SQLException{
        Login usuarioLogado = new Login();
        usuarioLogado.setCpf(CpfLogado);
        ResultSet result = depositodao.consultar(usuarioLogado);
        
        if(result.next()){
            String senha = result.getString("senha");
            Deposito deposito = new Deposito(ValorDeposito, senha);
            depositodao.atualizar(deposito);
        }
    }

    public double ObterSaldoAtual(String CpfLogado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
