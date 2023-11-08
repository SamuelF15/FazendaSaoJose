import java.util.Date;

public class Admin extends Usuario {
    private int IdAdmin;

    public Admin(String NomePessoa, int CPF, Date DataNasc, int Telefone, String EmailPessoa, String NomeUser, char[] SenhaUser, int IdAdmin) {
        super(NomePessoa, CPF, DataNasc, Telefone, EmailPessoa, NomeUser, SenhaUser);
        this.IdAdmin = IdAdmin;
    }

    // Método getter para IdAdmin
    public int getIdAdmin() {
        return IdAdmin;
    }

    // Método setter para IdAdmin
    public void setIdAdmin(int IdAdmin) {
        this.IdAdmin = IdAdmin;
    }
}
