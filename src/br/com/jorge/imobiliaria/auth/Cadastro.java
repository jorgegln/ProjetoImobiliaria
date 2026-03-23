package br.com.jorge.imobiliaria.auth;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import br.com.jorge.imobiliaria.model.Endereco;
import br.com.jorge.imobiliaria.model.Sexo;
import br.com.jorge.imobiliaria.model.UsuarioLogin;

public class Cadastro {
    public void CadastroFuncionario() {
        Scanner scan = new Scanner(System.in);

        System.out.println("-> Iniciando formulário de cadastro de usuário...");
        System.out.println("Insira seu nome completo:");
        String nome = scan.nextLine();
        System.out.println("Insira seu cpf:");
        String cpf = scan.nextLine();
        System.out.println("Selecione uma opção de sexo:");
        System.out.println("1. Masculino");
        System.out.println("2. Feminino");
        System.out.println("3. Outro");
        System.out.println("Escolha:");
        int opcaoSexo = scan.nextInt();
        switch (opcaoSexo) {
            case 1:
                Sexo sexo = new Sexo(sexo.MASCULINO);
                break;
            case 2:
                Sexo sexo = new Sexo(sexo.FEMININO);
                break;
            case 3:
                Sexo sexo = new Sexo(sexo.OUTRO);
                break;
            default:
                System.out.println("Opção inválida! Tente um número de 1 a 3.");
                break;
        }
        System.out.println("Insira seu telefone contato (ex: (xx)9xxxx-xxxx):");
        String telefone1 = scan.nextLine();
        System.out.println("Possui outro telefone:");
        System.out.println("1. Sim");
        System.out.println("2. Não");
        System.out.println("Escolha:");
        int opcaoTelefone = scan.nextInt();
        switch (opcaoTelefone) {
            case 1:
                System.out.println("Insira seu outro telefone:");
                String telefone2 = scan.nextLine();
                break;
            case 2:
                System.out.println("=ENDEREÇO=");
                System.out.println("Insira sua rua (ex: Rua/Av xxxxxx): ");
                String rua = scan.nextLine();
                System.out.println("Insira o número:");
                int numero = scan.nextInt();
                System.out.println("Insira o bairro:");
                String bairro = scan.nextLine();
                System.out.println("Insira a cidade:");
                String cidade = scan.nextLine();
                System.out.println("Insira o estado:");
                String estado = scan.nextLine();
                System.out.println("Insira o CEP:");
                String cep = scan.nextLine();
                Endereco enderecoNewUser = new Endereco(numero, rua, bairro, cidade, estado, cep);

                System.out.println("========================");
                System.out.println("Insira sua data de ingresso na empresa (ex. 01/01/2026):");
                String dataInput = scan.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dataIngresso = LocalDate.parse(dataInput, formatter);
                System.out.println("Insira seu cargo:");
                String cargo = scan.nextLine();
                System.out.println("Insira o salario:");
                Double salarioBase = scan.nextDouble();
                System.out.println("Agora, vamos criar o seu login...");
                System.out.println("Insira seu usuário:");
                String usuarioNewUser = scan.nextLine();
                System.out.println("Insira sua senha:");
                String senhaNewUser = scan.nextLine();
                UsuarioLogin loginNewUser = new UsuarioLogin(usuarioNewUser, senhaNewUser);

                System.out.println("Tudo certo! Seu cadastro foi completado com sucesso!");
        }

        scan.close();
    }
}
