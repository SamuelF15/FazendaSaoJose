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
        // Remove caracteres não numéricos do CPF
		this.CPF = CPF.replaceAll("[^0-9]", "");

		// Verifica se o CPF tem 11 dígitos
		if (CPF.length() != 11) {
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
		                        System.out.println("CPF Válido" + CPF);
                           }
		                   
		            
                    }
                }

            }
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