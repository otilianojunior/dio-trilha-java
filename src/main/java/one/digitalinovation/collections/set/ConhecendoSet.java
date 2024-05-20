package one.digitalinovation.collections.set;

import java.util.*;

public class ConhecendoSet {
    public static void main(String[] args) {
        Set<Double> setNotas = new HashSet<>();
        System.out.println("Crie um conjunto e adicione as notas:");
        setNotas.add(7.0);
        setNotas.add(8.5);
        setNotas.add(9.3);
        setNotas.add(5.0);
        setNotas.add(7.0);
        setNotas.add(0.0);
        setNotas.add(3.6);

        System.out.println("Notas: " + setNotas);
        System.out.println("Exiba a posiçãod da nota 5: " + "Não tem como");
        System.out.println("Adicione na lista a nota 8.0 na posicao 4: " + "Não se trabalha com posição no sete");
        System.out.println("Substitua a nota 5.0 pla nota 6.0: " + "Não tem como");
        System.out.println("Confira se a nota 5.0 está no conjunto: " + setNotas.contains(5.0));
        System.out.println("Exiba a menor nota: " + Collections.min(setNotas));
        System.out.println("Exiba a maior nota: " + Collections.max(setNotas));
        System.out.println("Exiba a soma dos valores: ");

        Double total = 0.0;
        for (Double nota : setNotas) {
            total += nota;
        }
        System.out.println("Soma for: " + total);

        Iterator<Double> iterator = setNotas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma interator: " + soma);

        System.out.println("Exiba a media das notas: " + (soma / setNotas.size()));
        System.out.println("Remova a nota 0: " + setNotas.remove(0.0));
        System.out.println("Conjunto novo: " + setNotas);
        System.out.println("Remover a nota na posicao 0: " + "Não trabalha com indice");

        Iterator<Double> iterator2 = setNotas.iterator();
        while (iterator2.hasNext()) {
            Double nota = iterator2.next();
            if (nota < 7.0) {
                iterator2.remove();
            }
        }

        System.out.println("Set notas: " + setNotas);

        System.out.println("Exiba todas as notas na ordem que foi informada: " + "Só funciona na linkedHashSet");

        Set<Double> setNotas2 = new LinkedHashSet<>(Arrays.asList(7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6));
        System.out.println("Set Notas 2: " + setNotas2);

        System.out.println("Exiba todas as notas em ordem crescente: " + "necessário criar um novo grupo com TreSet");
        Set<Double> setNotas3 = new TreeSet<>(setNotas2);
        System.out.println("Set Notas 3: " + setNotas3);

        System.out.println("Apague todo o conjunto Set Notas 1: ");
        setNotas.clear();
        System.out.println("Confira se o conjunto SetNotas está vazio: " + setNotas.isEmpty());
        System.out.println("Confira se o conjunto SetNotas2 está vazio: " + setNotas2.isEmpty());
        System.out.println("Confira se o conjunto SetNotas4 está vazio: " + setNotas3.isEmpty());


    }
}
