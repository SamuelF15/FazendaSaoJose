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
        this.CEP = CEP;
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