package br.com.jorge.imobiliaria.model;

public class UsuarioLogin {
    private String login;
    private String senha;

    public UsuarioLogin(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    // Getters para validação
    public String getLogin() { return login; }
    public String getSenha() { return senha; }
}
