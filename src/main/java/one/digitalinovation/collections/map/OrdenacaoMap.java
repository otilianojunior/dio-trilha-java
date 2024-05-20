package one.digitalinovation.collections.map;
//Dados os seguintes informações sobre livros;
//cire um dicionario e ordene po nome autor e nome livro
//autor 1 = nome: HawKing, Stephen - Livro = nome: Uma Breve Hitória do Tempo, páginas: 256
//autor 2 = nome: Duhigg, Charles - Livro = nome: O Poder do Hábito, páginas: 408
//autor 3 = nome: Harari, Yuval Naah - Livro = 21 licões Para o Século 21, páginas: 432

import java.util.*;

public class OrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("-- Ordem Aleatória -- ");
        Map<String, Livro> dicionarioAutoresLivros = new HashMap<>();
        dicionarioAutoresLivros.put("HawKing, Stephen", new Livro("Uma Breve Hitória do Tempo", 256));
        dicionarioAutoresLivros.put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
        dicionarioAutoresLivros.put("Harari, Yuval Naah", new Livro("21 licões Para o Século 21", 432));

        for(Map.Entry<String, Livro> livro : dicionarioAutoresLivros.entrySet()){
            System.out.println("Autor: " + livro.getKey() + " - Livro: " + livro.getValue().getNome());
        }

        System.out.println("-- Ordem Inserção -- ");

        Map<String, Livro> dicionarioAutoresLivros2 = new LinkedHashMap<>();
        dicionarioAutoresLivros2.put("HawKing, Stephen", new Livro("Uma Breve Hitória do Tempo", 256));
        dicionarioAutoresLivros2.put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
        dicionarioAutoresLivros2.put("Harari, Yuval Naah", new Livro("21 licões Para o Século 21", 432));

        for(Map.Entry<String, Livro> livro : dicionarioAutoresLivros2.entrySet()){
            System.out.println("Autor: " + livro.getKey() + " - Livro: " + livro.getValue().getNome());
        }

        System.out.println("-- Ordem Alfabética autores -- ");
        Map<String, Livro> dicionarioAutoresLivros3 = new TreeMap<>(dicionarioAutoresLivros);
        for(Map.Entry<String, Livro> livro : dicionarioAutoresLivros3.entrySet()){
            System.out.println("Autor: " + livro.getKey() + " - Livro: " + livro.getValue().getNome());
        }

        System.out.println("-- Ordem Alfabética livros -- ");
        Set<Map.Entry<String, Livro>> dicionarioAutoresLivros4 = new TreeSet<>(new ComparatorNome());
        dicionarioAutoresLivros4.addAll(dicionarioAutoresLivros.entrySet());
        for(Map.Entry<String, Livro> livro : dicionarioAutoresLivros4){
            System.out.println("Autor: " + livro.getKey() + " - Livro: " + livro.getValue().getNome());
        }


        System.out.println("-- Ordem Páginas -- ");
        Set<Map.Entry<String, Livro>> dicionarioAutoresLivros5 = new TreeSet<>(new ComparatorPaginas());
        dicionarioAutoresLivros5.addAll(dicionarioAutoresLivros.entrySet());
        for(Map.Entry<String, Livro> livro : dicionarioAutoresLivros5){
            System.out.println("Autor: " + livro.getKey() + " - Livro: " + livro.getValue().getNome() + " - Páginas: " + livro.getValue().getPaginas());
        }


    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro {" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livros = (Livro) o;
        return Objects.equals(nome, livros.nome) && Objects.equals(paginas, livros.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }


}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }
}

class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return Integer.compare(o1.getValue().getPaginas(), o2.getValue().getPaginas());
    }
}