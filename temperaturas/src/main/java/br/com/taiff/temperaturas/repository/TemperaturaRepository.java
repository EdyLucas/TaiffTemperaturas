package br.com.taiff.temperaturas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.taiff.temperaturas.model.Temperatura;

import java.util.Optional;

@Repository
public interface TemperaturaRepository extends JpaRepository<Temperatura, Long> {

    Optional<Temperatura> findById(Long id);
}



