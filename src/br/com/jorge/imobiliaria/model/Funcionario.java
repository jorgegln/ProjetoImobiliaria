package br.com.jorge.imobiliaria.model;

import java.time.LocalDate;
import java.util.List;
import br.com.jorge.imobiliaria.main.Main;
// Requisito r
public class Funcionario extends Pessoa {

    private LocalDate dataIngresso;
    private String cargo;
    private Double salarioBase;
    private UsuarioLogin usuarioLogin;
    private double comissoesAcumuladas = 0.0;

    public Funcionario(String nome, String cpf, Endereco endereco, List<String> telefones, Sexo sexo, LocalDate dataIngresso,
                       String cargo, Double salarioBase, UsuarioLogin usuarioLogin) {
        super(nome, cpf, endereco, telefones, sexo);
        this.dataIngresso = dataIngresso;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.usuarioLogin = usuarioLogin;
    }
    // Requisito r
    public void adicionarComissao(double valor) {
        this.comissoesAcumuladas += valor;
    }

    public double calcularSalario(double totalComissoes) {
        return this.salarioBase + this.comissoesAcumuladas;
    }

    //Usar quando as comissões do mês anterior tiverem sido pagas
    public void zerarComissoesMes() {
        this.comissoesAcumuladas = 0.0;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getUsuario() {
        return this.usuarioLogin.getUsuario();
    }

    public void setUsuario(String usuario) {
        if (Main.usuarios.contains(usuario)) {
            System.out.println("Usuário já existe.");
        } else {
            this.usuarioLogin.setUsuario(usuario);
            UsuarioLogin novoLogin = new UsuarioLogin(usuario, this.usuarioLogin.getSenha());
            Main.usuarios.remove(this.usuarioLogin);
            Main.usuarios.add(novoLogin);
        }
    }

    public String getSenha() {
        return this.usuarioLogin.getSenha();
    }

    public void setSenha(String senha) {
        this.usuarioLogin.setSenha(senha);
        UsuarioLogin novoLogin = new UsuarioLogin(this.usuarioLogin.getUsuario(), senha);
        Main.usuarios.remove(this.usuarioLogin);
        Main.usuarios.add(novoLogin);
    }
}
