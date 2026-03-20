import java.util.List;

public class Cliente extends Pessoa {

    protected String email;
    protected EstadoCivil estadoCivil;
    protected String profissao;

    public Cliente(String nome, String cpf, Endereco endereco, List<String> telefones, Sexo sexo, String email,
                   EstadoCivil estadoCivil, String profissao) {
        super(nome, cpf, endereco, telefones, sexo);
        this.email = email;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
