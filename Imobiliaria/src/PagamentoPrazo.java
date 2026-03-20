public class PagamentoPrazo extends FormaPagamento {
    private Integer parcelas;
    private Double juros;
    private MoedaPrazo tipoMoeda;

    public PagamentoPrazo(Double valorTotal, String tipoPagamento, Integer parcelas, Double juros, MoedaPrazo tipoMoeda) {
        super(valorTotal, tipoPagamento);
        this.parcelas = parcelas;
        this.juros = juros;
        this.tipoMoeda = tipoMoeda;
    }
}
