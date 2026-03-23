package br.com.jorge.imobiliaria.model;

import java.util.List;

public class Indicacao extends Pessoa {
    private String parentescoRelacao;
    public Indicacao(String nome, String cpf, Endereco endereco, List<String> telefones, Sexo sexo) {
        super(nome, cpf, endereco, telefones, sexo);
        this.parentescoRelacao = parentescoRelacao;
    }
    public String getParentescoRelacao() {
        return parentescoRelacao;
    }
    public void setParentescoRelacao(String parentescoRelacao) {
        this.parentescoRelacao = parentescoRelacao;
    }




}
