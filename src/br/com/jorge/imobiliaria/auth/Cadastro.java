package br.com.jorge.imobiliaria.auth;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.jorge.imobiliaria.main.*;
import br.com.jorge.imobiliaria.model.*;

public class Cadastro {
    public void CadastrarFuncionario() {
        Scanner scan = new Scanner(System.in);

        IO.println("-> Iniciando formulário de cadastro de usuário...");
        IO.println("Insira seu nome completo:");
        String nome = scan.nextLine();
        IO.println("Insira seu cpf:");
        String cpf = scan.nextLine();
        IO.println("Selecione uma opção de sexo:");
        IO.println("1. Masculino");
        IO.println("2. Feminino");
        IO.println("3. Outro");
        IO.println("Escolha:");
        int opcaoSexo = scan.nextInt();
        Sexo sexo = null;
        switch (opcaoSexo) {
            case 1:
                sexo = Sexo.MASCULINO;
                break;
            case 2:
                sexo = Sexo.FEMININO;
                break;
            case 3:
                sexo = Sexo.OUTRO;
                break;
            default:
                IO.println("Opção inválida! Tente um número de 1 a 3.");
                break;
        }
        scan.nextLine();

        IO.println("Insira seu telefone contato (ex: (xx)9xxxx-xxxx):");
        String telefone1 = scan.nextLine();
        List<String> telefones = new ArrayList<>();
        telefones.add(telefone1);
        IO.println("Possui outro telefone:");
        IO.println("1. Sim");
        IO.println("2. Não");
        IO.println("Escolha:");
        int opcaoTelefone = scan.nextInt();
        switch (opcaoTelefone) {
            case 1:
                IO.println("Insira seu outro telefone:");
                String telefone2 = scan.nextLine();
                telefones.add(telefone2);
                break;
            case 2:
                break;
        }
        scan.nextLine();

        IO.println("=ENDEREÇO=");
        IO.println("Insira sua rua (ex: Rua/Av xxxxxx): ");
        String rua = scan.nextLine();
        IO.println("Insira o número:");
        int numero = scan.nextInt();
        scan.nextLine();
        IO.println("Insira o bairro:");
        String bairro = scan.nextLine();
        IO.println("Insira a cidade:");
        String cidade = scan.nextLine();
        IO.println("Insira o estado:");
        String estado = scan.nextLine();
        IO.println("Insira o CEP:");
        String cep = scan.nextLine();
        Endereco enderecoNewUser = new Endereco(numero, rua, bairro, cidade, estado, cep);

        IO.println("========================");
        IO.println("Insira sua data de ingresso na empresa (ex. 01/01/2026):");
        String dataInput = scan.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataIngresso = LocalDate.parse(dataInput, formatter);
        IO.println("Insira seu cargo:");
        String cargo = scan.nextLine();
        IO.println("Insira o salario:");
        Double salarioBase = scan.nextDouble();
        IO.println("Agora, vamos criar o seu login...");
        String usuarioNewUser = "";
        scan.nextLine();

        boolean usuarioValido = false;
        while (!usuarioValido) {
            IO.println("Insira seu usuário:");
            usuarioNewUser = scan.nextLine();
            boolean jaExiste = false;
            for (Funcionario u : Main.funcionarios) {
                if (u.getUsuario() != null && u.getUsuario().equals(usuarioNewUser)) {
                    jaExiste = true;
                    break;
                }
            }
            if (jaExiste) {
                IO.println("Usuário já existe.");
            } else {
                usuarioValido = true;
            }
        }
        IO.println("Insira sua senha:");
        String senhaNewUser = scan.nextLine();
        UsuarioLogin novoLogin = new UsuarioLogin(usuarioNewUser, senhaNewUser);
        Funcionario novoFuncionario = new Funcionario(nome, cpf, enderecoNewUser, telefones, sexo, dataIngresso, cargo, salarioBase, novoLogin);
        Main.funcionarios.add(novoFuncionario);
        IO.println("Tudo certo! Seu cadastro foi completado com sucesso!");
    }

