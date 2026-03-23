package br.com.jorge.imobiliaria.main;

import br.com.jorge.imobiliaria.auth.Cadastro;
import br.com.jorge.imobiliaria.model.Imovel;
import br.com.jorge.imobiliaria.model.Cliente;
import br.com.jorge.imobiliaria.model.Transacao;
import br.com.jorge.imobiliaria.model.Funcionario;

import java.util.Scanner;

public class MenuPrincipal {
    public MenuPrincipal() {}

    public void exibirMenu() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.printf("\n=== Menu Principal ===\n");
            IO.println("1. Gestão de Imóveis");
            IO.println("2. Gestão de Clientes");
            IO.println("3. Gestão de Transações");
            IO.println("4. Sair");
            IO.print("Escolha uma opção: ");
            int opcaoMenu = scan.nextInt();
            IO.println("");

            if (opcaoMenu == 4) {
                IO.println("Saindo da conta...");
                break;
            }

            switch (opcaoMenu) {
                case 1:
                    int opcaoImovel = 0;
                    while (opcaoImovel != 5) {
                        System.out.printf("\n=== Gestão de Imóveis ===\n");
                        IO.println("1. Cadastrar Imóvel");
                        IO.println("2. Listar Imóveis");
                        IO.println("3. Editar Imóvel");
                        IO.println("4. Excluir Imóvel");
                        IO.println("5. Voltar");
                        IO.print("Escolha uma opção: ");
                        opcaoImovel = scan.nextInt();
                        IO.println("");

                        switch (opcaoImovel) {
                            case 1:
                                Cadastro cadastro = new Cadastro();
                                cadastro.CadastrarImovel();
                                break;
                            case 2:
                                if (Main.imoveis.isEmpty()) {
                                    IO.println("Nenhum imóvel cadastrado.");
                                } else {
                                    scan.nextLine();
                                    IO.println("Deseja filtrar por bairro? (S/N):");
                                    String desejaFiltrar = scan.nextLine();
                                    
                                    if (desejaFiltrar.equalsIgnoreCase("S")) {
                                        IO.println("Digite o nome do bairro:");
                                        String bairroFiltro = scan.nextLine();
                                        boolean encontrou = false;
                                        
                                        for (int i = 0; i < Main.imoveis.size(); i++) {
                                            Imovel imovel = Main.imoveis.get(i);
                                            if (imovel.getEndereco() != null && 
                                                imovel.getEndereco().getBairro().equalsIgnoreCase(bairroFiltro)) {
                                                IO.println((i + 1) + ". " + imovel.toString());
                                                encontrou = true;
                                            }
                                        }
                                        
                                        if (!encontrou) {
                                            IO.println("Nenhum imóvel encontrado no bairro especificado.");
                                        }
                                    } else {
                                        for (int i = 0; i < Main.imoveis.size(); i++) {
                                            Imovel imovel = Main.imoveis.get(i);
                                            IO.println((i + 1) + ". " + imovel.toString());
                                        }
                                    }
                                }
                                break;
                            case 3:
                                if (Main.imoveis.isEmpty()) {
                                    IO.println("Nenhum imóvel cadastrado para editar.");
                                } else {
                                    for (int i = 0; i < Main.imoveis.size(); i++) {
                                        Imovel imovel = Main.imoveis.get(i);
                                        IO.println((i + 1) + ". " + imovel.toString());
                                    }
                                    IO.println("Escolha o número do imóvel que deseja editar:");
                                    int indexEdicao = scan.nextInt();
                                    if (indexEdicao > 0 && indexEdicao <= Main.imoveis.size()) {
                                        Imovel imovelParaEditar = Main.imoveis.get(indexEdicao - 1);
                                        IO.println("Imóvel selecionado: " + imovelParaEditar.toString());
                                        IO.println("Insira o novo valor sugerido:");
                                        double novoValor = scan.nextDouble();
                                        imovelParaEditar.setValorSugerido(novoValor);
                                        IO.println("Imóvel editado com sucesso!");
                                    } else {
                                        IO.println("Opção inválida!");
                                    }
                                }
                                break;
                            case 4:
                                if (Main.imoveis.isEmpty()) {
                                    IO.println("Nenhum imóvel cadastrado para excluir.");
                                } else {
                                    for (int i = 0; i < Main.imoveis.size(); i++) {
                                        Imovel imovel = Main.imoveis.get(i);
                                        IO.println((i + 1) + ". " + imovel.toString());
                                    }
                                    IO.println("Escolha o número do imóvel que deseja excluir:");
                                    int indexExclusao = scan.nextInt();
                                    if (indexExclusao > 0 && indexExclusao <= Main.imoveis.size()) {
                                        Main.imoveis.remove(indexExclusao - 1);
                                        IO.println("Imóvel excluído com sucesso!");
                                    } else {
                                        IO.println("Opção inválida!");
                                    }
                                }
                                break;
                            case 5:
                                break;
                            default:
                                IO.println("Opção inválida. Tente novamente.");
                                break;
                        }
                    }
                    break;
                case 2:
                    int opcaoCliente = 0;
                    while (opcaoCliente != 5) {
                        System.out.printf("\n=== Gestão de Clientes ===\n");
                        IO.println("1. Cadastrar Cliente");
                        IO.println("2. Listar Clientes");
                        IO.println("3. Editar Cliente");
                        IO.println("4. Excluir Cliente");
                        IO.println("5. Voltar");
                        IO.print("Escolha uma opção: ");
                        opcaoCliente = scan.nextInt();
                        IO.println("");

                        switch (opcaoCliente) {
                            case 1:
                                Cadastro cadastro = new Cadastro();
                                cadastro.CadastrarCliente();
                                break;
                            case 2:
                                if (Main.clientes.isEmpty()) {
                                    IO.println("Nenhum cliente cadastrado.");
                                } else {
                                    for (int i = 0; i < Main.clientes.size(); i++) {
                                        Cliente cliente = Main.clientes.get(i);
                                        IO.println((i + 1) + ". " + cliente.toString());
                                    }
                                }
                                break;
                            case 3:
                                if (Main.clientes.isEmpty()) {
                                    IO.println("Nenhum cliente cadastrado para editar.");
                                } else {
                                    for (int i = 0; i < Main.clientes.size(); i++) {
                                        Cliente cliente = Main.clientes.get(i);
                                        IO.println((i + 1) + ". " + cliente.toString());
                                    }
                                    IO.println("Escolha o número do cliente que deseja editar:");
                                    int indexEdicao = scan.nextInt();
                                    if (indexEdicao > 0 && indexEdicao <= Main.clientes.size()) {
                                        Cliente clienteParaEditar = Main.clientes.get(indexEdicao - 1);
                                        IO.println("Cliente selecionado: " + clienteParaEditar.toString());
                                        scan.nextLine(); // consumir quebra
                                        IO.println("Insira o novo email:");
                                        String novoEmail = scan.nextLine();
                                        clienteParaEditar.setEmail(novoEmail);
                                        IO.println("Cliente editado com sucesso!");
                                    } else {
                                        IO.println("Opção inválida!");
                                    }
                                }
                                break;
                            case 4:
                                if (Main.clientes.isEmpty()) {
                                    IO.println("Nenhum cliente cadastrado para excluir.");
                                } else {
                                    for (int i = 0; i < Main.clientes.size(); i++) {
                                        Cliente cliente = Main.clientes.get(i);
                                        IO.println((i + 1) + ". " + cliente.toString());
                                    }
                                    IO.println("Escolha o número do cliente que deseja excluir:");
                                    int indexExclusao = scan.nextInt();
                                    if (indexExclusao > 0 && indexExclusao <= Main.clientes.size()) {
                                        Main.clientes.remove(indexExclusao - 1);
                                        IO.println("Cliente excluído com sucesso!");
                                    } else {
                                        IO.println("Opção inválida!");
                                    }
                                }
                                break;
                            case 5:
                                break;
                            default:
                                IO.println("Opção inválida. Tente novamente.");
                                break;
                        }
                    }
                    break;
                case 3:
                    int opcaoTransacao = 0;
                    while (opcaoTransacao != 3) {
                        System.out.printf("\n=== Gestão de Transações ===\n");
                        IO.println("1. Realizar Transação");
                        IO.println("2. Listar Transações");
                        IO.println("3. Voltar");
                        IO.println("Escolha uma opção: ");
                        opcaoTransacao = scan.nextInt();
                        IO.println("");

                        switch (opcaoTransacao) {
                            case 1:
                                Funcionario funcionarioLogado = Main.funcionarios.stream()
                                        .filter(f -> f.getUsuario().equals(Main.usuarioLogado))
                                        .findFirst()
                                        .orElse(null);
                                Transacao.realizarTransacao(funcionarioLogado);
                                break;
                            case 2:
                                if (Main.transacoes.isEmpty()) {
                                    IO.println("Nenhuma transação cadastrada.");
                                } else {
                                    for (int i = 0; i < Main.transacoes.size(); i++) {
                                        Transacao transacao = Main.transacoes.get(i);
                                        IO.println((i + 1) + ". " + transacao.toString());
                                    }
                                }
                                break;
                            case 3:
                                break;
                            default:
                                IO.println("Opção inválida. Tente novamente.");
                                break;
                        }
                    }
                    break;
                case 4:
                    break;
                default:
                    IO.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
