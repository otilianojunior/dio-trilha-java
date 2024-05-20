package one.digitalinovation.collections.listas;

//Dados as seguintes informações sobre meus gatos, crie uma lista
//e ordene esta lista exibindo:
//        (nome - idade - cor);
//
//gato - 1 = nome: Jon, idade: 18, cor: preto
//gato - 2 = nome: Simba, idade: 6, cor: tigrado
//gato - 3 =nome Jon, genero: 12, cor: amarelo

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoListas {
    public static void main(String[] args) {
        List<Gato> listaGatos = new ArrayList<>();
        listaGatos.add(new Gato( "Jon", 18, "preto"));
        listaGatos.add(new Gato( "Simba",  6, "tigrado"));
        listaGatos.add(new Gato("Jon", 12, "amarelo"));

        System.out.println("Ordem de inserção");
        System.out.println(listaGatos);

        System.out.println("Ordem Aleatoria");
        Collections.shuffle(listaGatos);
        System.out.println(listaGatos);

        System.out.println("Ordem Natural");
        Collections.sort(listaGatos);
        System.out.println(listaGatos);

        System.out.println("Ordem Idade");
        listaGatos.sort(new GatoComparatorIdade());
        System.out.println(listaGatos);

        System.out.println("Ordenar por cor");
        listaGatos.sort(new GatoComparatorCor());
        System.out.println(listaGatos);

        System.out.println("Ordenar por Nome, Cor e Idade");
        listaGatos.sort(new GatoComparatorNomeCorIdade());
        System.out.println(listaGatos);
    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}

class GatoComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}

class GatoComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        return o1.getCor().compareToIgnoreCase(o2.getCor());
    }
}

class GatoComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        int cor  = o1.getCor().compareToIgnoreCase(o2.getCor());
        int idade = Integer.compare(o1.getIdade(), o2.getIdade());

        if (nome != 0) {
            return nome;
        }else if (cor != 0) {
            return cor;
        }else {
            return idade;
        }
    }
}
