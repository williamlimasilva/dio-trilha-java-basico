package CondicoesLoopsExcecoesNaPraticaComJava;

import java.util.Scanner;
public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conta Plus Special Limit");
        System.out.println("Digite quanto gostaria de adicionar a seu saldo");
        double limiteChequeEspecial = 500;
        double saldo = scanner.nextDouble();
        double saldoDisponivel = saldo + limiteChequeEspecial;
        System.out.printf("Saldo em conta atual %.1f%n",saldo);
        System.out.printf("Limite Cheque Especial %.1f%n", limiteChequeEspecial);
        System.out.printf("Saldo Total Disponivel para saque %.1f%n",saldoDisponivel);
        System.out.println("Digite um valor para saque");
        double saque = scanner.nextDouble();

        // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:
        // TODO: Verifique se o saque ultrapassa o limite do cheque especial, mas não o saldo total disponível:
        if(saldoDisponivel < saque ){
            // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }else if(saldo >= saque){
            System.out.println("Transação realizada com sucesso.");
        }else if (saldoDisponivel >= saque){
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
        }
        // Fechamos o objeto Scanner para liberar os recursos:
        scanner.close();
    }
}