    public void CadastrarCliente() {
        Scanner scan = new Scanner(System.in);
        IO.println("-> Iniciando formulário de cadastro de cliente...");
        
        IO.println("Insira o nome completo:");
        String nome = scan.nextLine();
        
        IO.println("Insira o cpf:");
        String cpf = scan.nextLine();
        
        IO.println("Selecione uma opção de sexo:");
        IO.println("1. Masculino");
        IO.println("2. Feminino");
        IO.println("3. Outro");
        IO.println("Escolha:");
        int opcaoSexo = scan.nextInt();
        Sexo sexo = null;
        switch (opcaoSexo) {
            case 1:
                sexo = Sexo.MASCULINO;
                break;
            case 2:
                sexo = Sexo.FEMININO;
                break;
            case 3:
                sexo = Sexo.OUTRO;
                break;
            default:
                IO.println("Opção inválida! Tente um número de 1 a 3.");
                break;
        }
        scan.nextLine();

        IO.println("Insira o telefone de contato (ex: (xx)9xxxx-xxxx):");
        String telefone1 = scan.nextLine();
        List<String> telefones = new ArrayList<>();
        telefones.add(telefone1);
        
        IO.println("Possui outro telefone:");
        IO.println("1. Sim");
        IO.println("2. Não");
        IO.println("Escolha:");
        int opcaoTelefone = scan.nextInt();
        scan.nextLine();
        if (opcaoTelefone == 1) {
            IO.println("Insira o outro telefone:");
            String telefone2 = scan.nextLine();
            telefones.add(telefone2);
        }

        Endereco endereco = lerEndereco(scan);

        IO.println("Insira o email:");
        String email = scan.nextLine();
        
        IO.println("Selecione o estado civil:");
        IO.println("1. Casado");
        IO.println("2. Solteiro");
        IO.println("3. Divorciado");
        IO.println("4. União Estável");
        IO.println("5. Viúvo");
        IO.println("Escolha:");
        int opcaoEstadoCivil = scan.nextInt();
        EstadoCivil estadoCivil = null;
        switch(opcaoEstadoCivil) {
            case 1: estadoCivil = EstadoCivil.CASADO; break;
            case 2: estadoCivil = EstadoCivil.SOLTEIRO; break;
            case 3: estadoCivil = EstadoCivil.DIVORCIADO; break;
            case 4: estadoCivil = EstadoCivil.UNIAO_ESTAVEL; break;
            case 5: estadoCivil = EstadoCivil.VIUVO; break;
            default: IO.println("Opção inválida!"); break;
        }
        scan.nextLine();
        
        IO.println("Insira a profissão:");
        String profissao = scan.nextLine();
        
        List<Fiador> fiadores = CadastrarFiador();
        List<Indicacao> indicacoes = CadastrarIndicacoes();
        
        ClienteUsuario novoCliente = new ClienteUsuario(nome, cpf, endereco, telefones, sexo, email, estadoCivil, 
                profissao, fiadores, indicacoes);
        Main.clientes.add(novoCliente);
        IO.println("Cliente cadastrado com sucesso!");
    }
    
    public List<Fiador> CadastrarFiador() {
        Scanner scan = new Scanner(System.in);
        List<Fiador> fiadores = new ArrayList<>();
        IO.println("-> Iniciando formulário de cadastro de fiador...");
        IO.println("Insira o nome completo do fiador:");
        String nome = scan.nextLine();

        IO.println("Insira o cpf do fiador:");
        String cpf = scan.nextLine();

        IO.println("Selecione uma opção de sexo do fiador:");
        System.out.printf("1. Masculino\n2. Feminino\n3. Outro\n");
        IO.println("Escolha:");
        int opcaoSexo = scan.nextInt();
        Sexo sexo = null;
        switch (opcaoSexo) {
            case 1:
                sexo = Sexo.MASCULINO;
                break;
            case 2:
                sexo = Sexo.FEMININO;
                break;
            case 3:
                sexo = Sexo.OUTRO;
                break;
            default:
                IO.println("Opção inválida!");
                break;
        }
        scan.nextLine();

        IO.println("Insira o telefone de contato do fiador:");
        String telefone = scan.nextLine();
        List<String> telefones = new ArrayList<>();
        telefones.add(telefone);

        Endereco endereco = lerEndereco(scan);

        IO.println("Insira a renda comprovada do fiador:");
        Double rendaComprovada = scan.nextDouble();
        scan.nextLine();

        Fiador novoFiador = new Fiador(nome, cpf, endereco, telefones, sexo, rendaComprovada);
        fiadores.add(novoFiador);
        IO.println("Fiador cadastrado com sucesso!");
        return fiadores;
    }
    
