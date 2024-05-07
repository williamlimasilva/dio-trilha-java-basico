package OrientacaoObjetosUmlDiagramacaoClassesIPhone.services;

import OrientacaoObjetosUmlDiagramacaoClassesIPhone.domain.AparelhoTelefonico;
import OrientacaoObjetosUmlDiagramacaoClassesIPhone.domain.NavegadorInternet;
import OrientacaoObjetosUmlDiagramacaoClassesIPhone.domain.ReprodutorMusical;

public class Smartphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void efetuarLigacao() {
        System.out.println("\nEfetuando Ligação");
    }

    public void atenderLigacao() {
        System.out.println("\nAtendendo Ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("\nIniciando Correio de Voz");
    }

    public void exibirPagina() {
        System.out.println("\nExibindo Pagina de Internet");
    }

    public void adicionarNovaAba() {
        System.out.println("\nAdicionando Noba Aba de Internet");
    }

    public void atualizarPagina() {
        System.out.println("\nAtualizando Pagina de Internet");
    }

    public void tocarMusica() {
        System.out.println("\nTocando Musica");
    }

    public void pausarMusica() {
        System.out.println("\nPausando Musica");
    }

    public void selecionarMusica() {
        System.out.println("\nSelecionando Musica");
    }
}
