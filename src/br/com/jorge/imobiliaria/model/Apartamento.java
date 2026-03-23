package br.com.jorge.imobiliaria.model;

import java.time.LocalDate;

public class Apartamento extends Imovel {

    private Integer qtdQuartos;
    private Integer qtdSuites;
    private Integer qtdSalasEstar;
    private Integer qtdSalasJantar;
    private Integer vagasGaragem;
    private Double area;
    private Boolean possuiArmarioEmbutido;
    private String descricao;
    private Integer andar;
    private Double valorCondominio;
    private Boolean portaria24hrs;

    public Apartamento(Endereco endereco, LocalDate dataConstrucao, Double valorSugerido, StatusImovel statusImovel,
                       LocalDate dataAnuncio, LocalDate dataFinalizacao, Integer qtdQuartos, Integer qtdSuites,
                       Integer qtdSalasEstar, Integer qtdSalasJantar, Integer vagasGaragem, Double area,
                       Boolean possuiArmarioEmbutido, String descricao, Integer andar, Double valorCondominio, Boolean portaria24hrs) {
        super(endereco, dataConstrucao, valorSugerido, statusImovel, dataAnuncio, dataFinalizacao);
        this.qtdQuartos = qtdQuartos;
        this.qtdSuites = qtdSuites;
        this.qtdSalasEstar = qtdSalasEstar;
        this.qtdSalasJantar = qtdSalasJantar;
        this.vagasGaragem = vagasGaragem;
        this.area = area;
        this.possuiArmarioEmbutido = possuiArmarioEmbutido;
        this.descricao = descricao;
        this.andar = andar;
        this.valorCondominio = valorCondominio;
        this.portaria24hrs = portaria24hrs;
    }

    public Integer getQtdQuartos() {
        return qtdQuartos;
    }

    public void setQtdQuartos(Integer qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }

    public Integer getQtdSuites() {
        return qtdSuites;
    }

    public void setQtdSuites(Integer qtdSuites) {
        this.qtdSuites = qtdSuites;
    }

    public Integer getQtdSalasEstar() {
        return qtdSalasEstar;
    }

    public void setQtdSalasEstar(Integer qtdSalasEstar) {
        this.qtdSalasEstar = qtdSalasEstar;
    }

    public Integer getQtdSalasJantar() {
        return qtdSalasJantar;
    }

    public void setQtdSalasJantar(Integer qtdSalasJantar) {
        this.qtdSalasJantar = qtdSalasJantar;
    }

    public Integer getVagasGaragem() {
        return vagasGaragem;
    }

    public void setVagasGaragem(Integer vagasGaragem) {
        this.vagasGaragem = vagasGaragem;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Boolean getPossuiArmarioEmbutido() {
        return possuiArmarioEmbutido;
    }

    public void setPossuiArmarioEmbutido(Boolean possuiArmarioEmbutido) {
        this.possuiArmarioEmbutido = possuiArmarioEmbutido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }

    public Double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(Double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    public Boolean getPortaria24hrs() {
        return portaria24hrs;
    }

    public void setPortaria24hrs(Boolean portaria24hrs) {
        this.portaria24hrs = portaria24hrs;
    }
}