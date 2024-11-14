package model;


public class Saldo {
    
    private String cpf, senha;

    public Saldo() {
    }

    public Saldo(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Saldo{" + "cpf=" + cpf + ", senha=" + senha + '}';
    }


    
}
