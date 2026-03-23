package br.com.jorge.imobiliaria.model;

public class PagamentoPrazo extends FormaPagamento{
    private MoedaPrazo moeda;
    private int qtdParcelas;
    private double juros;

    public PagamentoPrazo(double valorOriginal, MoedaPrazo moeda, int qtdParcelas, double juros) {
        super(valorOriginal);
        this.moeda = moeda;
        this.qtdParcelas = qtdParcelas;
        this.juros = 5.0;
    }

    @Override
    public double calcularValorFinal() {
        return this.valorOriginal + this.valorOriginal * this.juros/100;
    }
    public MoedaPrazo getMoeda() {
        return moeda;
    }
    public int getQuantidadeParcelas() {
        return qtdParcelas;
    }

}
