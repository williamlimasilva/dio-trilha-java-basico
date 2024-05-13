package domain;

public class ContaCorrente extends Conta{

    protected ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirextrato() {
        System.out.println("=== Imprimindo Extrato da Conta Corrente ===");
        super.imprimirInfosComuns();
    }


}
