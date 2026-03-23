package br.com.jorge.imobiliaria.auth;

import br.com.jorge.imobiliaria.model.UsuarioLogin;

import java.util.ArrayList;
import java.util.List;

public class ServicoAutenticacao {
    private List<UsuarioLogin> usuariosCadastrados = new ArrayList<>();

    public ServicoAutenticacao() {
        usuariosCadastrados.add(new UsuarioLogin("admin", "1234"));
        usuariosCadastrados.add(new UsuarioLogin("jorge", "senhaSegura"));
    }

    public boolean logar(String loginInformado, String senhaInformada) {
        for (UsuarioLogin u : usuariosCadastrados) {
            if (u.getLogin().equals(loginInformado) && u.getSenha().equals(senhaInformada)) {
                return true; // Login bem-sucedido
            }
        }
        return false; // Credenciais incorretas
    }
}
