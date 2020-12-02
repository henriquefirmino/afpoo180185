package com.example.af.model;

import jdk.nashorn.internal.objects.annotations.Getter;

public class Reserva {
    private int codreserva;
    private Cliente cliente;
    private Veiculo veiculo;
    private Date data;
    private String status;
    private Boolean erro;
    private String desc;

    public long getCodReserva() {
        return codreserva;
    }

    public Date getData() {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getErro() {
        return erro;
    }

    public void setErro(Boolean erro) {
        this.erro = erro;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}