package br.com.jorge.imobiliaria.auth;

import br.com.jorge.imobiliaria.main.Main;
import br.com.jorge.imobiliaria.model.Funcionario;


public class ServicoAutenticacao {
    public boolean logar(String loginInformado, String senhaInformada) {
        for (Funcionario u : Main.funcionarios) {
            if (u.getUsuario().equals(loginInformado) && u.getSenha().equals(senhaInformada)) {
                return true;
            }
        }
        return false;
    }
}
