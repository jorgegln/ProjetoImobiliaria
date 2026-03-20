import java.time.LocalDate;

public class Terreno extends Imovel {

    private Double area;
    private Double largura;
    private Double comprimento;
    private Boolean acliveDeclive;

    public Terreno(Endereco endereco, Double valorSugerido, Double valorReal, Double valorImobiliaria, StatusImovel statusImovel,
                   LocalDate dataCadastro, Double area, Double largura, Double comprimento, Boolean acliveDeclive) {
        super(endereco, valorSugerido, valorReal, valorImobiliaria, statusImovel, dataCadastro);
        this.area = area;
        this.largura = largura;
        this.comprimento = comprimento;
        this.acliveDeclive = acliveDeclive;
    }
}
