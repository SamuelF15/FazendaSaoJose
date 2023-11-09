
public class Aplicativo {


    public static void main(String[] args) {
        // Exemplo de validação de atributos

        // Validar um nome
        String nome = "Samuel";
        if (Validar.validarNomesLetras(nome)) {
            System.out.println("Nome válido: " + nome);
        } else {
            System.out.println("Nome inválido: " + nome);
        }
        String senha = "12345!@#$%";
        if (Validar.validarSenha(senha)) {
            System.out.println("senha válido: " + senha);
        } else {
            System.out.println("senha inválido: " + senha);
        }

        // Validar um CPF
        String cpf = "123.456.789-09";
        if (Validar.validarCPF(cpf)) {
            System.out.println("CPF válido: " + cpf);
        } else {
            System.out.println("CPF inválido: " + cpf);
        }

        // Validar uma data
        String data = "01/12/1990";
        if (Validar.validarData(data)) {
            System.out.println("Data válida: " + data);
        } else {
            System.out.println("Data inválida: " + data);
        }

        // Validar um telefone
        String telefone = "11223344556";
        if (Validar.validarTelefone(telefone)) {
            System.out.println("Telefone válido: " + telefone);
        } else {
            System.out.println("Telefone inválido: " + telefone);
        }

        // Validar um e-mail
        String email = "joao@gmail.com";
        if (Validar.validarEmail(email)) {
            System.out.println("E-mail válido: " + email);
        } else {
            System.out.println("E-mail inválido: " + email);
        }

        // Validar um CEP
        String cep = "12345-678";
        if (Validar.isValidCep(cep)) {
            System.out.println("CEP válido: " + cep);
        } else {
            System.out.println("CEP inválido: " + cep);
        }
    }
}