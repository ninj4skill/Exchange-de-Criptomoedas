package controller;

import DAO.Conexao;
import DAO.DepositoDAO;
import DAO.SaldoDAO;
import static java.lang.Double.parseDouble;
import model.Deposito;
import model.Login;
import view.DepositoFrame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.Saldo;
import view.ConSaldoSenha;

public class ControllerDeposito {
 
    private DepositoFrame view;
    private static String senha;

    public ControllerDeposito(DepositoFrame view) {
        this.view = view;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        ControllerDeposito.senha = senha;
    }
    
    public void Depositar(){
        System.out.println(senha);
        Saldo sa = new Saldo(null, senha);
        Conexao conexao = new Conexao();
      
        try{
            Connection conn = conexao.getConnection();
            SaldoDAO dao = new SaldoDAO(conn);
            ResultSet res = dao.consultarsaldo(sa);
            
            if(res.next()){
                double saldo = res.getDouble("saldo");
                System.out.println(saldo);
                Deposito deposito = new Deposito(saldo, senha);
                double depositar = Double.parseDouble(view.getTxtdeposito().getText());
                System.out.println(depositar);
                double novosaldo = saldo + depositar;
                System.out.println(novosaldo);
                view.getTxtnotinha().setText(String.valueOf(novosaldo));
                conn = conexao.getConnection();
                DepositoDAO dao2 = new DepositoDAO(conn);
                deposito = new Deposito(novosaldo, senha);
                dao2.atualizar(deposito);
            }else{
                System.out.println("eu vou me matar");
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Erro de Conexão", "Erro",
                        JOptionPane.ERROR_MESSAGE);
        }
    }
    
}


