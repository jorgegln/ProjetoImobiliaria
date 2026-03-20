public class FormaPagamento {

    private Double valorTotal;
    private Double juros;
    private Integer parcelas;
    private Double desconto;
    private Double valorFinal;

    public FormaPagamento(Double valorTotal, Double desconto) {
        this.valorTotal = valorTotal;
        this.desconto = desconto;

        this.valorFinal = valorTotal * (1 - desconto);
    }
    public FormaPagamento(Double valorTotal, Double juros, Integer parcelas) {
        this.valorTotal = valorTotal;
        this.juros = juros;
        this.parcelas = parcelas;

        this.valorFinal = valorTotal * Math.pow(juros, parcelas);
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }
}
