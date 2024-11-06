package controller;


import DAO.LoginDAO;
import DAO.Conexao;
import model.Cadastro;
import view.CadastroFrame;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Login;

public class ControllerCadastro {
    
    private CadastroFrame view;
    
    public ControllerCadastro (){
        this.view = view;
    }
   
    public void SalvarUsuario(){
        String nome = view.getTxtcadastronome().getText();
        String cpf = view.getTxtcadastrocpf().getText();
        String senha = view.getCadastrosenha().getText();
        
        Login cadastro = new Login (nome, cpf, senha);
        
        Conexao conexao = new Conexao();
    }
}


