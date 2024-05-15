package one.digitalinovation.estruturas.equalsHashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Audi"));
        listaCarros.add(new Carro("BMW"));
        listaCarros.add(new Carro("Honda"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volvo"));
        listaCarros.add(new Carro("Volkswagen"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        System.out.println("-------");

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro2));
    }
}
