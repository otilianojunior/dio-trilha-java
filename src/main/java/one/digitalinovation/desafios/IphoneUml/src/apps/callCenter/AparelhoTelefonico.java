package apps.callCenter;

public interface AparelhoTelefonico {
    void ligar(String nome, int numero);
    void atender(String nome, int numero);
    void iniciarCorreioVoz(String nome);
}
