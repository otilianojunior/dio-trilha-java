package one.digitalinovation.collections.set;

//Dados as seguintes informações sobre séries, crie um conjunto e ordene exibindo:
//serie 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
//serie 2 = Nome: dark, genero: drama, tempoEpisodio: 60
//serie 3 = Nome: that '70s show, genero: comédia, tempoEpisodio: 25


import java.text.CollationElementIterator;
import java.util.*;

public class OrdenacaoSet {
    public static void main(String[] args) {
        Set<Serie> conjuntoSeries = new HashSet<>();
        conjuntoSeries.add(new Serie("got", "fantasia", 60));
        conjuntoSeries.add(new Serie("dark", "drama", 60));
        conjuntoSeries.add(new Serie("that '70s show", "comédia", 25));


        System.out.println("-- Ordem aleatória: --");

        for (Serie serie : conjuntoSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("-- Ordem de inserção: " + "Necesário usar linkedHashSet --");

        Set<Serie> conjuntoSeries2 = new LinkedHashSet<>();
        conjuntoSeries2.add(new Serie("got", "fantasia", 60));
        conjuntoSeries2.add(new Serie("dark", "drama", 60));
        conjuntoSeries2.add(new Serie("that '70s show", "comédia", 25));

        for (Serie serie : conjuntoSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("-- Por tempo de Episódio: " + "Necessario TreeSet --");
        Set<Serie> conjuntoSeries3 = new TreeSet<>(conjuntoSeries);
        for (Serie serie : conjuntoSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("Ordem Nome, Genero e tempo de episodio");
        Set<Serie> conjuntoSeries4 = new TreeSet<>(new CompareNomeGeneroTempoEpisodio());
        conjuntoSeries4.addAll(conjuntoSeries);

        for (Serie serie : conjuntoSeries4) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }


    }
}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        int genero = this.genero.compareTo(serie.getGenero());
        if (tempoEpisodio != 0) {
            return tempoEpisodio;
        }else {
            return genero;
        }
    }

}

class CompareNomeGeneroTempoEpisodio implements Comparator<Serie> {
    @Override
    public int compare(Serie o1, Serie o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        int genero = o1.getGenero().compareTo(o2.getGenero());
        int tempoEpisodio = Integer.compare(o1.getTempoEpisodio(), o1.getTempoEpisodio());

        if (nome != 0) {
            return nome;

        }else if (genero != 0) {
            return genero;

        }else{
            return tempoEpisodio;
        }
    }


}
