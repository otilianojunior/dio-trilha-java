package one.digitalinovation.estruturas.lista.encadeadas;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("teste-1");
        minhaListaEncadeada.add("teste-2");
        minhaListaEncadeada.add("teste-3");
        minhaListaEncadeada.add("teste-4");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.remove(2));
        System.out.println(minhaListaEncadeada);
    }
}
