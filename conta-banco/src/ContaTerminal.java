import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o numero de sua agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite o numero de sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o valor do deposito: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "
                + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroAgencia +
                ", conta "
                + numeroConta +
                ", e seu saldo de R$ "
                + saldo +
                " já está disponível para saque");
    }
}