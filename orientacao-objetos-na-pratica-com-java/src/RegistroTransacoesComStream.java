import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class Transaction {
    private final String tipo;
    private final double valor;

    public Transaction(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return tipo.equalsIgnoreCase("D") ? "Deposito de " + valor : " Saque de " + valor;
    }
}

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o saldo inicial da conta:");
        double saldo = scanner.nextDouble();
        System.out.println("Digite a quantidade de transações:");
        int quantidadeTransacoes = scanner.nextInt();
        List<Transaction> transacoes = new ArrayList<>();

        for (int i = quantidadeTransacoes; i > 0; i--) {
            System.out.println("Transações Disponiveis :" + i + "/" + quantidadeTransacoes);
            System.out.println("Digite 'D' para deposito ou 'S' para saque:");
            String tipoTransaction = scanner.next().toLowerCase(Locale.US);
            if (tipoTransaction.equalsIgnoreCase("D") || tipoTransaction.equalsIgnoreCase("S")) {
                System.out.println("Digite o valor da transação:");
                double valorTransaction = scanner.nextDouble();
                Transaction transaction = new Transaction(tipoTransaction, valorTransaction);
                transacoes.add(transaction);
                // Aqui é atualizado o saldo da conta com base no tipo de transação
                if (transaction.getTipo().equalsIgnoreCase("D")) {
                    saldo += valorTransaction;
                } else if (transaction.getTipo().equalsIgnoreCase("S")) {
                    saldo -= valorTransaction;
                }
            } else {
                System.out.println("Opção inválida. Utilize 'D' para depósito ou 'S' para saque.");
            }
        }

        // Exibe o saldo final e a lista de transações ao final do processo usando Stream API
        System.out.println("Saldo : " + saldo);
        System.out.println("Transacoes:");

        // TODO: Crie um fluxo (stream) a partir da lista de transações:
        transacoes.stream()
                // TODO: Mapeie cada transação para uma string formatada:
                .map(transacao -> transacao.getTipo() + " de " + transacao.getValor())
                // TODO: Colete os elementos do fluxo em uma lista:
                .toList()
                // TODO: Para cada elemento da lista, imprime no console:
                .forEach(System.out::println);

        scanner.close();
    }
}
