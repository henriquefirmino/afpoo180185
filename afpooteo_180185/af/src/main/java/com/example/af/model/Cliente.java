package com.example.af.model;

import jdk.nashorn.internal.objects.annotations.Getter;

public class Cliente {
    private int codCliente;
    private String CPF;
    private String nomeCliente;
    private String endereco;


    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

	public void addCliente(Cliente cliente) {
	}
}
