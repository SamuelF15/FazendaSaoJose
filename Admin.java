public class Admin extends Usuario {
    private int IdAdmin;

    public Admin( int IdAdmin) {
        super();
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