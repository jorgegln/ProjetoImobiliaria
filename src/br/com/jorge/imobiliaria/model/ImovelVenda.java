package br.com.jorge.imobiliaria.model;

public class ImovelVenda extends Transacao{
    public ImovelVenda(Imovel imovel, ClienteUsuario cliente, Funcionario funcionario, FormaPagamento formaPagamento, double valorReal) {
        super(imovel, cliente, funcionario, formaPagamento, valorReal);
        this.imovel.setStatusImovel(StatusImovel.VENDIDO);
    }
}
