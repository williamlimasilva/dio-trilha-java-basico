package main.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private final Map<String,Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
            System.out.println("O contato de nome: "+nome+" foi removido da lista");
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);

    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Marcel",40422539);
        agendaContatos.adicionarContato("Junior",29569085);
        agendaContatos.adicionarContato("Tania",86789642);
        agendaContatos.adicionarContato("Amanda",19167633);
        agendaContatos.adicionarContato("Francis",46749512);
        agendaContatos.adicionarContato("Junior",76373732);
        agendaContatos.adicionarContato("Marcia",94549189);
        agendaContatos.adicionarContato("Leonilde",15493488);
        agendaContatos.adicionarContato("Junior",64183018);

        agendaContatos.exibirContatos();
        System.out.printf("Foi adicionado um total de %d contatos\n",agendaContatos.agendaContatoMap.size());

        agendaContatos.removerContato("Francis");
        System.out.printf("Foi adicionado um total de %d contatos\n",agendaContatos.agendaContatoMap.size());
        System.out.println("Numero do contato requisitado: "+ agendaContatos.pesquisarPorNome("Amanda"));
    }
}
