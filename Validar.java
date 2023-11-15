
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validar {
	// public static boolean validarCPF(String cpf) {
	// 	// Remove caracteres não numéricos do CPF
	// 	cpf = cpf.replaceAll("[^0-9]", "");

	// 	// Verifica se o CPF tem 11 dígitos
	// 	if (cpf.length() != 11) {
	// 		return false;
	// 	}

	// 	// Calcula o primeiro dígito verificador
	// 	int soma = 0;
	// 	for (int i = 0; i < 9; i++) {
	// 		soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
	// 	}
	// 	int primeiroDigito = 11 - (soma % 11);
	// 	if (primeiroDigito > 9) {
	// 		primeiroDigito = 0;
	// 	}

	// 	// Verifica o primeiro dígito verificador
	// 	if (Character.getNumericValue(cpf.charAt(9)) != primeiroDigito) {
	// 		return false;
	// 	}

	// 	// Calcula o segundo dígito verificador
	// 	soma = 0;
	// 	for (int i = 0; i < 10; i++) {
	// 		soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
	// 	}
	// 	int segundoDigito = 11 - (soma % 11);
	// 	if (segundoDigito > 9) {
	// 		segundoDigito = 0;
	// 	}

	// 	// Verifica o segundo dígito verificador
	// 	if (Character.getNumericValue(cpf.charAt(10)) != segundoDigito) {
	// 		System.out.println(" ");
	// 		return false;
	// 	}
	// 	// Se chegou até aqui, o CPF é válido
	// 	System.out.println(" ");
	// 	return true;
	// }
	public static boolean validarCEP(String CEP) {
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
	public static boolean validarNumCasa(String numero){
		String ValidarInt = "^[1-9][0-9]{0,9}$";
		Pattern CompiladorInt =  Pattern.compile(ValidarInt);
		Matcher VerificadorInt = CompiladorInt.matcher(numero);
		if (VerificadorInt.matches()){
			System.out.println(" ");
			return true;
		}else{
			System.out.println(" ");
			return false;
		}
	}
}