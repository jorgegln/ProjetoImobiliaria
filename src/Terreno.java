import java.time.LocalDate;

public class Terreno extends Imovel {

    private Double area;
    private Double largura;
    private Double comprimento;
    private Boolean acliveDeclive;

    public Terreno(Endereco endereco, Double valorSugerido, Double valorReal, Double valorImobiliaria, StatusImovel statusImovel,
                   LocalDate dataCadastro, Double area, Double largura, Double comprimento, Boolean acliveDeclive) {
        super(endereco, valorSugerido, valorReal, valorImobiliaria, statusImovel, dataCadastro);
        this.area = area;
        this.largura = largura;
        this.comprimento = comprimento;
        this.acliveDeclive = acliveDeclive;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Boolean getAcliveDeclive() {
        return acliveDeclive;
    }

    public void setAcliveDeclive(Boolean acliveDeclive) {
        this.acliveDeclive = acliveDeclive;
    }
}
