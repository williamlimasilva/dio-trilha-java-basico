import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class Transacao {
    private final String tipo;
    private final double valor;

    public Transacao(String tipo, double valor) {
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
        return tipo.equalsIgnoreCase("D") ? "Deposito de " + valor : "Saque de " + valor;
    }
}

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar saldo inicial
        System.out.println("Digite o saldo inicial da conta:");
        double saldo = scanner.nextDouble();
        // Solicitar quantidade de transações
        System.out.println("Digite a quantidade de transações:");
        int quantidadeTransacoes = scanner.nextInt();
        // TODO: Crie a lista para armazenar as transações:
        List<Transacao> transacoes = new ArrayList<>();
        // TODO: Implemente um loop 'for' para iterar sobre as transações:
        for (int i = quantidadeTransacoes; i > 0; i--) {
            System.out.println("Transações Disponiveis :" + i + "/" + quantidadeTransacoes);
            System.out.println("Digite 'D' para deposito ou 'S' para saque:");
            String tipoTransacao = scanner.next().toUpperCase(Locale.US);
            if (tipoTransacao.equalsIgnoreCase("D") || tipoTransacao.equalsIgnoreCase("S")){
                System.out.println("Digite o valor da transação:");
                double valorTransacao = scanner.nextDouble();
                if (tipoTransacao.equalsIgnoreCase("D")) {
                    saldo += valorTransacao;
                } else if (tipoTransacao.equalsIgnoreCase("S")) {
                    saldo -= valorTransacao;
                }
                // TODO: Adicione a transação à lista:
                transacoes.add(new Transacao(tipoTransacao, valorTransacao));
            }else {
                // Se o tipo de transação não for reconhecido, exibe uma mensagem de erro
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
            }

        }
        // Saída
        // Aqui é exibido o saldo final e a lista de transações ao final do processo:
        System.out.println("Saldo: " + saldo);
        System.out.println("Transações:");
        // TODO: Crie um loop 'for' para exibir cada transação na lista:
        for (int i = 0; i < transacoes.size(); i++) {
            System.out.println((i + 1) + ". " + transacoes.get(i));
        }
        scanner.close();
        //TODO: Agora exibA o número da transação seguido da descrição da transação:
    }

}
