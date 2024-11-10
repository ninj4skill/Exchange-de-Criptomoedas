
package model;


public class SaldoAdm {
     private String cpfAdm, senhaAdm;

    public SaldoAdm() {
    }

    public SaldoAdm(String cpfAdm, String senhaAdm) {
        this.cpfAdm = cpfAdm;
        this.senhaAdm = senhaAdm;
    }

    public String getCpfAdm() {
        return cpfAdm;
    }

    public void setCpfAdm(String cpfAdm) {
        this.cpfAdm = cpfAdm;
    }

    public String getSenhaAdm() {
        return senhaAdm;
    }

    public void setSenhaAdm(String senhaAdm) {
        this.senhaAdm = senhaAdm;
    }

 @Override
    public String toString() {
        return "Saldo{" + "cpf=" + cpfAdm + ", senha=" + senhaAdm + '}';
    }
}
