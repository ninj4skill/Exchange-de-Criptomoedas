
package model;

public class LoginAdm {
    private String nomeAdm, cpfAdm, senhaAdm;

    public LoginAdm() {
    }

    public LoginAdm(String nomeAdm, String cpfAdm, String senhaAdm) {
        this.nomeAdm = nomeAdm;
        this.cpfAdm = cpfAdm;
        this.senhaAdm = senhaAdm;
    }

    public String getNomeAdm() {
        return nomeAdm;
    }

    public void setNomeAdm(String nomeAdm) {
        this.nomeAdm = nomeAdm;
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
        return "Login{" + "nome=" + nomeAdm + ", cpf=" + cpfAdm + 
                ", senha=" + senhaAdm + '}';
    }
    
}
