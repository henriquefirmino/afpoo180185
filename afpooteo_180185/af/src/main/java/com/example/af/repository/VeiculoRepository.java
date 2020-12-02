package com.example.af.repository;

import java.util.ArrayList;

import com.example.ac2.model.Cliente;
import com.example.ac2.model.Veiculo;

public class VeiculoRepository {

    private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    private static int nextCod = 0;
    
    public Veiculo cadastroVeiculo(Veiculo veiculo) {
        veiculo.setCod(nextCod++);
        veiculos.add(veiculo);
        return veiculo;
    }
	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}
    
	public Veiculo getVeiculoByCod(int cod) {

        for(Veiculo veiculo: veiculos) {
            if(veiculo.getCod() == cod) {
                return veiculo;
            }
        }
		return null;
	}

	public VeiculoRepository alteraVeiculo(Veiculo veiculo) {
        
        Veiculo alterar = getVeiculoByCod((veiculo.getCod()));
        if(alterar != null) {
            alterar.setModelo(veiculo.getModelo());
            alterar.setValorDiaria(veiculo.getValorDiaria());
            return alterar;
        }
        else {
            return null;
        }
	}

	public void RemoveVeiculoByCod(Veiculo veiculo) {
        if(getVeiculoByCod(veiculo.getCod()) != null) {
            veiculos.remove(veiculo);
        }
	}
}
