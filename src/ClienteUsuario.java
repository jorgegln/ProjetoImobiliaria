import java.util.ArrayList;
import java.util.List;

// Requisito o
public class ClienteUsuario extends Cliente {

    private List<Fiador> fiadores = new ArrayList<>();
    private List<Indicacao> indicacoes = new ArrayList<>();

    public ClienteUsuario(String nome, String cpf, Endereco endereco, List<String> telefones, Sexo sexo, String email,
                          EstadoCivil estadoCivil, String profissao, List<Fiador> fiadores, List<Indicacao> indicacoes) {
        super(nome, cpf, endereco, telefones, sexo, email, estadoCivil, profissao);
        this.fiadores = new ArrayList<>();
        this.indicacoes = new ArrayList<>();
    }
    public void adicionarFiador(Fiador fiador) {
        this.fiadores.add(fiador);
    }

    public void adicionarIndicacao(Indicacao indicacao) {
        this.indicacoes.add(indicacao);
    }
    public boolean requisitoLocacao() {
        return fiadores.size() >= 1 && indicacoes.size() >= 2;
    }
    public void setEmail(String email) { this.email = email; }
    public void setProfissao(String profissao) { this.profissao = profissao; }
    public void setEstadoCivil(EstadoCivil estadoCivil) { this.estadoCivil = estadoCivil; }

    public List<Fiador> getFiadores() {
        return fiadores;
    }

    public List<Indicacao> getIndicacoes() {
        return indicacoes;
    }

}
