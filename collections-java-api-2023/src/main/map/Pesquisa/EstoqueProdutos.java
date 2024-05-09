package main.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private final Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        System.out.printf("Levantamento financeiro do estoque: %nValor Total: %.2f%n",valorTotalEstoque);
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        System.out.printf("Produto MAIS CARO em estoque : %s",produtoMaisCaro);
        return produtoMaisCaro;
    }
    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        System.out.printf("Produto MAIS BARATO em estoque : %s",produtoMaisBarato);
        return produtoMaisBarato;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(47597738,"Produto 1",22,18.89);
        estoqueProdutos.adicionarProduto(35127956,"Produto 2",1,82.02);
        estoqueProdutos.adicionarProduto(89803227,"Produto 3",5,77.89);
        estoqueProdutos.adicionarProduto(80787408,"Produto 4",82,8.96);
        estoqueProdutos.adicionarProduto(26333117,"Produto 5",3,71.71);
        estoqueProdutos.adicionarProduto(41956097,"Produto 6",2,97.60);
        estoqueProdutos.adicionarProduto(76753840,"Produto 7",4,64.22);
        estoqueProdutos.adicionarProduto(14546258,"Produto 8",50,0.50);
        estoqueProdutos.adicionarProduto(21000811,"Produto 9",5,69.82);
        estoqueProdutos.adicionarProduto(69798874,"Produto 20",54,26.22);

        estoqueProdutos.exibirProdutos();
        estoqueProdutos.calcularValorTotalEstoque();
        estoqueProdutos.obterProdutoMaisCaro();
        estoqueProdutos.obterProdutoMaisBarato();
    }

}
