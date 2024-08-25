import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("$ ===================== $");
        System.out.println("  Bem vindo ao PoupaBank!");
        System.out.println("$ ===================== $");
        System.out.println();

        System.out.print("Digite o seu nome: ");
        String nomeCliente = scan.nextLine();

        System.out.print("Digite o número da agência: ");
        String numeroAgencia = scan.nextLine();

        System.out.print("Digite o número da conta: ");
        int numeroConta = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite o valor do primeiro depósito: ");
        double deposito = scan.nextDouble();
        scan.nextLine();



        System.out.printf("\"Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %s e seu saldo %s já está disponível para saque\"."
                ,nomeCliente, numeroAgencia, numeroConta, deposito);
    }
}