package br.senai.model;

public class Login {
    private String Login;
    private int Senha;

    public String getLogin() {
        return Login;
    }
    public void setLogin(String login) {
        Login = login;
    }
    public int getSenha() {
        return Senha;
    }
    public void setSenha(int senha) {
        Senha = senha;
    }

    @Override
    public String toString() {
        return "Login{" +
                "Login='" + Login + '\'' +
                ", Senha=" + Senha +
                '}';
    }
}

