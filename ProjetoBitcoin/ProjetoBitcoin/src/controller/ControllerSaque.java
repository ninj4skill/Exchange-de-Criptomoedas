package controller;
 
import DAO.Conexao;
import DAO.DepositoDAO;
import DAO.SaldoDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Deposito;
import model.Saldo;
import view.DepositoFrame;
import view.SaqueFrame;

public class ControllerSaque {
    
     private SaqueFrame view;
    private static String senha;

    public ControllerSaque(SaqueFrame view) {
        this.view = view;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        ControllerSaque.senha = senha;
    }
    
    public void Sacar(){
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
                double saque = Double.parseDouble(view.getTxtsaque().getText());
                System.out.println(saque);
                double novosaldo = saldo - saque;
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
