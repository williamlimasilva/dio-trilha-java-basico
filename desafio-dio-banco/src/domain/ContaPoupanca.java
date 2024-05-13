package domain;

public class ContaPoupanca extends Conta{

    protected ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirextrato() {
        System.out.println("=== Imprimendo Extrato da Conta Poupaça ===");
        super.imprimirInfosComuns();
    }
}
