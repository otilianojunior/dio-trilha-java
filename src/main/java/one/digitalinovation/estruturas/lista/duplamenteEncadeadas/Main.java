package one.digitalinovation.estruturas.lista.duplamenteEncadeadas;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();
        minhaListaEncadeada.add("A-1");
        minhaListaEncadeada.add("B-2");
        minhaListaEncadeada.add("C-3");
        minhaListaEncadeada.add("D-4");
        minhaListaEncadeada.add("E-5");
        minhaListaEncadeada.add("F-6");
        minhaListaEncadeada.add("G-7");

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(3);
        minhaListaEncadeada.add(3, "D-99");

        System.out.println(minhaListaEncadeada);
        System.out.println(minhaListaEncadeada.get(3));
    }
}
