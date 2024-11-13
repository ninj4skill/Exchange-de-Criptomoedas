package model;


public class Deposito {
    
    private double SaldoReais;
    private String senha;

    public Deposito() {
    }
    public Deposito(double SaldoReais, String senha) {
        this.SaldoReais = SaldoReais;
        this.senha = senha;
    }
    public double getSaldoReais() {
        return SaldoReais;
    }
    public void setSaldoReais(double SaldoReais) {
        this.SaldoReais = SaldoReais;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

  
    
}
