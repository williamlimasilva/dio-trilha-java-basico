package OrientacaoObjetosUmlDiagramacaoClassesIPhone;

import OrientacaoObjetosUmlDiagramacaoClassesIPhone.services.Smartphone;

public class Iphone extends Smartphone {
    public static void main(String[] args) {
        Smartphone iPhone = new Smartphone();
        iPhone.atenderLigacao();
        iPhone.efetuarLigacao();
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
        iPhone.iniciarCorreioVoz();
        iPhone.selecionarMusica();
        iPhone.tocarMusica();
        iPhone.pausarMusica();
    }
}
