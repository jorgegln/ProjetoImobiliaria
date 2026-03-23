package br.com.jorge.imobiliaria.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.com.jorge.imobiliaria.auth.*;
import br.com.jorge.imobiliaria.model.*;

public class Main {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int opcao = 1;

        System.out.println("=== Sistema de Gestão Imobiliária ===");
         while (opcao != 0) {
             System.out.println("");
             System.out.println("Digite seu usuário (insira 0 caso não tenha):");
             String usuario = scan.nextLine();
             if (usuario.equals("0")) {
                 Cadastro cadastro = new Cadastro();
                 cadastro.CadastrarFuncionario();
                 continue;
             } else {
                 System.out.println("Digite sua senha:");
                 String senha = scan.nextLine();
                 if (new ServicoAutenticacao().logar(usuario, senha)) {
                     System.out.println("Login realizado com sucesso!");

                     MenuPrincipal menu = new MenuPrincipal();

                 } else {
                     System.out.println("Dados inválidos. Tente novamente.");
                     continue;
                 }
             }
         }
    }

    public static List<UsuarioLogin> usuarios = new ArrayList<>();
}
