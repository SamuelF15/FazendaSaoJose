public class Usuario {
    private String NomeUser;
    private char[] SenhaUser = new char[12];

    public Usuario (){}

    
    public Usuario( String NomeUser, char[] SenhaUser) {
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
