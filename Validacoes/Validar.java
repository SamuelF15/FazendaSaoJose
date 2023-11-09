package Validacoes;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validar {
	// validadores bases
	public static boolean validarNomesLetras(String NomePess) {
		String ValidarNomP = "^[A-Za-z]{85}";
		Pattern compiladorNom = Pattern.compile(ValidarNomP);
		Matcher verificadorNom = compiladorNom.matcher(NomePess);
		if (verificadorNom.matches()) {
			System.out.println("Válidado");
			return true;
		} else {
			System.out.println("Inválidado");
			return false;
		}
	}
	public static boolean validarCaracteres(String senha){
		String ValidarNomP = "^[A-Za-z0-9._-@]{8,20}";
		Pattern compiladorNom = Pattern.compile(ValidarNomP);
		Matcher verificadorNom = compiladorNom.matcher(NomePess);
		if (verificadorNom.matches()) {
			System.out.println("Válidado");
			return true;
		} else {
			System.out.println("Inválidado");
			return false;
		}
	}
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
	public static boolean validarCEP(String CEP) {
		String ValidarTel = "^[0-9]{8}";
		Pattern compiladorTel = Pattern.compile(ValidarTel);
		Matcher verificadorTel = compiladorTel.matcher(CEP);

		if (verificadorTel.matches()) {
			System.out.println("CEP válido!!");
			return true;
		} else {
			System.out.println("CEP inválido!!");
			return false;
		}
	}
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

    //Relacionados a Endereco
	public static boolean ValidarCEPClient(String CEP){
		if(validarCEP(getCEP())){
			return true
		}else{
			return false
		}
		}
	}
	public static boolean validarCidade(getCidade()){
		if (validarNomesLetras(getCidade())){
			return true
		}else{
			return false
		}
	}
	public static boolean validarRua(getRua()){
		if (validarNomesLetras(getRua())){
			return true
		}else{
			return false
		}
	}
	public static boolean validarBairro(getBairro()){
		if (validarNomesLetras(getBairro())){
			return true
		}else{
			return false
		}
	}
	public static boolean validarComplemento(getComplemento()){
		if (validarNomesLetras(getComplemento())){
			return true
		}else{
			return false
		}
	}
	//Relacionados a usuarios 
	public static boolean validarNomeDeUsuario(){
		if (validarNomesLetras(getNomeUser())){
			return true
		}else{
			return false
		}
	}
	public static boolean validarSenha(){
		if (validarCaracteres(getNomeUser())){
			return true
		}else{
			return false
		}
	}

}

// private String cidade;
// private String rua;
// private String bairro;
// private int numero;
// private String complemento;