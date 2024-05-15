package one.digitalinovation.desafios.IphoneUml;

import apps.navegadores.NavegadorInternet;
import apps.players.ReprodutorMusical;
import apps.callCenter.AparelhoTelefonico;
import one.digitalinovation.desafios.IphoneUml.apps.IphoneApps;

public class Iphone {
    private NavegadorInternet navegador;
    private ReprodutorMusical player;
    private AparelhoTelefonico telefone;


    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.iniciarAplicativos();
    }

    public Iphone() {
        this.navegador = new IphoneApps();
        this.player = new IphoneApps();
        this.telefone = new IphoneApps();
    }


    public void iniciarAplicativos() {

        navegador.exibirPagina("www.google.com.br");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina("www.google.com.br");

        player.tocar("Coisa linda", "/discolocal");
        player.pausar();
        player.selecionarMusica("Uma arlinda mulher", "/discolocal");

        telefone.ligar("Josias", 123913239);
        telefone.atender("Malaquias", 312312312);
        telefone.iniciarCorreioVoz("Joca da Padaria");

    }
}
