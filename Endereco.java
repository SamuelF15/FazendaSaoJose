import java.util.Date;

public class Endereco extends Funcionario {
    private String CEP;
    private String cidade;
    private String rua;
    private String bairro;
    private int numero;
    private String complemento;

    // Construtor de Endereco que utiliza o construtor de Funcionario e inicializa os atributos especificos de Endereco
    public Endereco(
            String NomePessoa, int CPF, Date DataNasc, int Telefone, String EmailPessoa,
            double salario, String cargo,
            String CEP, String cidade, String rua, String bairro, int numero, String complemento
    ) {
        super(NomePessoa, CPF, DataNasc, Telefone, EmailPessoa, salario, cargo);
        this.CEP = CEP;
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
