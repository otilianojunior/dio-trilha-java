package one.digitalinovation.estruturas.objeto;

public class Main {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        System.out.println("intA: " + intA + ", intB: " + intB);

        intA = 2;
        System.out.println("intA: " + intA + ", intB: " + intB);

        MeuObjt objtA = new MeuObjt(1);
        MeuObjt objtB = objtA;
        System.out.println("ObjtA: " + objtA + ", ObjtB: " + objtB);

        objtA.setNum(2);
        System.out.println("ObjtA: " + objtA + ", ObjtB: " + objtB);



    }
}
