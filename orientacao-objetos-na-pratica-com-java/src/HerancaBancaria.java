import java.text.DecimalFormat;
import java.util.Scanner;

public class HerancaBancaria {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome para titular da Conta Poupança:");
        String titular = scanner.nextLine();
        System.out.println("Digite um numero para a Conta Poupança");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite um valor para o Saldo da Conta Poupança");
        double saldo = scanner.nextDouble();
        System.out.println("Digite um valor para a Taxa de Juros da Conta Poupança");
        double taxaJuros = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(titular,numeroConta,saldo,taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
    }
}

class Conta {
    protected String titular;
    protected int numero;
    protected double saldo;

    public Conta(String titular,int numero,double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }
}

class ContaPoupanca extends Conta {
    private final double taxaJuros;

    public ContaPoupanca(String titular, int numero,double saldo, double taxaJuros) {
        super(titular, numero, saldo);
        //TODO: Implementar adequadamente esta sobrecarga de construtores.
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        //TODO: Complementar as informações com a taxa de juros.
        System.out.println("Taxa de juros: "+taxaJuros);
    }
}
