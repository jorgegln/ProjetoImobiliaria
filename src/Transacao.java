import java.time.LocalDate;

public class Transacao {
    private Integer nroContrato;
    private LocalDate dataTransacao;
    private FormaPagamento formaPagamento;
    private Double valorComissaoFuncionario;

    public Integer getNroContrato() {
        return nroContrato;
    }

    public void setNroContrato(Integer nroContrato) {
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
