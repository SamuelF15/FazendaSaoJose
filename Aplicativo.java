public class Aplicativo {


    public static void main(String[] args) {
        // Exemplo de validação de atributos


        //Validando Nomes
        String nome = "Samuel";
        if (Validar.validarNomesLetras(nome)) {
            System.out.println("Nome válido: " + nome);
        } else {
            System.out.println("Nome inválido: " + nome);
        }
        String nomeUser = "Samuel Figueiredo";
        if (Validar.validarNomesLetras(nomeUser)) {
            System.out.println("Nome o usuário é válido: " + nomeUser);
        } else {
            System.out.println("Nome o usuário é inválido: " + nomeUser);
        }

        //Validando Senhas
        String senha = "12345!@#$%";
        if (Validar.validarSenha(senha)) {
            System.out.println("Senha válida: " + senha);
        } else {
            System.out.println("Senha inválida: " + senha);
        }
        String senhaUser = "12345!@#$%";
        if (Validar.validarSenha(senhaUser)) {
            System.out.println("Senha do usuário é válida: " + senhaUser);
        } else {
            System.out.println("Senha do usuário é inválida: " + senhaUser);
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
        if (Validar.validarCEP(cep)) {
            System.out.println("CEP válido: " + cep);
        } else {
            System.out.println("CEP inválido: " + cep);
        }
        //Validar uma Cidade
        String cidade = "Coronel Fabriciano";
        if (Validar.validarNomesLetras(cidade)){
            System.out.println("Cidade válida: " + cidade);
        }else{
            System.out.println("Cidade inválida: " + cidade);
        }
        String rua = "Luiz Gonzaga da silva";
        if (Validar.validarNomesLetras(rua)){
            System.out.println("Rua válida: " + rua);
        }else{
            System.out.println("Rua inválida: " + rua);
        }
        String bairro = "JK";
        if (Validar.validarNomesLetras(bairro)){
            System.out.println("Bairro válido: " + bairro);
        }else{
            System.out.println("Bairro inválido: " + bairro);
        }
        String numero = "193";
        if (Validar.validarNumCasa(numero)){
            System.out.println("Número válido: " + numero);
        }else{
            System.out.println("Número inválido: " + numero);
        }
        String complemento = "Casa da esquina na avenida JK ao lado da catedral";
        if (Validar.validarNomesLetras(bairro)){
            System.out.println("Complemento válido: " + complemento);
        }else{
            System.out.println("Complemento inválido: " + complemento);
        }
        String salario = "12000";
        if (Validar.validarPagamento(salario)) {
            System.out.println("Salário válido: " + salario);
        } else {
            System.out.println("Salário inválido: " + salario);
        }
    }
}
    

 










  

















