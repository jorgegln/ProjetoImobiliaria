public abstract class FormaPagamento {

    protected Double valorTotal;

    public FormaPagamento(Double valorTotal, String tipoPagamento) {
        this.valorTotal = valorTotal;
        switch (tipoPagamento) {
            case "A vista":

        }
    }
}
