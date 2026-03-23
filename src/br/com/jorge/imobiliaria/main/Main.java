package br.com.jorge.imobiliaria.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.com.jorge.imobiliaria.auth.*;
import br.com.jorge.imobiliaria.model.*;

public class Main {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 1;

        System.out.println("=== Sistema de Gestão Imobiliária ===");
         while (opcao != 0) {
             System.out.println("");
             System.out.println("1. Login");
             System.out.println("0. Sair");
             System.out.println("Escolha: ");
             opcao = scan.nextInt();
             switch (opcao) {
                 case 1:
                     scan.nextLine();

                     while (true) {
                         System.out.println("=== Login ===");
                         System.out.println("Digite seu usuário (insira 0 caso não tenha):");
                         String usuario = scan.nextLine();
                         
                         if (usuario.equals("0")) {
                             Cadastro cadastro = new Cadastro();
                             cadastro.CadastrarFuncionario();
                             break; // Sai do laço de login e volta para o menu inicial
                         } else {
                             System.out.println("Digite sua senha:");
                             String senha = scan.nextLine();
                             
                             if (new ServicoAutenticacao().logar(usuario, senha)) {
                                 System.out.println("Login realizado com sucesso!");
                                 System.out.println();
                                 MenuPrincipal menu = new MenuPrincipal();
                                 menu.exibirMenu();
                                 break;
                             } else {
                                 System.out.println("Dados inválidos. Tente novamente.");
                                 System.out.println();
                             }
                         }
                     }
                     break;
                 case 0:
                     System.out.println("Saindo do sistema...");
                     break;
             }
         }
    }

    public static List<UsuarioLogin> usuarios = new ArrayList<>();
    public static List<Imovel> imoveis = new ArrayList<>();
    public static List<Cliente> clientes = new ArrayList<>();
    public static List<Transacao> transacoes = new ArrayList<>();
    public static int geradorContrato = 1;
}