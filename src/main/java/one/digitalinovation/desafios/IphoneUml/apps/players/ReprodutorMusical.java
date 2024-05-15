package apps.players;

public interface ReprodutorMusical {
    void tocar(String nome, String caminho);
    void pausar();
    void selecionarMusica(String nome, String caminho);
}
