package one.digitalinovation.collections.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConhecendoStreamApi {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um set: ");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Trasnforme esta lista de String em uma lista de número inteiros: ");
        List<Integer> collectList = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        collectList.forEach(System.out::println);

        System.out.println("Pegue os numeros pares maiores que dois e coloque em uma lista: ");
        List<Integer> numerosParesList = collectList.stream().filter(num -> num % 2 == 0 && num > 2).collect(Collectors.toList());
        numerosParesList.forEach(System.out::println);

        System.out.println("Mostre a média dos números: ");
        collectList.stream().mapToInt(Integer::intValue).average().ifPresent(System.out::println);

        System.out.println("Remova os numeros impares: ");
        collectList.removeIf(num -> num % 2 != 0);
        System.out.println(collectList);


    }
}
