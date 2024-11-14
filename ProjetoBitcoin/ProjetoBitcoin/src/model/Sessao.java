package model;


public class Sessao {
    
    private static String  nomeLogado, cpfLogado, senhaLogado;

    public Sessao() {
    }
    
    public Sessao(String nomeLogado, String cpfLogado, String senhaLogado){
        this.nomeLogado = nomeLogado;
        this.cpfLogado = cpfLogado;
        this.senhaLogado = senhaLogado;
    }

    public static String getNomeLogado() {
        return nomeLogado;
    }

    public static void setNomeLogado(String nomeLogado) {
        Sessao.nomeLogado = nomeLogado;
    }

    public static String getCpfLogado() {
        return cpfLogado;
    }

    public static void setCpfLogado(String cpfLogado) {
        Sessao.cpfLogado = cpfLogado;
    }

    public static String getSenhaLogado() {
        return senhaLogado;
    }

    public static void setSenhaLogado(String senhaLogado) {
        Sessao.senhaLogado = senhaLogado;
    }

    
    
}
    
