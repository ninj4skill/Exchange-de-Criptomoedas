package controller;


import DAO.LoginDAO;
import DAO.Conexao;
import view.CadastroFrame;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Login;

public class ControllerCadastro {
    
    private CadastroFrame view;
    
    public ControllerCadastro (CadastroFrame view){
        this.view = view;
    }
   
    public void SalvarUsuario(){
        String nome = view.getTxtcadastronome().getText();
        String cpf = view.getTxtcadastrocpf().getText();
        String senha = view.getCadastrosenha().getText();
        Login cadastro = new Login(nome, cpf, senha);
        Conexao conn = new Conexao();
        
       try{
           Connection connection = conn.getConnection();
           LoginDAO dao = new LoginDAO(connection);
           dao.inserir(cadastro);
           JOptionPane.showMessageDialog(view, "Usuário Cadastrado com Sucesso", "Cadastrado!", JOptionPane.INFORMATION_MESSAGE);
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(view, "Falha no Cadastro.", "Erro!", JOptionPane.ERROR_MESSAGE);
           e.printStackTrace();
       }
    }
}


