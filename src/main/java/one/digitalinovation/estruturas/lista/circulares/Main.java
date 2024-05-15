package one.digitalinovation.estruturas.lista.circulares;

public class Main {
    public static void main(String[] args) {
        ListasCirculares<String> minhaListasCircular = new ListasCirculares<>();

        minhaListasCircular.add("A");
        System.out.println(minhaListasCircular);

        minhaListasCircular.remove(0);
        System.out.println(minhaListasCircular);

        minhaListasCircular.add("B");
        System.out.println(minhaListasCircular);

        minhaListasCircular.add("C");
        minhaListasCircular.add("D");
        System.out.println(minhaListasCircular);

//        System.out.println(minhaListasCircular.get(0));
//        System.out.println(minhaListasCircular.get(1));
//        System.out.println(minhaListasCircular.get(2));
//        System.out.println(minhaListasCircular.get(3));

        for (int i = 0; i < 4 ; i++) {
            System.out.println(minhaListasCircular.get(i));
        }
    }
}
