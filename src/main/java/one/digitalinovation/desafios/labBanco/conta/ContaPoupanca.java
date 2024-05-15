package one.digitalinovation.desafios.labBanco.conta;

import one.digitalinovation.desafios.labBanco.cliente.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("* ------------------------------------- *");
        System.out.println("|         Extrato Conta Poupan\u00e7a        |");
        System.out.println("* ------------------------------------- *");
        super.imprimirInfosComuns();
    }
}
