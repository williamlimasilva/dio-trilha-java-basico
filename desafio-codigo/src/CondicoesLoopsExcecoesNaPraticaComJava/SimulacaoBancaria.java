package CondicoesLoopsExcecoesNaPraticaComJava;

import java.util.Locale;
import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 0;
        int opcao;
        System.out.println("OPERAÇÕES BANCÁRIAS");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("0. Finalizar Acesso");
        System.out.println("Digite uma das opções acima");
        do {

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor para deposito: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo = saldo + valorDeposito;
                    System.out.printf("Deposito Realizado com Sucesso R$ %.2f %nSaldo no valor de %.2f%n", valorDeposito, saldo);
                    break;
                case 2:
                    System.out.println("Digite valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo) {
                        System.out.printf("Saldo Insuficiente%nSaldo no valor de R$ %.2f%n", saldo);
                    } else {
                        saldo = saldo - valorSaque;
                        System.out.printf("Saque realizado com sucesso no valor de R$ %.2f %nSaldo no valor de R$ %.2f%n", valorSaque, saldo);
                    }
                    break;
                case 3:
                    System.out.printf("Consultando Saldo...%nSaldo no valor de R$ %.2f%n", saldo);
                    break;
                case 0://
                    System.out.println("Obrigado por utilizar nossos serviços.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }while (opcao != 0);
    }
}

