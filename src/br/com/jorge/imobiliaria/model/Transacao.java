package br.com.jorge.imobiliaria.model;

import br.com.jorge.imobiliaria.main.Main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Transacao {
    protected int nroContrato;
    protected Imovel imovel;
    protected LocalDate dataTransacao;
    protected ClienteUsuario cliente;
    protected Funcionario funcionario;
    protected FormaPagamento formaPagamento;
    protected Double valorReal;
    protected Double valorImobiliaria;
    protected Double valorComissaoFuncionario;
    private final double taxaComissaoFuncionario = 7.0;
    private final double taxaImobiliaria = 3.0;


    public Transacao(Imovel imovel, ClienteUsuario cliente, Funcionario funcionario, FormaPagamento formaPagamento, double valorReal) {
        this.nroContrato = Main.geradorContrato++;
        this.dataTransacao = LocalDate.now();
        this.imovel = imovel;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.formaPagamento = formaPagamento;
        this.valorReal = valorReal;
        this.imovel.setDataFinalizacao(this.dataTransacao);

        this.valorImobiliaria = valorReal * (taxaImobiliaria / 100);
        this.valorComissaoFuncionario = valorReal * (taxaComissaoFuncionario / 100);
        this.funcionario.adicionarComissao(this.valorComissaoFuncionario);

        Main.transacoes.add(this);

    }

    public static void realizarTransacao(Funcionario funcionarioLogado){
        Scanner scan = new Scanner(System.in);
        IO.println("-> Iniciando formulário para realizar Transação...");

        if (Main.imoveis.isEmpty() || Main.clientes.isEmpty()) {
            IO.println("É necessário ter pelo menos um imóvel e um cliente cadastrados para realizar uma transação!");
            return;
        }

        IO.println("Selecione o número do imóvel para a transação:");
        for (int i = 0; i < Main.imoveis.size(); i++) {
            IO.println((i + 1) + ". " + Main.imoveis.get(i).toString() + " - Status: " + Main.imoveis.get(i).getStatusImovel());
        }
        int indexImovel = scan.nextInt() - 1;

        if (indexImovel < 0 || indexImovel >= Main.imoveis.size()) {
            IO.println("Opção de imóvel inválida!");
            return;
        }
        Imovel imovelSelecionado = Main.imoveis.get(indexImovel);

        IO.println("Selecione o número do cliente:");
        for (int i = 0; i < Main.clientes.size(); i++) {
            IO.println((i + 1) + ". " + Main.clientes.get(i).toString());
        }
        int indexCliente = scan.nextInt() - 1;

        if (indexCliente < 0 || indexCliente >= Main.clientes.size()) {
            IO.println("Opção de cliente inválida!");
            return;
        }
        Cliente clienteSelecionado = Main.clientes.get(indexCliente);
        
        IO.println("Insira o valor real da transação:");
        Double valorReal = scan.nextDouble();

        IO.println("Forma de Pagamento:");
        IO.println("1. A Vista");
        IO.println("2. A Prazo");
        int opcaoPagamento = scan.nextInt();
        FormaPagamento formaPagamento = null;

        if (opcaoPagamento == 1) {
            IO.println("Selecione a moeda a vista:");
            System.out.printf("1. PIX%n2. TRANSFERENCIA%n3. DEBITO%n4. CREDITO_A_VISTA%n");
            int m = scan.nextInt();
            MoedaAVista moedaV = MoedaAVista.values()[m-1];
            formaPagamento = new PagamentoAvista(valorReal, moedaV, 10.0);
        } else if (opcaoPagamento == 2) {
            IO.println("Selecione a moeda a prazo:");
            System.out.printf("1. CONSORCIO%n2. FINANCIAMENTO%n3. MCMV%n4. CARTAO_CREDITO%n");
            int m = scan.nextInt();
            MoedaPrazo moedaP = MoedaPrazo.values()[m-1];
            IO.println("Insira a quantidade de parcelas:");
            int parcelas = scan.nextInt();
            formaPagamento = new PagamentoPrazo(valorReal, moedaP, parcelas, 5.0);
        } else {
            IO.println("Forma de pagamento inválida!");
            return;
        }

        // Criar transação baseado no status do imóvel
        if (imovelSelecionado.getStatusImovel() == StatusImovel.DISPONIVEL_VENDA) {
            ImovelVenda venda = new ImovelVenda(imovelSelecionado, (ClienteUsuario)clienteSelecionado, funcionarioLogado, formaPagamento, valorReal);
            IO.println("Transação de Venda finalizada com sucesso!");
        } else if (imovelSelecionado.getStatusImovel() == StatusImovel.DISPONIVEL_LOCACAO) {
            ImovelLocacao locacao = new ImovelLocacao(imovelSelecionado, (ClienteUsuario)clienteSelecionado, funcionarioLogado, formaPagamento, valorReal);
            IO.println("Transação de Locação finalizada com sucesso!");
        } else {
            IO.println("O imóvel selecionado já está Vendido ou Locado!");
        }
    }

    public int getNroContrato() {
        return nroContrato;
    }

    public void setNroContrato(int nroContrato) {
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
