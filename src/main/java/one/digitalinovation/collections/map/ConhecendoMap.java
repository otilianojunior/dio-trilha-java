package one.digitalinovation.collections.map;

//        Dados os modelos dos carros e suas respectivos consumos na estrada:
//        carro 1 = modelo: gol, consumo: 14,4 km/l
//        carro 1 = modelo: uno, consumo: 15,6 km/l
//        carro 1 = modelo: mobi, consumo: 16,1 km/l
//        carro 1 = modelo: hb20, consumo: 14,5 km/l
//        carro 1 = modelo: kwid, consumo: 15,6 km/l

import java.util.*;

public class ConhecendoMap {
    public static void main(String[] args) {

        System.out.println(" Crie um dicionario que relacione seus respectibos");

        Map<String, Double> carrosMap = new HashMap<>();
        carrosMap.put("gol", 14.4);
        carrosMap.put("uno", 15.6);
        carrosMap.put("mobi", 16.1);
        carrosMap.put("hb20", 14.5);
        carrosMap.put("kwid", 15.6);
        System.out.println("Dicionario: " + carrosMap);

        System.out.println("Substitual o consumo do gol por 15,2 km/l: " + "Note que é importante lembrar que se a chave existre ele só substituiu o valor");
        carrosMap.put("gol", 15.2);
        System.out.println("Dicionario: " + carrosMap);

        System.out.println("Confira se o modelo tucson está no dicionario: " + carrosMap.containsKey("tucson"));
        System.out.println("Exiba o consumo do uno: " + carrosMap.get("uno"));

        System.out.println("Exiba o terceiro modelo adicionado: " + "Não tem ordenacao");
        System.out.println("Exiba os modelos: " + carrosMap.keySet());

        System.out.println("Exiba os consumos: " + carrosMap.values());

        System.out.println("Qual carro mais economico: ");
        Double melhorConsumo = Collections.max(carrosMap.values());
        Set<Map.Entry<String, Double>> entries = carrosMap.entrySet();
        String modeloEficiente;
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(melhorConsumo)) {
                modeloEficiente = entry.getKey();
                System.out.println("O modelo mais eficiente: " + modeloEficiente + ", consumo: " + melhorConsumo);
            }
        }

        System.out.println("Qual carro menos economico: ");
        Double piorConsumo = Collections.min(carrosMap.values());
        Set<Map.Entry<String, Double>> entries2 = carrosMap.entrySet();
        String modeloMenosEficiente;
        for (Map.Entry<String, Double> entry : entries2) {
            if (entry.getValue().equals(piorConsumo)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("O modelo menos eficiente: " + modeloMenosEficiente + ", consumo: " + piorConsumo);
            }
        }

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosMap.values().iterator();
        Double soma = iterator.next();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Valor do consumo iterator: " + soma);

        Double total = 0.0;
        for(Double valor: carrosMap.values()){
            total += valor;
        }
        System.out.println("Valor do consumo for: " + total);

        System.out.println("Exiba a media do consumo: " + (soma/carrosMap.size()));
        System.out.println("Exiba o dicionario atual: " + carrosMap);

        System.out.println("Remova os modelos com consumo igual a 15.6");
        Iterator<Double> iterator2 = carrosMap.values().iterator();
        while(iterator2.hasNext()){
            if(iterator2.next().equals(15.6)){
                iterator2.remove();
            }
        }
        System.out.println("Exiba o dicionario atual: " + carrosMap);
        System.out.println("Exiba todos os carros na ordem que foram formados: ");

        Map<String, Double> carrosMap2 = new LinkedHashMap<>();
        carrosMap2.put("gol", 14.4);
        carrosMap2.put("uno", 15.6);
        carrosMap2.put("mobi", 16.1);
        carrosMap2.put("hb20", 14.5);
        carrosMap2.put("kwid", 15.6);

        System.out.println("Dicionario: " + carrosMap2);

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosMap3 = new TreeMap<>(carrosMap2);
        System.out.println(carrosMap3);

        System.out.println("Apague o dicionario de carros: ");
        carrosMap.clear();

        System.out.println("Confira se o dicionario 1 está vazio: " + carrosMap.isEmpty());
        System.out.println("Confira se o dicionario 2 está vazio: " + carrosMap2.isEmpty());
        System.out.println("Confira se o dicionario 3 está vazio: " + carrosMap3.isEmpty());

    }
}
