import java.util.Scanner;

public class Reserva implements Pagamento{
    
    private Cliente cliente;

    private boolean pagamentoAVista;

    public Reserva(Cliente cliente, boolean pagamentoAVista){
        this.cliente = cliente;
        this.pagamentoAVista = pagamentoAVista;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setPagamentoAVista(boolean pagamentoAVista) {
        this.pagamentoAVista = pagamentoAVista;
    }

    public boolean getPagamentoAVista(){
        return pagamentoAVista;
    }

    public double calcularPagamento() {
        double valor = 3200;
        if(pagamentoAVista){
            valor = valor * 0.9;
        }
        return valor;
	}

    @Override
    public String toString() {
        String aux = "";
        
        if(cliente instanceof PessoaFisica){
            aux += "Pessoa Física";
        } else{
            aux += "Pessoa Jurídica"; 
        }

        aux += "\nCliente: " + cliente.getNome(); 

        if(getPagamentoAVista() == true){
            aux += "\nPagamento: À vista";
        } else{
            aux += "\nPagamento: Parcelado";
        }

        return aux;
    }

    

}
