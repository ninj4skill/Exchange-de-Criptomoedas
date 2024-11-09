package controller;

import DAO.LoginDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import view.LoginFrame;
import model.Login;
import view.Menu;

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
        System.out.println("1");
        
        Conexao conexao = new Conexao();
        System.out.println("2");
        try{
            Connection conn = conexao.getConnection();
            System.out.println("3");
            LoginDAO dao = new LoginDAO(conn);
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
                Login lf1 = new Login(nome, cpf, senha);
                System.out.println("10");
                Menu mn = new Menu();
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
