package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> carrinhoDeCompra;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompra.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> removerItemCarrinho = new ArrayList<>();
        for (Item itemParaRemover : carrinhoDeCompra) {
            if(itemParaRemover.getNome().equalsIgnoreCase(nome)){
                removerItemCarrinho.add(itemParaRemover);
            }
        }
        System.out.println("Removido do carrinho : " + removerItemCarrinho);
        carrinhoDeCompra.removeAll(removerItemCarrinho);

    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!carrinhoDeCompra.isEmpty()){
            for (Item item : carrinhoDeCompra) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
                System.out.printf("Preço Composto do produto: %s X %d = %.2f%n", item.getNome(),item.getQuantidade(), valorItem);
            }
            System.out.printf("Valor total da compra: %.2f", valorTotal);
            return valorTotal;
        }else{
            throw new RuntimeException("O carrinho de compras está vazio");
        }
    }
    public void exibirItens(){
        if(!carrinhoDeCompra.isEmpty()){
            System.out.println(this.carrinhoDeCompra);
        }else{
            System.out.println("O carrinho de compras está vazio");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Manteiga 500g", 6.99,4);
        carrinhoDeCompras.adicionarItem("Café 500g", 14.99,3);
        carrinhoDeCompras.adicionarItem("Leite 1L", 3.99,7);
        carrinhoDeCompras.adicionarItem("Pão Integral", 7.99,5);
        carrinhoDeCompras.adicionarItem("Achocolatado 250g", 8.99,2);
        carrinhoDeCompras.adicionarItem("Açucar", 3.49,5);
        carrinhoDeCompras.adicionarItem("Queijo Prato 100g", 4.49,5);
        carrinhoDeCompras.adicionarItem("Presunto 100g", 3.49,5);
        carrinhoDeCompras.adicionarItem("Biscoito Leite", 8.49,3);
        carrinhoDeCompras.adicionarItem("Biscoito Maria", 8.49,2);
        carrinhoDeCompras.adicionarItem("Farinha 1Kg", 8.49,1);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Biscoito Leite");
        carrinhoDeCompras.removerItem("Farinha 1Kg");
        carrinhoDeCompras.removerItem("Achocolatado 250g");

        carrinhoDeCompras.calcularValorTotal();
    }
}
