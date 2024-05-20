package one.digitalinovation.collections.listas;

import java.util.*;

public class ConhecendoListas {
    public static void main(String[] args) {

        ArrayList<Double> alunoNotas = new ArrayList<>();
        for (int i = 0; i <= 7 ; i++) {
            alunoNotas.add(i+.0);
        }

        System.out.println("Cire uma lista e adcione 7 notas:" + alunoNotas);
        System.out.println("Exiba a posição da nota 5.0: " + alunoNotas.indexOf(5.0));

        System.out.println("Adicione na lista a nota 8.0 na posicao 4: ");
        alunoNotas.add(4, 8.0);
        System.out.println("Notas: " + alunoNotas);

        System.out.println("Substitua a nota 5.0 por 6.0: ");
        alunoNotas.set(6, 6.0);
        System.out.println("Notas: " + alunoNotas);

        System.out.println("Confira se a nota 5.0 está na lista: " + alunoNotas.contains(5.0) );
        System.out.println("Exiba todas as notas: ");
        for (Double nota : alunoNotas) {
            System.out.println(nota);
        }

        System.out.println("Exibiba a terceira nota adicionada: " + alunoNotas.get(2));
        System.out.println("Exiba a menor nota: " + Collections.min(alunoNotas));
        System.out.println("Exiba a maior nota: " + Collections.max(alunoNotas));

        System.out.println("Exiba a soma dos valores: ");
        Double total = 0.0;
        for (Double nota : alunoNotas) {
            total += nota;
        }
        System.out.println("A soma dos valores é: " + total);

        Iterator<Double> iterator = alunoNotas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + Math.round((soma / alunoNotas.size()) * 100.0) / 100.0);

        System.out.println("Remova a nota 0.0: " + alunoNotas.remove(0.0));
        System.out.println("Notas: " + alunoNotas);

        System.out.println("Remova o elemento da posição 0: " + alunoNotas.remove(0));
        System.out.println("Notas: " + alunoNotas);

//        alunoNotas.removeIf(nota -> nota < 7.0);
//        System.out.println("Notas: " + alunoNotas);

//        Iterator<Double> iterator1 = alunoNotas.iterator();
//        while (iterator1.hasNext()) {
//            Double next = iterator1.next();
//            if (next < 7.0) {
//                iterator1.remove();
//            }
//        }
//        System.out.println("Notas: " + alunoNotas);

//        System.out.println("Apagar toda a lista: ");
//        alunoNotas.clear();
//        System.out.println("A lista está vazia: " + alunoNotas.isEmpty());

        System.out.println("Crie uma lista chamada alunosNotas2: ");
        LinkedList<Double> alunoNotas2 = new LinkedList<>();
        alunoNotas2.addAll(alunoNotas);
        System.out.println("Notas 2: " + alunoNotas2);

        System.out.println("Motre a primeira nota da nova lista sem removêlo: " + alunoNotas2.getFirst());
        System.out.println("Notas 2: " + alunoNotas2);

        System.out.println("Mostre a primeira nota da nova lista removendo: "+ alunoNotas2.removeFirst());
        System.out.println("Notas 2: " + alunoNotas2);





    }
}
