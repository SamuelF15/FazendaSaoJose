
public class Aplicativo {


    public static void main(String[] args) {
        // Exemplo de validação de atributos
        
        Usuario user = new Usuario();
        Pessoa userPessoa = new Pessoa();
       // Validando Nomes
        String nome = "Samuel";
        userPessoa.setNomePessoa(nome);

        //Validando Nome de usuario
       String nomeUser = "Samuel Figueiredo";
       user.setNomeUser(nomeUser);

       // Validando Senha 
       String senhaUser = "12345!@#$%";
       user.setSenhaUser(senhaUser);

        // Validar um CPF
        String cpf = "114.128.176-76";
        userPessoa.setCPF(cpf);

        // Validar uma data
        String data = "01/12/1990";
        userPessoa.setDataNasc(data);

        // Validar um telefone
        String telefone = "11223344556";
       userPessoa.setTelefone(telefone);

        // Validar um e-mail
        String email = "joao@gmail.com";
        userPessoa.setEmailPessoa(email);

        // Validar um CEP
        String cep = "12345-678";
        userPessoa.setCEP(cep);

        // //Validar uma Cidade
        String cidade = "Coronel Fabriciano";
        userPessoa.setCidade(cidade);

        // Validar rua 
        String rua = "Luiz Gonzaga da silva";
        userPessoa.setRua(rua);

        //Validar bairro
        String bairro = "JK";
        userPessoa.setBairro(bairro);

        String numero = "193";
        userPessoa.setNumero(numero);

        //validar complemento 
        String complemento = "Casa da esquina na avenida JK ao lado da catedral";
        userPessoa.setComplemento(complemento);

    }
}