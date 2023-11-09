package Validacoes;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validar {
	// validando Nome da pessoa
	public static boolean validarNomesLetras(String NomePess) {
		String ValidarNomP = "^[A-Za-z]{85}";
		Pattern compiladorNom = Pattern.compile(ValidarNomP);
		Matcher verificadorNom = compiladorNom.matcher(NomePess);
		if (verificadorNom.matches()) {
			System.out.println("Nome válido!!");
			return true;
		} else {
			System.out.println("Nome inválido!!");
			return false;
		}
	}

	// validando CPF
	public class ValidadorCPF {

		public static void main(String[] args) {
			String cpf = "12345678909"; // Substitua isso pelo CPF que você quer validar
			if (validarCPF(cpf)) {
				System.out.println("CPF válido");
			} else {
				System.out.println("CPF inválido");
			}
		}
	
		public static boolean validarCPF(String cpf) {
			// Remove caracteres não numéricos do CPF
			cpf = cpf.replaceAll("[^0-9]", "");
	
			// Verifica se o CPF tem 11 dígitos
			if (cpf.length() != 11) {
				return false;
			}
	
			// Calcula o primeiro dígito verificador
			int soma = 0;
			for (int i = 0; i < 9; i++) {
				soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
			}
			int primeiroDigito = 11 - (soma % 11);
			if (primeiroDigito > 9) {
				primeiroDigito = 0;
			}
	
			// Verifica o primeiro dígito verificador
			if (Character.getNumericValue(cpf.charAt(9)) != primeiroDigito) {
				return false;
			}
	
			// Calcula o segundo dígito verificador
			soma = 0;
			for (int i = 0; i < 10; i++) {
				soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
			}
			int segundoDigito = 11 - (soma % 11);
			if (segundoDigito > 9) {
				segundoDigito = 0;
			}
	
			// Verifica o segundo dígito verificador
			if (Character.getNumericValue(cpf.charAt(10)) != segundoDigito) {
				return false;
			}
	
			// Se chegou até aqui, o CPF é válido
			return true;
		}
		}

	// validando Data
	public static boolean validarData(String Data) {
		String ValidarData = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|20\\d{2})$";

		Pattern compiladorData = Pattern.compile(ValidarData);
		Matcher verificadorData = compiladorData.matcher(Data);
		if (verificadorData.matches()) {
			System.out.println("E-mail válido!!");
			return true;
		} else {
			System.out.println("E-mail inválido!!");
			return false;
		}

	}

	// validando Telefone
	public static boolean validarTelefone(String Telefone) {
		String ValidarTel = "^[0-9]{11}";
		Pattern compiladorTel = Pattern.compile(ValidarTel);
		Matcher verificadorTel = compiladorTel.matcher(Telefone);

		if (verificadorTel.matches()) {
			System.out.println("Telefone válido!!");
			return true;
		} else {
			System.out.println("Telefone inválido!!");
			return false;
		}
	}

	// validando Email
	public static boolean validarEmail(String Email) {
		String ValidarEmail = "^[A-Za-z0-9._-]+@(gmail\\.com|outlook\\.com|hotmail\\.com|live\\.com|uol\\.com\\.br|bol\\.com\\.br|yahoo\\.com|ymail\\.com|globomail\\.com)$";

		Pattern compiladorEmail = Pattern.compile(ValidarEmail);
		Matcher verificadorEmail = compiladorEmail.matcher(Email);
		if (verificadorEmail.matches()) {
			System.out.println("E-mail válido!!");
			return true;
		} else {
			System.out.println("E-mail inválido!!");
			return false;
		}
	}
	public class CEP {
        public static boolean ViaCEPClient(String CEP){
          ViaCEPClient client = new ViaCEPClient();
            ViaCEPEndereco endereco = client.getEndereco("35170-056");
                 System.out.println(endereco.getLocalidade());
                endereco = client.getEndereco("35170056");
                System.out.println(endereco.getLocalidade());
    }
}
}

// private String cidade;
// private String rua;
// private String bairro;
// private int numero;
// private String complemento;