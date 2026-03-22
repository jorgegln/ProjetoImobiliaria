public class PagamentoAvista extends FormaPagamento{
        private MoedaAVista moeda;
        private double desconto;

        public PagamentoAvista(double valorOriginal, MoedaAVista moeda, double desconto) {
            super(valorOriginal);
            this.moeda = moeda;
            this.desconto = 10.0;
        }
    @Override
    public double calcularValorFinal() {
        return this.valorOriginal - this.valorOriginal * this.desconto/100;
    }
    public MoedaAVista getMoeda() {
            return moeda; }
}

