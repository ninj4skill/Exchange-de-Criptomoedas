package model;


public class Sessao {
    
    private static String cpfLogado;

    public static void setCpfLogado(String cpf) {
        cpfLogado = cpf;
    }

    public static String getCpfLogado() {
        return cpfLogado;
    }

    public static void encerrarSessao() {
        cpfLogado = null;
    }
}
    
