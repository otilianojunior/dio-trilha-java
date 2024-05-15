package one.digitalinovation.desafios.labBanco.conta;

import one.digitalinovation.desafios.labBanco.cliente.Cliente;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("* ------------------------------------- *");
        System.out.println("|         Extrato Conta Corrente        |");
        System.out.println("* ------------------------------------- *");
        super.imprimirInfosComuns();
    }
}

