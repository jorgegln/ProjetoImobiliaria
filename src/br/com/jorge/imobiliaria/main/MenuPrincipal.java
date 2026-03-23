package br.com.jorge.imobiliaria.main;

import java.util.Scanner;
import br.com.jorge.imobiliaria.model.*;

public class MenuPrincipal {
    public MenuPrincipal() {
        exibirMenu();
    }

    public void exibirMenu() {
        System.out.println("=== Menu Principal ===");
        System.out.println("1. Gestão de Imóveis");
        System.out.println("2. Gestão de Clientes");
        System.out.println("3. Gestão de Contratos");
        System.out.println("4. Relatórios");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

}
