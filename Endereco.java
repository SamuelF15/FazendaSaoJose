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
                System.out.println(" CEP válido"+ CEP);
                System.out.println(" ");
			}
		    }
				System.out.println(" ");
		         System.out.println(" CEP invalido"+ CEP);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}