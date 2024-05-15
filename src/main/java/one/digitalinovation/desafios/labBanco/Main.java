package one.digitalinovation.desafios.labBanco;

import one.digitalinovation.desafios.labBanco.banco.Banco;
import one.digitalinovation.desafios.labBanco.cliente.Cliente;
import one.digitalinovation.desafios.labBanco.conta.Conta;
import one.digitalinovation.desafios.labBanco.conta.ContaCorrente;
import one.digitalinovation.desafios.labBanco.conta.ContaPoupanca;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Banco bancoJava = new Banco();
        bancoJava.setNome("Banco Java");
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Otiliano Junior");
        cliente1.setBanco(bancoJava);
        cliente1.setCpf("111.111.111-11");
        cliente1.setTelefone("(77) 9999-9999");
        Conta ccOtiliano = new ContaCorrente(cliente1);
        ccOtiliano.depositar(3000.0);
        ccOtiliano.imprimirExtrato();
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Alessandra");
        cliente2.setBanco(bancoJava);
        cliente2.setCpf("222.222.222-22");
        cliente2.setTelefone("(77)98888-8888");
        Conta cpAlessandra = new ContaPoupanca(cliente2);
        cpAlessandra.depositar(10000.0);
        cpAlessandra.imprimirExtrato();
        cpAlessandra.transferir(200.0, ccOtiliano);
        cpAlessandra.imprimirExtrato();
        ccOtiliano.imprimirExtrato();
        bancoJava.listarClientes();
    }
}
