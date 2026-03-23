package br.com.jorge.imobiliaria.main;

import java.util.Scanner;
import br.com.jorge.imobiliaria.model.*;

public class MenuPrincipal {
    public MenuPrincipal() {}

    public void exibirMenu() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("=== Menu Principal ===");
            System.out.println("1. Gestão de Imóveis");
            System.out.println("2. Gestão de Clientes");
            System.out.println("3. Gestão de Contratos");
            System.out.println("4. Relatórios");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcaoMenu = scan.nextInt();

            if (opcaoMenu == 5) {
                System.out.println("Saindo da conta...");
                break;
            }

            switch (opcaoMenu) {
                case 1:
                    int opcaoImovel = 0;
                    while (opcaoImovel != 5) {
                        System.out.println("=== Gestão de Imóveis ===");
                        System.out.println("1. Cadastrar Imóvel");
                        System.out.println("2. Listar Imóveis");
                        System.out.println("3. Editar Imóvel");
                        System.out.println("4. Excluir Imóvel");
                        System.out.println("5. Voltar");
                        System.out.print("Escolha uma opção: ");
                        opcaoImovel = scan.nextInt();

                        switch (opcaoImovel) {

                        }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

}
