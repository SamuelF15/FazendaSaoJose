import java.util.Date;

public class Pessoa extends Endereco {
    private String NomePessoa;
    private String CPF;
    private Date DataNasc;
    private String Telefone;
    private String EmailPessoa;

    // Construtor
    public Pessoa(){}

    public Pessoa(String NomePessoa, String CPF, Date DataNasc, String Telefone, String EmailPessoa) {
        super();
        this.NomePessoa = NomePessoa;
        this.CPF = CPF;
        this.DataNasc = DataNasc;
        this.Telefone = Telefone;
        this.EmailPessoa = EmailPessoa;
    }

    // Métodos getter
    public String getNomePessoa() {
        return NomePessoa;
    }

    public String getCPF() {
        return CPF;
    }

    public Date getDataNasc() {
        return DataNasc;
    }

    public String getTelefone() {
        return Telefone;
    }

    public String getEmailPessoa() {
        return EmailPessoa;
    }

    // Métodos setter
    public void setNomePessoa(String NomePessoa) {
        this.NomePessoa = NomePessoa;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setDataNasc(Date DataNasc) {
        this.DataNasc = DataNasc;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public void setEmailPessoa(String EmailPessoa) {
        this.EmailPessoa = EmailPessoa;
    }
}