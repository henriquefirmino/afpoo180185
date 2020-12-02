package com.example.af.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.example.af.model.Reserva;
import com.example.af.repository.ReservaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaRepository reservarepository;
    @PostMapping()
    public ResponseEntity<Void> saveReserva(@RequestBody Reserva reserva, HttpServletRequest request, UriComponentsBuilder builder) {
        reserva = reservarepository.cadastroReserva(reserva);
        UriComponents uriComponents = builder.path(request.getRequestURI() + "/" + reserva.getCodReserva()).build();
        return ResponseEntity.created(uriComponents.toUri()).build();
    }

    @GetMapping("/reserva")
    public List<Reserva> getReserva() {
        return reservarepository.getReserva();
    }

    @DeleteMapping("/reserva")
    public void deleteReserva(@RequestBody Reserva reserva) {
        return reservarepository.delete(reserva);
    }

    @PutMapping("/reserva")
    public Reserva updateReserva(@RequestBody Reserva reserva) {
        return reservarepository.save(reserva);
    }
}