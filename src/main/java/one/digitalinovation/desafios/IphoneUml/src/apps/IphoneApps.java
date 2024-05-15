package one.digitalinovation.desafios.IphoneUml.src.apps;
import apps.navegadores.NavegadorInternet;
import apps.players.ReprodutorMusical;
import apps.callCenter.AparelhoTelefonico;

public class IphoneApps implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar(String nome, String caminho) {
        System.out.println("Tocando a música: " + nome);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String nome, String caminho) {
        System.out.println("Selecionou a música: " + nome);
    }


    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String nome, int numero) {
        System.out.println("Discando para: " + nome + ", no número: " + numero);
    }

    @Override
    public void atender(String nome, int numero) {
        System.out.println(nome + ", está te ligando, pelo número: " + numero);
    }
    @Override
    public void iniciarCorreioVoz(String nome) {
        System.out.println("Ouvindo correio de voz do contato: " + nome);
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina(String url) {
        System.out.println("Atualizando a pagina: " + url);
    }
}