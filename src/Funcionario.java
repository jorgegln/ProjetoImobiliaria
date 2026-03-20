import java.time.LocalDate;
import java.util.List;

public class Funcionario extends Pessoa {

    private LocalDate dataIngresso;
    private String cargo;
    private Double salarioBase;
    private String usuario;
    private String senha;

    public Funcionario(String nome, String cpf, Endereco endereco, List<String> telefones, Sexo sexo, LocalDate dataIngresso, String cargo, Double salarioBase, String usuario, String senha) {
        super(nome, cpf, endereco, telefones, sexo);
        this.dataIngresso = dataIngresso;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.usuario = usuario;
        this.senha = senha;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
