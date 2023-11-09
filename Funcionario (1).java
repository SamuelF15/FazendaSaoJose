public class Funcionario extends Pessoa {
    private double salario;
    private double valorKgColhido;
    private double valorAlqueireKg;
    private double valorAlqueireReal;
    private String nomeUser; 

    public Funcionario() {
    }

    public Funcionario(double salario) {
        super();
        this.salario = salario;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    
    public void realizarPagamento(double kgPanhado) {
        double totalKg = kgPanhado; 
        double totalAlqueire = totalKg / valorAlqueireKg;
        double totalReais = totalAlqueire * valorAlqueireReal;
        System.out.println("Nome funcionário: " + getNomeUser());
        System.out.println("Total kg colhido: " + totalKg);
        System.out.println("Total alqueire: " + totalAlqueire);
        System.out.println("Total reais: " + totalReais);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorKgColhido() {
        return valorKgColhido;
    }

    public void setValorKgColhido(double valorKgColhido) {
        this.valorKgColhido = valorKgColhido;
    }

    public double getValorAlqueireKg() {
        return valorAlqueireKg;
    }

    public void setValorAlqueireKg(double valorAlqueireKg) {
        this.valorAlqueireKg = valorAlqueireKg;
    }

    public double getValorAlqueireReal() {
        return valorAlqueireReal;
    }

    public void setValorAlqueireReal(double valorAlqueireReal) {
        this.valorAlqueireReal = valorAlqueireReal;
    }
}
