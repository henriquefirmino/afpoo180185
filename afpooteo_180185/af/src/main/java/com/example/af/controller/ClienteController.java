package com.example.af.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.example.af.model.Cliente;
import com.example.af.repository.ClienteRepository;

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
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienterepository;
    @PostMapping()
    public ResponseEntity<Void> saveCliente(@RequestBody Cliente cliente, HttpServletRequest request, UriComponentsBuilder builder) {
        cliente = clienterepository.cadastroCliente(cliente);
        UriComponents uriComponents = builder.path(request.getRequestURI() + "/" + cliente.getCodCliente()).build();
        return ResponseEntity.created(uriComponents.toUri()).build();
    }

    @GetMapping("/cliente")
    public List<Cliente> getCliente() {
        return clienterepository.getCliente();
    }

    @DeleteMapping("/cliente")
    public void deleteCliente(@RequestBody Cliente cliente) {
        return clienterepository.delete(cliente);
    }

    @PutMapping("/cliente")
    public Cliente updateCliente(@RequestBody Cliente cliente) {
        return clienterepository.save(cliente);
    }
}