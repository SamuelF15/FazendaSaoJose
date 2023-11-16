import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pessoa extends Endereco {
    private String NomePessoa;
    private String CPF;
    private String DataNasc;
    private String Telefone;
    private String EmailPessoa;

    // Construtor
    public Pessoa(){}

    public Pessoa(String NomePessoa, String CPF, String DataNasc, String Telefone, String EmailPessoa) {
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

    public String getDataNasc() {
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
        String ValidarNomP = "[a-zA-Z ]+";
		Pattern compiladorNom = Pattern.compile(ValidarNomP);
		Matcher verificadorNom = compiladorNom.matcher(NomePessoa);
		if (verificadorNom.matches()) {
			System.out.println(" ");
			this.NomePessoa = NomePessoa;
            System.out.println("Nome válido: " + NomePessoa);
		} else {
			System.out.println(" ");
            System.out.println("Nome inválido: " + NomePessoa);
		}
    }

    public void setCPF(String CPF) {
        // Remove caracteres não numéricos do CPF
		this.CPF = CPF.replaceAll("[^0-9]", "");

		// Verifica se o CPF tem 11 dígitos
		if (CPF.length() != 11) {
            System.out.println(" ");
			System.out.println("CPF invalido: " + CPF);
		} else {
                // Calcula o primeiro dígito verificador
		        int soma = 0;
		        for (int i = 0; i < 9; i++) {
			    soma += Character.getNumericValue(CPF.charAt(i)) * (10 - i);
		        }
		        int primeiroDigito = 11 - (soma % 11);
		        if (primeiroDigito > 9) {
			      primeiroDigito = 0;
		        }
                else {
                    // Verifica o primeiro dígito verificador
		            if (Character.getNumericValue(CPF.charAt(9)) != primeiroDigito) {
                    System.out.println(" ");
			        System.out.println("CPF invalido" + CPF);
		            } 
                    else{ 
                        // Calcula o segundo dígito verificador
		                   soma = 0;
		                   for (int i = 0; i < 10; i++) {
			               soma += Character.getNumericValue( CPF.charAt(i)) * (11 - i);
		                   }
		                   int segundoDigito = 11 - (soma % 11);
		                   if (segundoDigito > 9) {
			               segundoDigito = 0;
		                   }

		                   // Verifica o segundo dígito verificador
		                   if (Character.getNumericValue( CPF.charAt(10)) != segundoDigito) {
			               System.out.println(" ");
			               System.out.println("CPF invalido" + CPF);
		                   } 
                           else {
                                System.out.println(" ");
                                 this.CPF = CPF;
                                 System.out.println(" ");
		                        System.out.println("CPF Válido" + CPF);
                           }
		                   
		            
                    }
                }

            }
    }

    public void setDataNasc(String DataNasc) {
        String ValidarData = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|20\\d{2})$";

		Pattern compiladorData = Pattern.compile(ValidarData);
		Matcher verificadorData = compiladorData.matcher(DataNasc);
		if (verificadorData.matches()) {
			System.out.println(" ");
			 this.DataNasc = DataNasc;
             System.out.println("Data de nascimento válida: " + DataNasc);

		} else {
			System.out.println(" ");
			System.out.println("Data  de nascimento inválida: " +  DataNasc);
            System.out.println(" ");
		}
    }

    public void setTelefone(String Telefone) {
        String ValidarTel = "^[0-9]{11}";
		Pattern compiladorTel = Pattern.compile(ValidarTel);
		Matcher verificadorTel = compiladorTel.matcher(Telefone);

		if (verificadorTel.matches()) {
			System.out.println(" ");
			 this.Telefone = Telefone;
             System.out.println("Telefone válido: " + Telefone);
             System.out.println(" ");
		} else {
			System.out.println(" ");
			System.out.println("Telefone inválido: " + Telefone);
            System.out.println(" ");
		}
    }

    public void setEmailPessoa(String EmailPessoa) {
        String ValidarEmail = "^[A-Za-z0-9._-]+@(gmail\\.com|outlook\\.com|hotmail\\.com|live\\.com|uol\\.com\\.br|bol\\.com\\.br|yahoo\\.com|ymail\\.com|globomail\\.com)$";

		Pattern compiladorEmail = Pattern.compile(ValidarEmail);
		Matcher verificadorEmail = compiladorEmail.matcher( EmailPessoa);
		if (verificadorEmail.matches()) {
			System.out.println(" ");
			 this.EmailPessoa = EmailPessoa;
             System.out.println("E-mail válido: " + EmailPessoa);
		} else {
			System.out.println(" ");
            System.out.println("E-mail inválido: " +  EmailPessoa);
		}
    }
}