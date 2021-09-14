package br.com.taiff.temperaturas.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.taiff.temperaturas.dto.NovaTemperaturaRequest;
import br.com.taiff.temperaturas.model.Temperatura;
import br.com.taiff.temperaturas.repository.TemperaturaRepository;

@RestController
@RequestMapping("/gravartemperatura")
public class GravarTemperaturasController {

    @Autowired
    TemperaturaRepository temperaturaRepository;
    @PersistenceContext
    EntityManager entityManager;

    @PostMapping
    public ResponseEntity<?>gravarPosicao(@RequestBody @Valid NovaTemperaturaRequest request){

        Temperatura temperatura = request.toModel();

        temperaturaRepository.save(temperatura);

        return ResponseEntity.ok().build();

    }

}


