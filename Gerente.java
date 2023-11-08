import java.util.Date;

public class Gerente extends Usuario {
    private int IdGerente;

    public Gerente(String NomePessoa, int CPF, Date DataNasc, int Telefone, String EmailPessoa, String NomeUser, char[] SenhaUser, int IdGerente) {
        super(NomePessoa, CPF, DataNasc, Telefone, EmailPessoa, NomeUser, SenhaUser);
        this.IdGerente = IdGerente;
    }

    // Método getter para IdGerente
    public int getIdGerente() {
        return IdGerente;
    }

    // Método setter para IdGerente
    public void setIdGerente(int IdGerente) {
        this.IdGerente = IdGerente;
    }
}







