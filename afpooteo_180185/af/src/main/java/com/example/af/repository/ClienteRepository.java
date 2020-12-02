package com.example.af.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.af.model.Cliente;

public class ClienteRepository {

    private ArrayList<Cliente> cliente = new ArrayList<Cliente>();
    private static int nextCod = 1;

	public List<Cliente> getCliente() {
		return clientes;
    }
    
    public Cliente cadastroCliente(Cliente cliente) {
        cliente.setCodCliente(nextCod++);
        cliente.addCliente(cliente);
        return cliente;
    }

    public Cliente getClienteByCod(int cod) {

        for(Cliente cliente: clientes) {
            if(cliente.getCod() == cod) {
                return cliente;
            }
        }
		return null;
    }
    
    public void RemoveClienteByCod(Cliente cliente) {
        if(getClienteByCod(cliente.getCod()) != null) {
            clientes.remove(cliente);
        }
	}

}
