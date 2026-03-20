import java.util.List;

public class ClienteUsuario extends Cliente {

    private List<Fiador> fiadores;
    private List<Indicacao> indicacoes;

    public ClienteUsuario(String nome, String cpf, Endereco endereco, List<String> telefones, Sexo sexo, String email,
                          EstadoCivil estadoCivil, String profissao, List<Fiador> fiadores, List<Indicacao> indicacoes) {
        super(nome, cpf, endereco, telefones, sexo, email, estadoCivil, profissao);
        this.fiadores = fiadores;
        this.indicacoes = indicacoes;
    }

    public List<Fiador> getFiadores() {
        return fiadores;
    }

    public void setFiadores(List<Fiador> fiadores) {
        this.fiadores = fiadores;
    }

    public List<Indicacao> getIndicacoes() {
        return indicacoes;
    }

    public void setIndicacoes(List<Indicacao> indicacoes) {
        this.indicacoes = indicacoes;
    }
}
