package one.digitalinovation.desafios.labBanco.banco;

import one.digitalinovation.desafios.labBanco.cliente.Cliente;
import one.digitalinovation.desafios.labBanco.conta.Conta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;
    public List<Cliente> clientes = new ArrayList();

    public Banco() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return this.contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void listarClientes() {
        System.out.println("* ------------------------------------- *");
        System.out.println("|            " + this.nome + "              |");
        System.out.println("| Lista de clientes do banco:           |");
        System.out.println("* ------------------------------------- *");
        Iterator var1 = this.clientes.iterator();

        while(var1.hasNext()) {
            Cliente cliente = (Cliente)var1.next();
            System.out.println("| Cliente: " + cliente.getNome());
        }

        System.out.println("* ------------------------------------- *");
    }
}

