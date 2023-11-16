import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Endereco {

    private String CEP;
    private String cidade;
    private String rua;
    private String bairro;
    private String numero;
    private String complemento;

    // Construtor de Endereco que utiliza o construtor de Funcionario e inicializa
    // os atributos especificos de Endereco
    public Endereco() {
    }

    public Endereco(String CEP, String cidade, String rua, String bairro, String numero, String complemento) {
        this.CEP = CEP;
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        if (CEP.matches("\\d{5}-\\d{3}")) {
			// Extrai os dígitos do CEP
			String[] parts = CEP.split("-");
			String digit1 = parts[0];
			String digit2 = parts[1];

			// Verifica as regras oficiais de CEP
			int d1 = Integer.parseInt(digit1);
			int d2 = Integer.parseInt(digit2);

			if (d1 >= 10000 && d1 <= 99999 && d2 >= 100 && d2 <= 999) {
				System.out.println(" ");
				this.CEP = CEP;
                System.out.println("CEP válido: "+ CEP);
                System.out.println(" ");
			}else{
                System.out.println(" ");
		         System.out.println("CEP invalido: "+ CEP);
            }
		    }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String ValidarNomP = "[a-zA-Z ]+";
		Pattern compiladorNom = Pattern.compile(ValidarNomP);
		Matcher verificadorNom = compiladorNom.matcher(cidade);
		if (verificadorNom.matches()) {
			System.out.println(" ");
			 this.cidade = cidade;
            System.out.println("Cidade válida: " + cidade);
		} else {
			System.out.println(" ");
            System.out.println("Cidade inválida: " + cidade);
		}
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
         String ValidarNomP = "[a-zA-Z ]+";
		Pattern compiladorNom = Pattern.compile(ValidarNomP);
		Matcher verificadorNom = compiladorNom.matcher(rua);
		if (verificadorNom.matches()) {
			System.out.println(" ");
			this.rua = rua;
            System.out.println("Rua válida: " + rua);
		} else {
			System.out.println(" ");
            System.out.println("Rua inválida: " + rua);
		}
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String ValidarNomP = "[a-zA-Z ]+";
		Pattern compiladorNom = Pattern.compile(ValidarNomP);
		Matcher verificadorNom = compiladorNom.matcher(bairro);
		if (verificadorNom.matches()) {
			System.out.println(" ");
			this.bairro = bairro;
            System.out.println("Bairro válido: " + bairro);
		} else {
			System.out.println(" ");
            System.out.println("Bairro inválido: " + bairro);
		}
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        String ValidarInt = "^[1-9][0-9]{0,9}$";
		Pattern CompiladorInt =  Pattern.compile(ValidarInt);
		Matcher VerificadorInt = CompiladorInt.matcher(numero);
		if (VerificadorInt.matches()){
			System.out.println(" ");
			this.numero = numero;
            System.out.println("Número válido: " + numero);
            System.out.println(" ");
		}else{
			System.out.println(" ");
            System.out.println("Número inválido: " + numero);
            System.out.println(" ");
		}
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
         String ValidarNomP = "[a-zA-Z ]+";
		Pattern compiladorNom = Pattern.compile(ValidarNomP);
		Matcher verificadorNom = compiladorNom.matcher(complemento);
		if (verificadorNom.matches()) {
			System.out.println(" ");
			this.complemento = complemento;
            System.out.println("Complemento válido: " + complemento);
		} else {
			System.out.println(" ");
            System.out.println("Complemento inválido: " + complemento);
		}
    }
}