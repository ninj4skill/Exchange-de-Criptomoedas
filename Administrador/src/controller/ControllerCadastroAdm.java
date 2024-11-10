package controller;


import DAO.LoginAdmDAO;
import DAO.ConexaoAdm;
import view.CadastroFrameAdmin;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.LoginAdm;

public class ControllerCadastroAdm {
    
    private CadastroFrameAdmin view;
    
    public ControllerCadastroAdm (CadastroFrameAdmin view){
        this.view = view;
    }
   
    public void SalvarUsuario(){
        String nome = view.getTxtCadastroNomeAdm().getText();
        String cpf = view.getTxtCadastroCpfAdm().getText();
        String senha = view.getTxtCadastroSenhaAdm().getText();
        LoginAdm cadastro = new LoginAdm(nome, cpf, senha);
        ConexaoAdm conn = new ConexaoAdm();
        
       try{
           Connection connection = conn.getConnection();
           LoginAdmDAO dao = new LoginAdmDAO(connection);
           dao.inserir(cadastro);
           JOptionPane.showMessageDialog(view, "Usuário Cadastrado com Sucesso", "Cadastrado!", JOptionPane.INFORMATION_MESSAGE);
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(view, "Falha no Cadastro.", "Erro!", JOptionPane.ERROR_MESSAGE);
           e.printStackTrace();
       }
    }
}