    public List<Indicacao> CadastrarIndicacoes() {
        Scanner scan = new Scanner(System.in);
        List<Indicacao> indicacoes = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {
            IO.println("-> Iniciando formulário de cadastro da indicação " + i + "...");
            IO.println("Insira o nome completo da indicação:");
            String nome = scan.nextLine();

            IO.println("Insira o cpf da indicação:");
            String cpf = scan.nextLine();

            IO.println("Selecione uma opção de sexo da indicação:");
            System.out.printf("1. Masculino\n2. Feminino\n3. Outro\n");
            IO.println("Escolha:");
            int opcaoSexo = scan.nextInt();
            Sexo sexo = null;
            switch (opcaoSexo) {
                case 1:
                    sexo = Sexo.MASCULINO;
                    break;
                case 2:
                    sexo = Sexo.FEMININO;
                    break;
                case 3:
                    sexo = Sexo.OUTRO;
                    break;
                default:
                    IO.println("Opção inválida!");
                    break;
            }
            scan.nextLine();

            IO.println("Insira o telefone de contato da indicação:");
            String telefone = scan.nextLine();
            List<String> telefones = new ArrayList<>();
            telefones.add(telefone);

            Endereco endereco = lerEndereco(scan);

            Indicacao novaIndicacao = new Indicacao(nome, cpf, endereco, telefones, sexo);

            IO.println("Insira o parentesco/relação com essa indicação:");
            String parentesco = scan.nextLine();
            novaIndicacao.setParentescoRelacao(parentesco);

            indicacoes.add(novaIndicacao);
            IO.println("Indicação " + i + " cadastrada com sucesso!");
        }
        
        return indicacoes;
    }

    public void CadastrarImovel() {
        Scanner scan = new Scanner(System.in);
        IO.println("-> Iniciando formulário de cadastro de imóvel...");
        IO.println("Informe o tipo de imóvel");
        IO.println("1. Casa");
        IO.println("2. Apartamento");
        IO.println("3. Sala comercial");
        IO.println("4. Terreno");
        IO.println("Escolha:");
        int opcaoImovel = scan.nextInt();
        switch (opcaoImovel) {
            case 1:
                CadastrarCasa();
                break;
            case 2:
                CadastrarApartamento();
                break;
            case 3: 
                CadastrarSalaComercial();
                break;
            case 4:
                CadastrarTerreno();
                break;
            default:
                IO.println("Opção inválida! Tente um número de 1 a 4.");
                break;
        }
    }
    
    private Endereco lerEndereco(Scanner scan) {
        IO.println("=ENDEREÇO=");
        IO.println("Insira a rua (ex: Rua/Av xxxxxx): ");
        String rua = scan.nextLine();
        IO.println("Insira o número:");
        int numero = scan.nextInt();
        scan.nextLine();
        IO.println("Insira o bairro:");
        String bairro = scan.nextLine();
        IO.println("Insira a cidade:");
        String cidade = scan.nextLine();
        IO.println("Insira o estado:");
        String estado = scan.nextLine();
        IO.println("Insira o CEP:");
        String cep = scan.nextLine();
        return new Endereco(numero, rua, bairro, cidade, estado, cep);
    }

    public void CadastrarCasa() {
        Scanner scan = new Scanner(System.in);
        IO.println("-> Iniciando formulário de cadastro da Casa...");

        Endereco endereco = lerEndereco(scan);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        IO.println("========================");
        IO.println("Insira a data de construção (ex. 01/01/2000):");
        String dataConstrucaoInput = scan.nextLine();
        LocalDate dataConstrucao = LocalDate.parse(dataConstrucaoInput, formatter);
        
        IO.println("Insira o valor sugerido:");
        Double valorSugerido = scan.nextDouble();
        
        IO.println("Selecione o status do imóvel:");
        IO.println("1. Disponível para Venda");
        IO.println("2. Disponível para Locação");
        IO.println("Escolha:");
        int opcaoStatus = scan.nextInt();
        scan.nextLine();
        StatusImovel statusImovel = (opcaoStatus == 1) ? StatusImovel.DISPONIVEL_VENDA : StatusImovel.DISPONIVEL_LOCACAO;
        
        IO.println("Insira a data de anúncio (ex. 01/01/2024):");
        String dataAnuncioInput = scan.nextLine();
        LocalDate dataAnuncio = LocalDate.parse(dataAnuncioInput, formatter);
        
        IO.println("Insira a data de finalização (pressione Enter para deixar em branco caso não tenha sido finalizado):");
        String dataFinalizacaoInput = scan.nextLine();
        LocalDate dataFinalizacao = dataFinalizacaoInput.isEmpty() ? null : LocalDate.parse(dataFinalizacaoInput, formatter);
        
        IO.println("Insira a quantidade de quartos:");
        Integer qtdQuartos = scan.nextInt();
        
        IO.println("Insira a quantidade de suítes:");
        Integer qtdSuites = scan.nextInt();
        
        IO.println("Insira a quantidade de salas de estar:");
        Integer qtdSalasEstar = scan.nextInt();
        
        IO.println("Insira a quantidade de salas de jantar:");
        Integer qtdSalasJantar = scan.nextInt();
        
        IO.println("Insira a quantidade de vagas na garagem:");
        Integer vagasGaragem = scan.nextInt();
        
        IO.println("Insira a área (em m²):");
        Double area = scan.nextDouble();
        
        IO.println("Possui armário embutido?");
        IO.println("1. Sim");
        IO.println("2. Não");
        IO.println("Escolha:");
        int opcaoArmario = scan.nextInt();
        scan.nextLine();
        Boolean possuiArmarioEmbutido = (opcaoArmario == 1);
        
        IO.println("Insira uma descrição para a casa:");
        String descricao = scan.nextLine();

        Casa novaCasa = new Casa(endereco, dataConstrucao, valorSugerido, statusImovel, dataAnuncio, dataFinalizacao, 
                                 qtdQuartos, qtdSuites, qtdSalasEstar, qtdSalasJantar, vagasGaragem, area, 
                                 possuiArmarioEmbutido, descricao);
                                 
        Main.imoveis.add(novaCasa);
        IO.println("Casa cadastrada com sucesso!");
    }
    
