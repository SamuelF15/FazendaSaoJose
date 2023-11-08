import java.util.Date;

public class Usuario extends Pessoa {
    private String NomeUser;
    private char[] SenhaUser = new char[12];

    public Usuario(String NomePessoa, int CPF, Date DataNasc, int Telefone, String EmailPessoa, String NomeUser, char[] SenhaUser) {
        super(NomePessoa, CPF, DataNasc, Telefone, EmailPessoa);
        this.NomeUser = NomeUser;
        this.SenhaUser = SenhaUser;
    }

    // Método getter para NomeUser
    public String getNomeUser() {
        return NomeUser;
    }
    

    // Método setter para NomeUser
    public void setNomeUser(String NomeUser) {
        this.NomeUser = NomeUser;
    }

    // Método getter para SenhaUser
    public char[] getSenhaUser() {
        return SenhaUser;
    }

    // Método setter para SenhaUser
    public void setSenhaUser(char[] SenhaUser) {
        this.SenhaUser = SenhaUser;
    }
}
