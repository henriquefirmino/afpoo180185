package com.example.af.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.example.af.model.Veiculo;
import com.example.af.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculorepository;

    //salvar um veículo
    @PostMapping()
    public ResponseEntity<Void> saveVeiculo(@RequestBody Veiculo veiculo, HttpServletRequest request, UriComponentsBuilder builder) {
        veiculo = veiculorepository.cadastroVeiculo(veiculo);
        UriComponents uriComponents = builder.path(request.getRequestURI() + "/" + veiculo.getCod()).build();
        return ResponseEntity.created(uriComponents.toUri()).build();
    }

    //retornar todas os veiculos cadastrados
    @GetMapping()
    public List<Veiculo> getVeiculos() {
        return veiculorepository.getVeiculos();
    }

    @GetMapping("/cod")
    public ResponseEntity<Veiculo> getVeiculos(@PathVariable int cod) {
        Veiculo veiculo = veiculorepository.getVeiculoByCod(cod);
        return ResponseEntity.ok(veiculo);
    }
    
    @DeleteMapping("/cod")
    public ResponseEntity<Void> deleteVeiculo(@PathVariable int cod) {
        Veiculo veiculo = veiculorepository.getVeiculoByCod(cod);
        if(veiculo != null) {
            veiculorepository.RemoveVeiculoByCod(veiculo);
            return ResponseEntity.noContent().build();
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/cod")
    public ResponseEntity<Veiculo> updateVeiculo(@PathVariable int cod, @RequestBody Veiculo veiculo) {
        veiculo.setCod(cod);
        veiculo = veiculorepository.updateVeiculo(veiculo);
        return ResponseEntity.ok(veiculo);
    }

}