    public void CadastrarApartamento() {
        Scanner scan = new Scanner(System.in);
        IO.println("-> Iniciando formulário de cadastro de Apartamento...");
        
        Endereco endereco = lerEndereco(scan);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        IO.println("========================");
        IO.println("Insira a data de construção (ex. 01/01/2000):");
        String dataConstrucaoInput = scan.nextLine();
        LocalDate dataConstrucao = LocalDate.parse(dataConstrucaoInput, formatter);
        
        IO.println("Insira o valor sugerido:");
        Double valorSugerido = scan.nextDouble();
        
        IO.println("Selecione o status do imóvel:");
        IO.println("1. Disponível para Venda");
        IO.println("2. Disponível para Locação");
        IO.println("Escolha:");
        int opcaoStatus = scan.nextInt();
        scan.nextLine();
        StatusImovel statusImovel = (opcaoStatus == 1) ? StatusImovel.DISPONIVEL_VENDA : StatusImovel.DISPONIVEL_LOCACAO;
        
        IO.println("Insira a data de anúncio (ex. 01/01/2024):");
        String dataAnuncioInput = scan.nextLine();
        LocalDate dataAnuncio = LocalDate.parse(dataAnuncioInput, formatter);
        
        IO.println("Insira a data de finalização (pressione Enter para deixar em branco caso não tenha sido finalizado):");
        String dataFinalizacaoInput = scan.nextLine();
        LocalDate dataFinalizacao = dataFinalizacaoInput.isEmpty() ? null : LocalDate.parse(dataFinalizacaoInput, formatter);
        
        IO.println("Insira a quantidade de quartos:");
        Integer qtdQuartos = scan.nextInt();
        
        IO.println("Insira a quantidade de suítes:");
        Integer qtdSuites = scan.nextInt();
        
        IO.println("Insira a quantidade de salas de estar:");
        Integer qtdSalasEstar = scan.nextInt();
        
        IO.println("Insira a quantidade de salas de jantar:");
        Integer qtdSalasJantar = scan.nextInt();
        
        IO.println("Insira a quantidade de vagas na garagem:");
        Integer vagasGaragem = scan.nextInt();
        
        IO.println("Insira a área (em m²):");
        Double area = scan.nextDouble();
        
        IO.println("Possui armário embutido?");
        IO.println("1. Sim");
        IO.println("2. Não");
        IO.println("Escolha:");
        int opcaoArmario = scan.nextInt();
        Boolean possuiArmarioEmbutido = (opcaoArmario == 1);
        
        IO.println("Insira o andar do apartamento:");
        Integer andar = scan.nextInt();
        
        IO.println("Insira o valor do condomínio:");
        Double valorCondominio = scan.nextDouble();
        
        IO.println("Possui portaria 24hrs?");
        IO.println("1. Sim");
        IO.println("2. Não");
        IO.println("Escolha:");
        int opcaoPortaria = scan.nextInt();
        scan.nextLine();
        Boolean portaria24hrs = (opcaoPortaria == 1);
        
        IO.println("Insira uma descrição para o apartamento:");
        String descricao = scan.nextLine();

        Apartamento novoApartamento = new Apartamento(endereco, dataConstrucao, valorSugerido, statusImovel, dataAnuncio, 
                                 dataFinalizacao, qtdQuartos, qtdSuites, qtdSalasEstar, qtdSalasJantar, vagasGaragem, 
                                 area, possuiArmarioEmbutido, descricao, andar, valorCondominio, portaria24hrs);
        
        Main.imoveis.add(novoApartamento);
        IO.println("Apartamento cadastrado com sucesso!");
    }
    
