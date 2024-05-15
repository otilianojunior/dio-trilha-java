package one.digitalinovation.desafios.labBanco.cliente;

import one.digitalinovation.desafios.labBanco.banco.Banco;

public class Cliente {
    private Banco banco;
    private String cpf;
    private String nome;
    private String telefone;

    public Cliente() {
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Banco getBanco() {
        return this.banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
        this.banco.clientes.add(this);
    }
}

