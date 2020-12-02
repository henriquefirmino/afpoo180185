package com.example.af.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.af.model.Reserva;

public class ReservaRepository {

    private ArrayList<Reserva> reserva = new ArrayList<Reserva>();
    private static int nextCod = 1;

	public List<Reserva> getReserva() {
		return reservas;
    }
    
    public Reserva cadastroReserva(Reserva reserva) {
        reserva.setCodReserva(nextCod++);
        reserva.addReserva(reserva);
        return reserva;
    }
}
