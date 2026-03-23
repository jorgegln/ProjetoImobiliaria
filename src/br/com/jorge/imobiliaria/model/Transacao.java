package br.com.jorge.imobiliaria.model;

import br.com.jorge.imobiliaria.main.Main;

import java.time.LocalDate;

public abstract class Transacao {
    protected int nroContrato;
    protected Imovel imovel;
    protected LocalDate dataTransacao;
    protected ClienteUsuario cliente;
    protected Funcionario funcionario;
    protected FormaPagamento formaPagamento;
    protected Double valorReal;
    protected Double valorImobiliaria;
    protected Double valorComissaoFuncionario;
    private final double taxaComissaoFuncionario = 7.0;
    private final double taxaImobiliaria = 3.0;


    public Transacao(Imovel imovel, ClienteUsuario cliente, Funcionario funcionario, FormaPagamento formaPagamento, double valorReal) {
        this.nroContrato = Main.geradorContrato++;
        this.dataTransacao = LocalDate.now();
        this.imovel = imovel;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.formaPagamento = formaPagamento;
        this.valorReal = valorReal;
        this.imovel.setDataFinalizacao(this.dataTransacao);

        this.valorImobiliaria = valorReal * (taxaImobiliaria / 100);
        this.valorComissaoFuncionario = valorReal * (taxaComissaoFuncionario / 100);
        this.funcionario.adicionarComissao(this.valorComissaoFuncionario);

        Main.transacoes.add(this);

    }


    public int getNroContrato() {
        return nroContrato;
    }

    public void setNroContrato(int nroContrato) {
        this.nroContrato = nroContrato;
    }

    public LocalDate getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(LocalDate dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Double getValorComissaoFuncionario() {
        return valorComissaoFuncionario;
    }

    public void setValorComissaoFuncionario(Double valorComissaoFuncionario) {
        this.valorComissaoFuncionario = valorComissaoFuncionario;
    }
}
