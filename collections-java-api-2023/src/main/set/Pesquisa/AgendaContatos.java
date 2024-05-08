package main.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroContato) {
        contatoSet.add(new Contato(nome, numeroContato));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroContato(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Camila",48137519);
        agendaContatos.adicionarContato("Camila",0);
        agendaContatos.adicionarContato("Camila Almeida",96566326);
        agendaContatos.adicionarContato("Camila DIO",48946314);
        agendaContatos.adicionarContato("Maria Eduarda",96566326);

        agendaContatos.exibirContatos();

       System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado " + agendaContatos.atualizarNumeroContato("Maria Eduarda",91243576));

        agendaContatos.exibirContatos();
    }
}
