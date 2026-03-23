package br.com.jorge.imobiliaria.model;

import java.util.List;
// Requisito o

public class Fiador extends Pessoa {
    private Double rendaComprovada;

    public Fiador(String nome, String cpf, Endereco endereco, List<String> telefones, Sexo sexo, Double rendaComprovada) {
        super(nome, cpf, endereco, telefones, sexo);
        this.rendaComprovada = rendaComprovada;
    }

    public Double getRendaComprovada() {
        return rendaComprovada;
    }

}
