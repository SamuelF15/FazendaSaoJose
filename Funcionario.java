import java.util.Date;

public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;

    // Construtor de Funcionario que utiliza o construtor de Pessoa e inicializa os atributos específicos de Funcionario
    public Funcionario(String NomePessoa, int CPF, Date DataNasc, int Telefone, String EmailPessoa, double salario, String cargo) {
        super(NomePessoa, CPF, DataNasc, Telefone, EmailPessoa);
        this.salario = salario;
        this.cargo = cargo;
    }

    // Métodos getter e setter específicos para Funcionario
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}