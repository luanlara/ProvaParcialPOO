import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
        
            
                System.out.print("RestFran> ");
                menu();
                String input = scan.nextLine().trim();
                

                switch(input){
                    case "1":

                        break;

                
                    case "2":

                        break;

                    case "3":

                        break;

                    case "4":

                        break;

                    case "5":

                        break;

                    case "6":

                        exit = true;

                        break;

                    default:

                        System.err.println("Comando inválido.");
                        

                
                }
            
        }
        System.out.println("Finalizado");

        
    }
    
    private static void menu(){
        System.out.println("Sabor Sofisticado Sistema de reservas");
        System.out.println("------------------------");
        System.out.println("1 -> Reservar mesa");
        System.out.println("2 -> Pesquisar reserva");
        System.out.println("3 -> Imprimir reservas");
        System.out.println("4 -> Imprimir lista de espera");
        System.out.println("5 -> Cancelar reserva");
        System.out.println("6 -> Finalizar");
        

    }

}
