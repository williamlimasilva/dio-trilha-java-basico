package CondicoesLoopsExcecoesNaPraticaComJava;

import java.util.Scanner;
public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-- INFORMATIVO DO LIMITE DIARIO --");
        System.out.println("Digite um valor para limite Diario");
        double limiteDiario = scanner.nextDouble();
// TODO: Crie um loop 'for' para iterar sobre os saques:
// TODO: Solicite ao usuário o valor do saque:
        System.out.println("Digite um valor para saque");
        double valorSaque = scanner.nextDouble();
// TODO: Verifique se o valor do saque é zero, encerrando as transações:

        double limiteRestante = limiteDiario - valorSaque;
// Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;
        if(valorSaque <= 0){
            System.out.println("Transacoes encerradas.");
            scanner.close();
        }else if (valorSaque > limiteDiario){
            System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            scanner.close();
        }else{
// TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
            System.out.printf("Saque realizado. Limite restante: %.1f%nTransacoes encerradas.",limiteRestante);
            scanner.close();
        }
// TODO: Informe que o saque foi realizado e mostre o limite restante:
    }
}