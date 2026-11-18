import model.ContaBancaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        sc.nextDouble();

        System.out.print("================================");

        System.out.println("*** INSTRUÇÕES ABAIXO ***");
        System.out.println("");
        System.out.println("Consultar Saldo -> 1");
        System.out.println("Consultar Cheque Especial -> 2");
        System.out.println("Depositar Dinheiro -> 3");
        System.out.println("Sacar Dinheiro -> 4");
        System.out.println("Pagar um Boleto -> 5");
        System.out.println("Verificar Cheque Especial -> 6");
        System.out.println("Encerrar Programa -> 0");

        System.out.print("================================");

        System.out.println("Digite o número do serviço que deseja: ");
        int navegar = sc.nextInt();

        if(navegar == 1){
            System.out.println("Consultar saldo!");
            if(conta.getSaldo() <= 0.0){
                System.out.println("Sem saldo disponível R$ " + conta.getSaldo());
            } else {
                System.out.println("Seu saldo atual R$ " + conta.getSaldo());
            }
        } else if(navegar == 2){
            System.out.println("Valor cheque especial -> R$ " + conta.getChequeEspecial());
        }




        sc.close();
    }
}