package controller;

import DAO.LoginAdmDAO;
import DAO.ConexaoAdm;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import view.LoginFrameAdmin;
import model.LoginAdm;

public class ControllerLoginAdm {
    private LoginFrameAdmin view;
    public String cpfLogin;
    
    public ControllerLoginAdm(LoginFrameAdmin view){
        this.view = view;
    }

    public ControllerLoginAdm() {
    }
       
    public void Login(){
        LoginAdm lf = new LoginAdm(null, view.getTxtCPFAdmin().getText(), view.getTxtSenhaAdmin().getText());
        System.out.println("1");
        
        ConexaoAdm conexao = new ConexaoAdm();
        System.out.println("2");
        try{
            Connection conn = conexao.getConnection();
            System.out.println("3");
            LoginAdmDAO dao = new LoginAdmDAO(conn);
            System.out.println("4");
            ResultSet res = dao.consultar(lf);
            System.out.println("5");
            
            if (res.next()){
                JOptionPane.showMessageDialog(view, "Login feito", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
                System.out.println("6");
                String nome = res.getString("nome");
                System.out.println("7");
                String cpf = res.getString("cpf");
                System.out.println("8");
                String senha = res.getString("senha");
                System.out.println("9");
                LoginAdm lf1 = new LoginAdm(nome, cpf, senha);
                System.out.println("10");
                MenuAdm mn = new MenuAdm();
                System.out.println("11");
                mn.setVisible(true);
                System.out.println("12");
                view.setVisible(false);
                System.out.println("13");
                cpfLogin = cpf;
                
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
