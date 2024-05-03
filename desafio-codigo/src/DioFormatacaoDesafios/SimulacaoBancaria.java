package DioFormatacaoDesafios;

import java.util.Locale;
import java.util.Scanner;
public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 0;
        int opcao;

        do {
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    double valorDeposito = scanner.nextDouble();
                    saldo = saldo + valorDeposito;
                    System.out.printf("Saldo atual: %.1f %n", saldo);
                    break;
                case 2:
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo = saldo - valorSaque;
                        System.out.printf("Saldo atual: %.1f %n", saldo);
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                case 0://
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }while (opcao != 0);
    }
}
