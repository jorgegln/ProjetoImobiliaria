import java.time.LocalDate;

public class SalaComercial extends Imovel {

    private Double area;
    private Integer qtdBanheiros;
    private Integer qtdComodos;

    public SalaComercial(Endereco endereco, LocalDate dataConstrucao, Double valorSugerido, Double valorReal,
                         Double valorImobiliaria, StatusImovel statusImovel, LocalDate dataCadastro, Double area,
                         Integer qtdBanheiros, Integer qtdComodos) {
        super (endereco, dataConstrucao, dataAnuncio, valorSugerido,statusImovel);
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
