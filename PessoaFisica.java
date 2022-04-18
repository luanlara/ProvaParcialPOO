public class PessoaFisica extends Cliente {
    
    private String cpf;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "{nome: " + getNome() + ", cpf: " + getCpf() + "}";
    }

}
