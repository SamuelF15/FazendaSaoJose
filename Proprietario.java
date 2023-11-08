
public class Proprietario extends Usuario {
    private int IdProprietario;

    public Proprietario(int IdProprietario) {
        super();
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