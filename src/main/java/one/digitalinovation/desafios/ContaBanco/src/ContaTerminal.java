package one.digitalinovation.desafios.ContaBanco.src;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        Object[] conta = null;
        int numeroDigitado;


        System.out.println("Olá, este é o terminal do banco Java.");
        System.out.println("Vamos criar uma conta?");
        System.out.println("Caso queira criar uma conta, digite 1. Se deseja encerrar, digite 2:");


        Scanner scanner = new Scanner(System.in);

        do {
            numeroDigitado = verificaNumeroInt(scanner);

            switch (numeroDigitado) {
                case 1:
                    System.out.println("-----------------------------------");
                    System.out.println("Você escolheu criar uma nova conta.");
                    conta = criarConta(scanner);
                    break;
                case 2:
                    System.out.println("-----------------------------------");
                    System.out.println("Encerrando o terminal.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, digite um número válido (1, 2).");
                    break;
            }
        } while (numeroDigitado < 1 || numeroDigitado > 2);

        scanner.close();
    }

    public static int verificaNumeroInt(Scanner scanner) {
        int numeroDigitado;

        while (true) {
            try {
                numeroDigitado = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
                scanner.nextLine();
            }
        }

        return numeroDigitado;
    }

    public static float verificaNumeroFloat(Scanner scanner) {
        float numeroDigitado;

        while (true) {
            try {
                numeroDigitado = scanner.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número válido.");
                scanner.nextLine();
            }
        }

        return numeroDigitado;
    }

    public static Object[] criarConta(Scanner scanner) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Para criar sua conta, iremos precisar de alguns dados.");

        System.out.println("-----------------------------------");
        System.out.println("Primeiro, informe o Número da conta (ex. 1021):");
        numeroConta = verificaNumeroInt(scanner);

        System.out.println("-----------------------------------");
        System.out.println("Número da agência (ex. 067-8):");
        agencia = scanner.next();

        System.out.println("-----------------------------------");
        System.out.println("Nome do Cliente (ex. Mario Andrade):");
        scanner.nextLine();
        nomeCliente = scanner.nextLine();

        System.out.println("-----------------------------------");
        System.out.println("Saldo (ex. 237,48):");
        saldo = verificaNumeroFloat(scanner);

        System.out.println("-----------------------------------");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque! \nConta criada com sucesso!");

        return new Object[]{numeroConta, agencia, nomeCliente, saldo};
    }

}




