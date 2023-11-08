import java.util.Date;
public class Proprietario extends Usuario {
    private int IdProprietario;

    public Proprietario(String NomePessoa, int CPF, Date DataNasc, int Telefone, String EmailPessoa, String NomeUser, char[] SenhaUser, int IdProprietario) {
        super(NomePessoa, CPF, DataNasc, Telefone, EmailPessoa, NomeUser, SenhaUser);
        this.IdProprietario = IdProprietario;
    }

    // Método getter para IdProprietario
    public int getIdProprietario() {
        return IdProprietario;
    }

    // Método setter para IdProprietario
    public void setIdProprietario(int IdProprietario) {
        this.IdProprietario = IdProprietario;
    }
}