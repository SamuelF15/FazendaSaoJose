
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validar {

	// validadores bases
	public static boolean validarNomesLetras(String NomePess) {
		String ValidarNomP = "^[A-Za-z]{1,85}$";
		Pattern compiladorNom = Pattern.compile(ValidarNomP);
		Matcher verificadorNom = compiladorNom.matcher(NomePess);
		if (verificadorNom.matches()) {
			System.out.println(" ");
			return true;
		} else {
			System.out.println(" ");
			return false;
		}
	}

	public static boolean validarSenha(String senha) {
		String ValidarSenha = "^[a-zA-Z0-9!@#$%^&*()-_=+\\[\\]{};:'\",<.>/?]{8,20}${8,20}";
		Pattern compiladorSenha = Pattern.compile(ValidarSenha);
		Matcher verificadorSenha = compiladorSenha.matcher(senha);
		if (verificadorSenha.matches()) {
			System.out.println(" ");
			return true;
		} else {
			System.out.println(" ");
			return false;
		}
	}

	public static boolean validarData(String Data) {
		String ValidarData = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|20\\d{2})$";

		Pattern compiladorData = Pattern.compile(ValidarData);
		Matcher verificadorData = compiladorData.matcher(Data);
		if (verificadorData.matches()) {
			System.out.println(" ");
			return true;
		} else {
			System.out.println(" ");
			return false;
		}

	}

	public static boolean validarTelefone(String Telefone) {
		String ValidarTel = "^[0-9]{11}";
		Pattern compiladorTel = Pattern.compile(ValidarTel);
		Matcher verificadorTel = compiladorTel.matcher(Telefone);

		if (verificadorTel.matches()) {
			System.out.println(" ");
			return true;
		} else {
			System.out.println(" ");
			return false;
		}
	}

	public static boolean isValidCep(String CEP) {
		// Verifica se o CEP corresponde ao formato "dd.ddd-ddd"
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
				return true;
			}
		    }
				System.out.println(" ");
		        return false;
	}

	public static boolean validarEmail(String Email) {
		String ValidarEmail = "^[A-Za-z0-9._-]+@(gmail\\.com|outlook\\.com|hotmail\\.com|live\\.com|uol\\.com\\.br|bol\\.com\\.br|yahoo\\.com|ymail\\.com|globomail\\.com)$";

		Pattern compiladorEmail = Pattern.compile(ValidarEmail);
		Matcher verificadorEmail = compiladorEmail.matcher(Email);
		if (verificadorEmail.matches()) {

			return true;
		} else {

			return false;
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