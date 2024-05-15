package one.digitalinovation.desafios.labBanco.conta;


import one.digitalinovation.desafios.labBanco.cliente.Cliente;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 101;
    private static int SEQUENCIAL = 2001;
    protected int agencia = 101;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: R$ %.2f%n", this.saldo);
    }

    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("* ------------------------------------- *");
        System.out.println("| " + this.cliente.getNome());
        System.out.println("| Saque realizado com sucesso!          |");
        System.out.println("| valor: " + valor);
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("* ------------------------------------- *");
        System.out.println("| " + this.cliente.getNome());
        System.out.println("| Deposito realizado com sucesso!       |");
        System.out.println("| Saldo: " + this.saldo);
    }

    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("* ------------------------------------- *");
        System.out.println("| " + this.cliente.getNome());
        System.out.println("| Transferencia realizada com sucesso!  |");
        System.out.println("| valor: " + valor);
    }
}

