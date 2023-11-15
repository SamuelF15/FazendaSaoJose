import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
    private String NomeUser;
    // private char[] SenhaUser = new char[12];
    private String SenhaUser;

    public Usuario (){}

    
    public Usuario( String NomeUser, String SenhaUser) {
        this.NomeUser = NomeUser;
        this.SenhaUser = SenhaUser;
    }

    // Método getter para NomeUser
    public String getNomeUser() {
        return NomeUser;
    }
    

    // Método setter para NomeUser
    public void setNomeUser(String NomeUser) {

        String ValidarNomP = "^[A-Za-z ]{1,85}$";
		Pattern compiladorNom = Pattern.compile(ValidarNomP);
		Matcher verificadorNom = compiladorNom.matcher(NomeUser);
		if (verificadorNom.matches()) {
			System.out.println(" ");
			this.NomeUser = NomeUser;
            System.out.println("Nome de usuario válido: " + NomeUser);
		} else {
			System.out.println(" ");
            System.out.println("Nome o usuário é inválido: " + NomeUser);
		}
    }

    // Método getter para SenhaUser
    public String getSenhaUser() {
        return SenhaUser;
    }

    // Método setter para SenhaUser
    // public void setSenhaUser( char [] SenhaUser) {
    //     this.SenhaUser = SenhaUser;
      
	// 	}
    public void setSenhaUser( String SenhaUser) {
        String ValidarSenha = "^[a-zA-Z0-9!@#$%^&*()-_=+\\[\\]{};:'\",<.>/?]{8,20}$";
		Pattern compiladorSenha = Pattern.compile(ValidarSenha);
		Matcher verificadorSenha = compiladorSenha.matcher(SenhaUser);
		if (verificadorSenha.matches()) {
			System.out.println(" ");
             this.SenhaUser = SenhaUser;
             System.out.println(" ");
             System.out.print("Senha válida: "+ SenhaUser );
             System.out.println(" ");
		} else {
			System.out.println(" ");
            // this.SenhaUser = "Senha invalida ";
			System.out.println("Senha invalida");
            System.out.println(" ");
		}
      
		}
    
                          
}
