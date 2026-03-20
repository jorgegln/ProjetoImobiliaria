import java.time.LocalDate;

public class Casa extends Imovel {

    private Integer qtdQuartos;
    private Integer qtdSuites;
    private Integer qtdSalasEstar;
    private Integer qtdSalasJantar;
    private Integer vagasGaragem;
    private Double area;
    private Boolean possuiArmarioEmbutido;
    private String descricao;

    public Casa(Endereco endereco, LocalDate dataConstrucao, Double valorSugerido, Double valorReal, Double valorImobiliaria,
                StatusImovel statusImovel, LocalDate dataCadastro, Integer qtdQuartos, Integer qtdSuites, Integer qtdSalasEstar,
                Integer qtdSalasJantar, Integer vagasGaragem, Double area, Boolean possuiArmarioEmbutido, String descricao) {
        super(endereco, dataConstrucao, valorSugerido, valorReal, valorImobiliaria, statusImovel, dataCadastro);
        this.qtdQuartos = qtdQuartos;
        this.qtdSuites = qtdSuites;
        this.qtdSalasEstar = qtdSalasEstar;
        this.qtdSalasJantar = qtdSalasJantar;
        this.vagasGaragem = vagasGaragem;
        this.area = area;
        this.possuiArmarioEmbutido = possuiArmarioEmbutido;
        this.descricao = descricao;
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
}
