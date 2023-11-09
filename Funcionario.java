

public class Funcionario extends Pessoa {
    private double salario;
  

    // Construtor de Funcionario que utiliza o construtor de Pessoa e inicializa os atributos específicos de Funcionario
    
    public Funcionario (){}

    public Funcionario( double salario) {
        super();
        this.salario = salario;
       
    }

    // Métodos getter e setter específicos para Funcionario
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}