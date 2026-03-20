import java.time.LocalDate;

public abstract class Imovel {
    protected Endereco endereco;
    protected LocalDate dataConstrucao;
    protected Double valorSugerido;
    protected Double valorReal;
    protected Double valorImobiliaria;
    protected StatusImovel statusImovel;
    protected LocalDate dataCadastro;

    public Imovel(Endereco endereco, LocalDate dataConstrucao, Double valorSugerido, Double valorReal, Double valorImobiliaria, StatusImovel statusImovel, LocalDate dataCadastro) {
        this.endereco = endereco;
        this.dataConstrucao = dataConstrucao;
        this.valorSugerido = valorSugerido;
        this.valorReal = valorReal;
        this.valorImobiliaria = valorImobiliaria;
        this.statusImovel = statusImovel;
        this.dataCadastro = dataCadastro;
    }

    public Imovel(Endereco endereco, Double valorSugerido, Double valorReal, Double valorImobiliaria, StatusImovel statusImovel, LocalDate dataCadastro) {
        this.endereco = endereco;
        this.valorSugerido = valorSugerido;
        this.valorReal = valorReal;
        this.valorImobiliaria = valorImobiliaria;
        this.statusImovel = statusImovel;
        this.dataCadastro = dataCadastro;
    }

    public Double getValorImobiliaria() {
        return valorImobiliaria;
    }

    public void setValorImobiliaria(Double valorImobiliaria) {
        this.valorImobiliaria = valorImobiliaria;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataConstrucao() {
        return dataConstrucao;
    }

    public void setDataConstrucao(LocalDate dataConstrucao) {
        this.dataConstrucao = dataConstrucao;
    }

    public Double getValorSugerido() {
        return valorSugerido;
    }

    public void setValorSugerido(Double valorSugerido) {
        this.valorSugerido = valorSugerido;
    }

    public Double getValorReal() {
        return valorReal;
    }

    public void setValorReal(Double valorReal) {
        this.valorReal = valorReal;
    }

    public StatusImovel getStatusImovel() {
        return statusImovel;
    }

    public void setStatusImovel(StatusImovel statusImovel) {
        this.statusImovel = statusImovel;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

}
