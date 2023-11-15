
public class Aplicativo {


    public static void main(String[] args) {
        // Exemplo de validação de atributos
        
        Usuario user = new Usuario();
        Pessoa userPessoa = new Pessoa();
        //Validando Nomes
        // String nome = "Samuel";
        // if (Validar.validarNomesLetras(nome)) {
        //     System.out.println("Nome válido: " + nome);
        // } else {
        //     System.out.println("Nome inválido: " + nome);
        // }
        //Validando Nome de usuario
       String nomeUser = "Samuel Figueiredo";
       user.setNomeUser(nomeUser);
       // Validando Senha 
       String senhaUser = "12345!@#$%";
       user.setSenhaUser(senhaUser);
        // Validar um CPF
        String cpf = "115.636.106-04";
        userPessoa.setCPF(cpf);

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
        // //Validar uma Cidade
        // String cidade = "Coronel Fabriciano";
        // if (Validar.validarNomesLetras(cidade)){
        //     System.out.println("Cidade válida: " + cidade);
        // }else{
        //     System.out.println("Cidade inválida: " + cidade);
        // }
        // String rua = "Luiz Gonzaga da silva";
        // if (Validar.validarNomesLetras(rua)){
        //     System.out.println("Rua válida: " + rua);
        // }else{
        //      System.out.println("Rua inválida: " + rua);
        // }
        // String bairro = "JK";
        // if (Validar.validarNomesLetras(bairro)){
        //     System.out.println("Bairro válido: " + bairro);
        // }else{
        //     System.out.println("Bairro inválido: " + bairro);
        // }
        // String numero = "193";
        // if (Validar.validarNumCasa(numero)){
        //     System.out.println("Número válido: " + numero);
        // }else{
        //     System.out.println("Número inválido: " + numero);
        // }
        // String complemento = "Casa da esquina na avenida JK ao lado da catedral";
        // if (Validar.validarNomesLetras(bairro)){
        //     System.out.println("Complemento válido: " + complemento);
        // }else{
        //     System.out.println("Complemento inválido: " + complemento);
        // }

    }
}