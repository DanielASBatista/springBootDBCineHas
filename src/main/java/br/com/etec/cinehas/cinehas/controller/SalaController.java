//Daniel Alves - RM:251376
//Hernan Rodrigo - RM:251169

package br.com.etec.cinehas.cinehas.controller;

import br.com.etec.cinehas.cinehas.entity.Sala;
import br.com.etec.cinehas.cinehas.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salas")
public class SalaController {
    @Autowired
    private SalaRepository salaRepository;

    @GetMapping
    public List<Sala> listar(){
        return salaRepository.findAll();

    }
}