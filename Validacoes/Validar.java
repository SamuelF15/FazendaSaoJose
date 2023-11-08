package Validacoes;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class  Validar {
	//validando Nome da pessoa
	public static boolean validarNomePessoa(String NomePess){ 
		String ValidarNomP = "^[A-Za-z]{85}";
		Pattern compiladorNom = Pattern.compile(ValidarNomP);
		Matcher verificadorNom = compiladorNom.matcher(NomePess);
		if (verificadorNom.matches()){
			System.out.println("Nome válido!!");
			return true;
		}else{
			System.out.println("Nome inválido!!");
			return false;
		}
	}
	//validando CPF
	//public static boolean validarCPF(String CPF){}
	//validando Data
	public static boolean validarData(String Data){
		String ValidarData = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[0-9]{4}$";
		
		Pattern compiladorData = Pattern.compile(ValidarData);
		Matcher verificadorData = compiladorData.matcher(Data);
		if(verificadorData.matches()){
			System.out.println("E-mail válido!!");
			return true;
		}else{
			System.out.println("E-mail inválido!!");
			return false;
		}

	}
	//validando Telefone
	public static boolean validarTelefone(String Telefone) {
		String ValidarTel = "^[0-9]{11}";
		Pattern compiladorTel = Pattern.compile(ValidarTel);
		Matcher verificadorTel = compiladorTel.matcher(Telefone);
	
		if (verificadorTel.matches()){
			System.out.println("Telefone válido!!");
			return true;
		}else{
			System.out.println("Telefone inválido!!");
			return false;
		}
	}
	
	//validando Email
	public static boolean validarEmail(String Email){
		String ValidarEmail = "^[A-Za-z0-9._-]+@(gmail\\.com|outlook\\.com|hotmail\\.com|live\\.com|uol\\.com\\.br|bol\\.com\\.br|yahoo\\.com|ymail\\.com|globomail\\.com)$";
		
		Pattern compiladorEmail = Pattern.compile(ValidarEmail);
		Matcher verificadorEmail = compiladorEmail.matcher(Email);
		if(verificadorEmail.matches()){
			System.out.println("E-mail válido!!");
			return true;
		}else{
			System.out.println("E-mail inválido!!");
			return false;
		}
	}
	

}
