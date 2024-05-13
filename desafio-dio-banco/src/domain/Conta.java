package domain;

public abstract class Conta {
    protected static int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    protected int numeroAgencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    protected Conta(Cliente cliente) {
        this.numeroAgencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirextrato() {
        System.out.println("Imprimindo Extrato...");
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular da Conta: %s", this.cliente.getNome()));
        System.out.println(String.format("Numero da Agencia: %d", this.numeroAgencia));
        System.out.println(String.format("Numero da Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo em Conta: %.2f", this.saldo));
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
