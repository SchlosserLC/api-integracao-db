package com.github.schlosserlc.apiintegracaodb.repository;

import com.github.schlosserlc.apiintegracaodb.model.Paises;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends CrudRepository<Paises, Long> {

    Optional<Paises> findByPopulation(int population);

}
