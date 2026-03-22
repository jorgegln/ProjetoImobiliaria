import java.util.ArrayList;
import java.util.List;

public class ClienteProprietario extends Cliente {
    private List<Imovel> meusImoveis = new ArrayList<>();

    public ClienteProprietario(String nome, String cpf, Endereco endereco, List<String> telefones, Sexo sexo, String email, EstadoCivil estadoCivil, String profissao) {
        super(nome, cpf, endereco, telefones, sexo, email, estadoCivil, profissao);
    }

    public void adicionarImovel(Imovel imovel) {
        this.meusImoveis.add(imovel);
        if (!this.meusImoveis.contains(imovel)) {
            this.meusImoveis.add(imovel);
            imovel.adicionarProprietario(this);
        }
    }

    public List<Imovel> getMeusImoveis() {
        return meusImoveis;
    }
}
