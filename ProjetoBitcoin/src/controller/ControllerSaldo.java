package controller;

import DAO.Conexao;
import DAO.SaldoDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import model.Saldo;
import view.ConSaldoFrame;
import view.ConSaldoSenha;
import controller.ControllerLogin;

public class ControllerSaldo {
    
    private ConSaldoSenha view;
    private String CpfLogin;
    
    public ControllerSaldo(ConSaldoSenha view, String CpfLogin){
        this.view = view;
        String cpfLogado = null;
        
    }
    
    public ControllerSaldo(){
        
    }
    
    public void Saldo(){
        Saldo sf = new Saldo(view.getTxtsenhasaldo().getText(), cpfLogado);
        
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            SaldoDAO dao = new SaldoDAO(conn);
            ResultSet res = dao.consultar(sf);

        if (res.next()){
                JOptionPane.showMessageDialog(view, "Saldo Acessado", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
                String cpf = res.getString("cpf");
                String senha = res.getString("senha");
                Saldo sf1 = new Saldo(cpf, senha);
                ConSaldoFrame csf = new ConSaldoFrame();
                csf.setVisible(true);
                view.setVisible(false);
                
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