    public void CadastrarSalaComercial() {
        Scanner scan = new Scanner(System.in);
        IO.println("-> Iniciando formulário de cadastro de Sala Comercial...");
        
        Endereco endereco = lerEndereco(scan);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        IO.println("========================");
        IO.println("Insira a data de construção (ex. 01/01/2000):");
        String dataConstrucaoInput = scan.nextLine();
        LocalDate dataConstrucao = LocalDate.parse(dataConstrucaoInput, formatter);
        
        IO.println("Insira o valor sugerido:");
        Double valorSugerido = scan.nextDouble();
        
        IO.println("Selecione o status do imóvel:");
        IO.println("1. Disponível para Venda");
        IO.println("2. Disponível para Locação");
        IO.println("Escolha:");
        int opcaoStatus = scan.nextInt();
        scan.nextLine();
        StatusImovel statusImovel = (opcaoStatus == 1) ? StatusImovel.DISPONIVEL_VENDA : StatusImovel.DISPONIVEL_LOCACAO;
        
        IO.println("Insira a data de anúncio (ex. 01/01/2024):");
        String dataAnuncioInput = scan.nextLine();
        LocalDate dataAnuncio = LocalDate.parse(dataAnuncioInput, formatter);
        
        IO.println("Insira a data de finalização (pressione Enter para deixar em branco caso não tenha sido finalizado):");
        String dataFinalizacaoInput = scan.nextLine();
        LocalDate dataFinalizacao = dataFinalizacaoInput.isEmpty() ? null : LocalDate.parse(dataFinalizacaoInput, formatter);
        
        IO.println("Insira a área (em m²):");
        Double area = scan.nextDouble();
        
        IO.println("Insira a quantidade de banheiros:");
        Integer qtdBanheiros = scan.nextInt();
        
        IO.println("Insira a quantidade de cômodos:");
        Integer qtdComodos = scan.nextInt();
        
        scan.nextLine();

        SalaComercial novaSala = new SalaComercial(endereco, dataConstrucao, valorSugerido, statusImovel, dataAnuncio, 
                                                   dataFinalizacao, area, qtdBanheiros, qtdComodos);
                                                   
        Main.imoveis.add(novaSala);
        IO.println("Sala Comercial cadastrada com sucesso!");
    }

    public void CadastrarTerreno() {
        Scanner scan = new Scanner(System.in);
        IO.println("-> Iniciando formulário de cadastro de Terreno...");
        
        Endereco endereco = lerEndereco(scan);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        IO.println("========================");
        
        IO.println("Insira o valor sugerido:");
        Double valorSugerido = scan.nextDouble();
        
        IO.println("Insira o valor real:");
        Double valorReal = scan.nextDouble();
        
        IO.println("Insira o valor da imobiliária:");
        Double valorImobiliaria = scan.nextDouble();
        
        IO.println("Selecione o status do imóvel:");
        IO.println("1. Disponível para Venda");
        IO.println("2. Disponível para Locação");
        IO.println("Escolha:");
        int opcaoStatus = scan.nextInt();
        scan.nextLine();
        StatusImovel statusImovel = (opcaoStatus == 1) ? StatusImovel.DISPONIVEL_VENDA : StatusImovel.DISPONIVEL_LOCACAO;
        
        IO.println("Insira a data de cadastro (ex. 01/01/2024):");
        String dataCadastroInput = scan.nextLine();
        LocalDate dataCadastro = LocalDate.parse(dataCadastroInput, formatter);
        
        IO.println("Insira a área (em m²):");
        Double area = scan.nextDouble();
        
        IO.println("Insira a largura (em metros):");
        Double largura = scan.nextDouble();
        
        IO.println("Insira o comprimento (em metros):");
        Double comprimento = scan.nextDouble();
        
        IO.println("O terreno possui aclive ou declive?");
        IO.println("1. Sim");
        IO.println("2. Não");
        IO.println("Escolha:");
        int opcaoAclive = scan.nextInt();
        scan.nextLine(); // Consome a quebra de linha
        Boolean acliveDeclive = (opcaoAclive == 1);

        Terreno novoTerreno = new Terreno(endereco, valorSugerido, valorReal, valorImobiliaria, statusImovel, dataCadastro, 
                                          area, largura, comprimento, acliveDeclive);
        
        Main.imoveis.add(novoTerreno);
        IO.println("Terreno cadastrado com sucesso!");
    }
}