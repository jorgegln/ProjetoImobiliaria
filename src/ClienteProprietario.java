import java.util.ArrayList;
import java.util.List;

public class ClienteProprietario extends Cliente{
    private List<Imovel> meusImoveis = new ArrayList<>();

    public ClienteProprietario(String nome, String cpf, Endereco endereco, String email, String sexo, EstadoCivil estadocivil, String profissao) {
        super(nome, cpf, endereco, email, sexo, estadoCivil, profissao);
    }

    public void adicionarImovel(Imovel imovel) {
        this.meusImoveis.add(imovel);
    }

    public List<Imovel> getMeusImoveis() {
        return meusImoveis;
    }
}
