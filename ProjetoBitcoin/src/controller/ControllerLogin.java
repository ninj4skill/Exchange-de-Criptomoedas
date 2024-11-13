package controller;

import DAO.LoginDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import model.Deposito;
import view.LoginFrame;
import model.Login;
import view.Menu;
import controller.ControllerSaldo;

public class ControllerLogin {
    private LoginFrame view;
    public String cpfLogin;
    
        
    public ControllerLogin(LoginFrame view){
        this.view = view;
    }

    public ControllerLogin() {
    }
       
    public void Login(){
        Login lf = new Login(null, view.getTxtcpf().getText(), view.getTxtsenha().getText());

        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            LoginDAO dao = new LoginDAO(conn);
            ResultSet res = dao.consultar(lf);

            
            if (res.next()){
                JOptionPane.showMessageDialog(view, "Login feito", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
                //ControllerSaldo.setCpfLogado(cpf);
                String nome = res.getString("nome");
                String cpf = res.getString("cpf");
                ControllerSaldo.setCpfLogin(cpf);
                //ControllerSaldo.setCpfLogado(cpf);
                String senha = res.getString("senha");
                Login lf1 = new Login(nome, cpf, senha);
                Menu mn = new Menu();
                mn.setVisible(true);
                view.setVisible(false);
                //cpfLogin = cpf;
                
            } else{
                JOptionPane.showMessageDialog(view, "Login não foi feito", "Erro",
                        JOptionPane.ERROR_MESSAGE);
                System.out.println("14");
            }
            
    }catch(SQLException e){
                    JOptionPane.showMessageDialog(view, "Erro de Conexão", "Erro",
                        JOptionPane.ERROR_MESSAGE);
                    System.out.println("15");
                    }
    
}
}
