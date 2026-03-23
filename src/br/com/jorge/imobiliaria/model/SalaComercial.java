package br.com.jorge.imobiliaria.model;

import java.time.LocalDate;

public class SalaComercial extends Imovel {

    private Double area;
    private Integer qtdBanheiros;
    private Integer qtdComodos;

    public SalaComercial(Endereco endereco, LocalDate dataConstrucao, Double valorSugerido, StatusImovel statusImovel,
                         LocalDate dataAnuncio, LocalDate dataFinalizacao, Double area, Integer qtdBanheiros, Integer qtdComodos) {
        super(endereco, dataConstrucao, valorSugerido, statusImovel, dataAnuncio, dataFinalizacao);
        this.area = area;
        this.qtdBanheiros = qtdBanheiros;
        this.qtdComodos = qtdComodos;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Integer getQtdBanheiros() {
        return qtdBanheiros;
    }

    public void setQtdBanheiros(Integer qtdBanheiros) {
        this.qtdBanheiros = qtdBanheiros;
    }

    public Integer getQtdComodos() {
        return qtdComodos;
    }

    public void setQtdComodos(Integer qtdComodos) {
        this.qtdComodos = qtdComodos;
    }
}
