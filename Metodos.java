import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
    
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private static ArrayList<Reserva> reservas = new ArrayList<Reserva>();

    private static TipoPessoa inputTipoCliente(){

        Scanner teclado = new Scanner(System.in);
        String tp="";

        while(!tp.equals("f") && !tp.equals("j")){
            System.out.println("Tipo de pessoa? [Digite f/j].");
            tp = teclado.nextLine().trim().toLowerCase();
            if(!tp.equals("f") && !tp.equals("j")){
                System.err.println("Comando inválido. Digite apenas f/j.");
            }
        }
        return tp.equals("f") ? TipoPessoa.Fisica : TipoPessoa.Juridica;
    }

    public static void reservarMesa(){

        Scanner teclado = new Scanner(System.in);
        boolean pagamento;
        String aux = "";
        TipoPessoa tipoPessoa = inputTipoCliente(); 

        System.out.print("Digite o nome: ");
        String nome = teclado.nextLine();
        
        Cliente c = null;
        switch(tipoPessoa){
            case Fisica:
                System.out.print("Digite o CPF: ");
                String cpf = teclado.nextLine();
                PessoaFisica pf = new PessoaFisica(nome, cpf);
                c = pf;
                break;

            case Juridica:
                System.out.print("Digite o CNPJ: ");
                String cnpj = teclado.nextLine();
                PessoaJuridica pj = new PessoaJuridica(nome, cnpj);
                c = pj;
                break;
        }

        while(!aux.equals("s") && !aux.equals("n")){
            System.out.println("O pagamento será à vista? [Digite s/n].");
            aux = teclado.nextLine().trim().toLowerCase();
            if(!aux.equals("s") && !aux.equals("n")){
                System.err.println("Comando inválido. Digite apenas s/n.");
            }
        }
        
        if("s".equals(aux)){
            pagamento = true;
        } else {
            pagamento = false;        
        }

        Reserva reserva = new Reserva(c, pagamento);
        reserva.setPagamentoAVista(pagamento);
        clientes.add(c);
        reservas.add(reserva);
        
        if(reservas.size() > 6){
            System.out.println("O número de pessoas da reserva foi esgotado, você entrou na lista de espera.");
        } else{
            System.out.println("Reserva efetuada.");
        }
        System.out.println();
    }


    public static void pesquisarReserva(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu CPF ou CNPJ: ");
        String aux = teclado.nextLine();

        for(int i = 0; i < reservas.size(); i++) {  
        
            
            if(reservas.get(i).getCliente() instanceof PessoaFisica){
                Cliente c = reservas.get(i).getCliente();
                PessoaFisica pf = (PessoaFisica) (c);
                if(pf.getCpf().equals(aux)){
                    System.out.print("Você possui uma reserva.");
                }
            } else if(reservas.get(i).getCliente() instanceof PessoaJuridica){
                Cliente c = reservas.get(i).getCliente();
                PessoaJuridica pj = (PessoaJuridica) (c);
                if(pj.getCnpj().equals(aux)){
                    System.out.println("Você possui uma reserva.");
                }
            } else {
                System.out.println("Esse CPF/CNPJ não possui uma reserva. Favor checar novamente.");
            }
        }
        System.out.println();
    }

    public static void imprimirReservas(){
        for(int i = 0; i < reservas.size(); i++) {
            if(i <= 6){
                System.out.println(reservas.get(i));
            } else{
                return;
            }  
        } 
        System.out.println();
    }

}
