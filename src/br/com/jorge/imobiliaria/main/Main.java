package br.com.jorge.imobiliaria.main;

import java.util.Scanner;
import br.com.jorge.imobiliaria.auth.Cadastro;
import br.com.jorge.imobiliaria.auth.ServicoAutenticacao;

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
                 cadastro.Cadastro();
                 continue;
             } else {
                 System.out.println("Digite sua senha:");
                 String senha = scan.nextLine();
                 if (usuario.equals("admin") && senha.equals("1234")) {
                     System.out.println("\nLogin realizado com sucesso!");

                     // A mágica acontece aqui: instanciamos a outra classe e chamamos o menu
                     MenuPrincipal menu = new MenuPrincipal();
                     menu.exibirMenu();

                 } else {
                     System.out.println("Dados inválidos. Programa encerrado.");
                 }
             }
         }
    }
}
