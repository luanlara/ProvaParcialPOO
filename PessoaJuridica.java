public class PessoaJuridica extends Cliente {
    
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj){
        super(nome);
        this.cnpj = cnpj;
    }
    
    public String getCnjp() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "{nome: " + getNome() + ", cnpj: " + getCnjp() + "}";
    }

}
