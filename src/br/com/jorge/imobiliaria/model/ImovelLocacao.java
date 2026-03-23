package br.com.jorge.imobiliaria.model;

import br.com.jorge.imobiliaria.main.Main;

public class ImovelLocacao extends Transacao {
    public ImovelLocacao(Imovel imovel, ClienteUsuario cliente, Funcionario funcionario, FormaPagamento formaPagamento, double valorReal) {
        super(imovel, cliente, funcionario, formaPagamento, valorReal);
        this.imovel.setStatusImovel(StatusImovel.LOCADO);
        Main.transacoes.add(this);
        Main.imoveis.add(this.imovel);
    }
}
