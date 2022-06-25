package com.github.schlosserlc.apiintegracaodb.service;

import com.github.schlosserlc.apiintegracaodb.controller.Controller;
import com.github.schlosserlc.apiintegracaodb.model.Paises;
import com.github.schlosserlc.apiintegracaodb.repository.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    CountryRepository countryRepository;

    public Paises findById(Long id) {
        return countryRepository.findById(id).orElse(null);
    }

    public Paises findByPopulation(int population) {
        return countryRepository.findByPopulation(population).orElse(null);
    }

    public Iterable<Paises> findAll() {
        return countryRepository.findAll();
    }

    public boolean delete(Long id) {
        Paises result = this.findById(id);
        if (result != null && result.getPopulation() < 1000000) {
            countryRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
