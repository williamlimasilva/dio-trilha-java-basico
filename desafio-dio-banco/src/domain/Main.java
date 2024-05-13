package domain;

public class Main {
    public static void main(String[] args) {
        Cliente william = new Cliente();
        william.setNome("William Lima");
        Conta cc = new ContaCorrente(william);
        Conta cp = new ContaPoupanca(william);

        cc.depositar(200);
        cp.depositar(100);
        cc.transferir(cp,100);

        cc.imprimirextrato();
        cp.imprimirextrato();

    }
}
