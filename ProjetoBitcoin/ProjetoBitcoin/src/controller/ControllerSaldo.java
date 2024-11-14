package controller;

import DAO.Conexao;
import DAO.SaldoDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import model.Saldo;
import view.ConSaldoSenha;
import DAO.LoginDAO;
import model.Login;

public class ControllerSaldo {
    
    private ConSaldoSenha view;
   // private ConSaldoFrame view2;
    private static String CpfLogin;
    
    public ControllerSaldo(ConSaldoSenha view){
        this.view = view;
       // this.view2 = new ConSaldoFrame();
        
    }

    public static String getCpfLogin() {
        return CpfLogin;
    }

    public static void setCpfLogin(String CpfLogin) {
        ControllerSaldo.CpfLogin = CpfLogin;
    }
     
        
    
    
    public void Saldo(){
        Saldo sf = new Saldo(CpfLogin, view.getTxtsenhasaldo().getText());
        
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            SaldoDAO dao = new SaldoDAO(conn);
            ResultSet res = dao.consultar(sf);

        if (res.next()){
                JOptionPane.showMessageDialog(view, "Saldo Acessado", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
                
                String senha = res.getString("senha");
                String nome = res.getString("nome");
                Saldo sf1 = new Saldo(CpfLogin, senha);
               
                res = dao.consultarsaldo(sf1);
                if(res.next()){
                    double saldo = res.getDouble("saldo");
                    double saldobtc = res.getDouble("saldobtc");
                    double saldoeth = res.getDouble("saldoeth");
                    double saldoxrp = res.getDouble("saldoxrp");
                    view.getTxtsaldo().setText("Nome: " + nome + "\nCPF: " + CpfLogin + "\nReal: " + saldo + " \nBtc: " + saldobtc + " \nEth: " + saldoeth + "\nXrp: " + saldoxrp);

                }
                
        }else{
            JOptionPane.showMessageDialog(view, "Saldo não acessado", "Erro",
                        JOptionPane.ERROR_MESSAGE);
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Erro de Conexão", "Erro",
                        JOptionPane.ERROR_MESSAGE);
       }
}
}
