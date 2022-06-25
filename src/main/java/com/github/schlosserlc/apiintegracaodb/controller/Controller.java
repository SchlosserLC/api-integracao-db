package com.github.schlosserlc.apiintegracaodb.controller;

import com.github.schlosserlc.apiintegracaodb.model.Paises;
import com.github.schlosserlc.apiintegracaodb.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    Service service;

    @RequestMapping(value = "find/{id}", method = RequestMethod.GET)
    public Paises findById(@PathVariable Long id) throws Exception {
        return service.findById(id);
    }

    @RequestMapping(value = "population/{id}", method = RequestMethod.GET)
    public Paises findById(@PathVariable int id) throws Exception {
        return service.findByPopulation(id);
    }

}
