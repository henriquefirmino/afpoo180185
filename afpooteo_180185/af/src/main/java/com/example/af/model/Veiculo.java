package com.example.af.model;

import java.util.ArrayList;
import jdk.nashorn.internal.objects.annotations.Getter;

public class Veiculo {

	private int cod, valordiaria;
	private String modelo;

	public void setCod(int cod) {
		this.cod = cod;
	}
	
	public int getCod() {
		return cod;
	}

	public int getValorDiaria() {
		return valordiaria;
	}

	public void setValorDiaria(int valordiaria) {
		this.valordiaria = valordiaria;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}    
}