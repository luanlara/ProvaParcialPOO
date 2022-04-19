public class Reserva extends Pagamento{
    
    private Cliente cliente;

    private boolean pagamentoAVista;

    public void Reserva(Cliente cliente, boolean pagamentoAVista){
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
        return "Cliente = "+ cliente + "/ Forma de pagamento = " +pagamentoAVista+ ".";
    }

}
