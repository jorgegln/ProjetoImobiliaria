package br.com.jorge.imobiliaria.model;

// Requisito s
public abstract class FormaPagamento {
    protected double valorOriginal;

    public FormaPagamento(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public abstract double calcularValorFinal();
}
