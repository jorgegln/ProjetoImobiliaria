package br.com.jorge.imobiliaria.auth;

import br.com.jorge.imobiliaria.main.Main;
import br.com.jorge.imobiliaria.model.UsuarioLogin;

import java.util.ArrayList;
import java.util.List;

public class ServicoAutenticacao {
    public boolean logar(String loginInformado, String senhaInformada) {
        for (UsuarioLogin u : Main.usuarios) {
            if (u.getUsuario().equals(loginInformado) && u.getSenha().equals(senhaInformada)) {
                return true;
            }
        }
        return false;
    }
}
