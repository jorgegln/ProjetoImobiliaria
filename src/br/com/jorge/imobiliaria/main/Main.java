package br.com.jorge.imobiliaria.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.com.jorge.imobiliaria.auth.*;
import br.com.jorge.imobiliaria.model.*;

public class Main {
    public static String usuarioLogado = "";
    public static String senhaLogada = "";
    public static List<Funcionario> funcionarios = new ArrayList<>();
    public static List<Imovel> imoveis = new ArrayList<>();
    public static List<Cliente> clientes = new ArrayList<>();
    public static List<Transacao> transacoes = new ArrayList<>();
    public static int geradorContrato = 1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 1;
        UsuarioLogin userAdmin = new UsuarioLogin("admin", "admin");
        Endereco enderecoAdmin = new Endereco(1, "1", "1", "1", "1", "1");
        List<String> telefonesAdmin = new ArrayList<>();
        Funcionario admin = new Funcionario("1", "1", enderecoAdmin, telefonesAdmin, Sexo.MASCULINO, LocalDate.now(), "1", 1.0, userAdmin);
        funcionarios.add(admin);

        System.out.printf("\n=== Sistema de Gestão Imobiliária ===\n");
         while (opcao != 0) {
             IO.println("1. Login");
             IO.println("0. Sair");
             IO.print("Escolha: ");
             opcao = scan.nextInt();
             IO.println("");

             switch (opcao) {
                 case 1:
                     scan.nextLine();

                     while (true) {
                         IO.println("=== Login ===");
                         IO.println("Digite seu usuário (insira 0 caso não tenha):");
                         usuarioLogado = scan.nextLine();
                         
                         if (usuarioLogado.equals("0")) {
                             Cadastro cadastro = new Cadastro();
                             cadastro.CadastrarFuncionario();
                             break; // Sai do laço de login e volta para o menu inicial
                         } else {
                             IO.println("Digite sua senha:");
                             senhaLogada = scan.nextLine();
                             
                             if (new ServicoAutenticacao().logar(usuarioLogado, senhaLogada)) {
                                 IO.println("Login realizado com sucesso!");
                                 MenuPrincipal menu = new MenuPrincipal();
                                 menu.exibirMenu();
                                 break;
                             } else {
                                 IO.println("Dados inválidos. Tente novamente.");
                             }
                         }
                     }
                     break;
                 case 0:
                     IO.println("Saindo do sistema...");
                     break;
                 default:
                     IO.println("Opção inválida. Tente novamente.");
                     break;
             }
         }
    }
}