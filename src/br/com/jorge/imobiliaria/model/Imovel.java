package br.com.jorge.imobiliaria.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Requisitos (a, b, c, i, j, l, p)
public abstract class Imovel {
    protected Endereco endereco;
    protected LocalDate dataConstrucao;
    protected LocalDate dataAnuncio;
    protected LocalDate dataFinalizacao;
    protected Double valorSugerido;
    protected StatusImovel statusImovel;
    protected List<ClienteProprietario> proprietarios = new ArrayList<>();

    public Imovel(Endereco endereco, LocalDate dataConstrucao , Double valorSugerido, StatusImovel statusImovel,
                  LocalDate dataAnuncio, LocalDate dataFinalizacao ) {
        this.endereco = endereco;
        this.dataConstrucao = dataConstrucao;
        this.valorSugerido = valorSugerido;
        this.statusImovel = statusImovel;
        this.dataAnuncio = dataAnuncio;
        this.dataFinalizacao = dataFinalizacao;

    }

    public Imovel(Endereco endereco, Double valorSugerido, Double valorReal, Double valorImobiliaria, StatusImovel statusImovel,
                  LocalDate dataCadastro) {
        this.endereco = endereco;
        this.valorSugerido = valorSugerido;
        this.statusImovel = statusImovel;

    }

    public void adicionarProprietario(ClienteProprietario proprietario) {
        if (!this.proprietarios.contains(proprietario)) {
            this.proprietarios.add(proprietario);
            proprietario.adicionarImovel(this);
        }
}

    public Endereco getEndereco(Endereco endereco) {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataConstrucao(LocalDate dataConstrucao) {
        return dataConstrucao;
    }

    public void setDataConstrucao(LocalDate dataConstrucao) {
        this.dataConstrucao = dataConstrucao;
    }

    public LocalDate getDataAnuncio() {
        return dataAnuncio;
    }

    public void setDataAnuncio(LocalDate dataAnuncio) {
        this.dataAnuncio = dataAnuncio;
    }

    public LocalDate getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(LocalDate dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }

    public Double getValorSugerido() {
        return valorSugerido;
    }

    public void setValorSugerido(Double valorSugerido) {
        this.valorSugerido = valorSugerido;
    }

    public StatusImovel getStatusImovel() {
        return statusImovel;
    }

    public void setStatusImovel(StatusImovel statusImovel) {
        this.statusImovel = statusImovel;
    }
}
