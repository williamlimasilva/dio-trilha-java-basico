package main.set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class ComparatorPorPreco implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
public class CadastroProdutos {

    private final Set<Produto> produtoSet;
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(28817702,"Produto 0",3.99,1);
        cadastroProdutos.adicionarProduto(45312580,"Produto 3",5.99,2);
        cadastroProdutos.adicionarProduto(66307414,"Produto 5",7.99,3);
        cadastroProdutos.adicionarProduto(25883585,"Produto 2",3.99,4);
        cadastroProdutos.adicionarProduto(20334346,"Produto 9",1.99,5);
        cadastroProdutos.adicionarProduto(45312580,"Produto 1",8.99,6);
        cadastroProdutos.adicionarProduto(21937626,"Produto 4",9.99,7);
        cadastroProdutos.adicionarProduto(65150390,"Produto 7",2.99,8);
        cadastroProdutos.adicionarProduto(45312580,"Produto 6",6.99,9);
        cadastroProdutos.adicionarProduto(85953160,"Produto 9",4.99,10);
        System.out.println("Produtos com codigos unicos:\n" + cadastroProdutos.produtoSet);
        System.out.println("Foram adicionados : " +cadastroProdutos.produtoSet.size() + " produtos neste Set\n");
        System.out.println("Produtos exibidos por ordem de nome:\n" + cadastroProdutos.exibirProdutosPorNome());
        System.out.println("Produtos exibidos por ordem de preço:\n" + cadastroProdutos.exibirProdutosPorPreco());


    }
}
