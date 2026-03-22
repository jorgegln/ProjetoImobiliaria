public class ImovelLocacao extends Transacao{
    public ImovelLocacao(Imovel imovel, ClienteUsuario cliente, Funcionario funcionario, FormaPagamento formaPagamento, double valorReal) {
        super(imovel, cliente, funcionario, formaPagamento, valorReal);
        this.imovel.setStatusImovel(StatusImovel.LOCADO);
    }
}
