package com.pairProgramming.pairProgramming.controller;

import com.pairProgramming.pairProgramming.ports.PlanetaRepositoryPort;
import com.pairProgramming.pairProgramming.model.Planeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanetaService {
    @Autowired
    private PlanetaRepositoryPort planetaRepository;

    public void create(String name, String tamaño, String clasificacion){
        planetaRepository.create(name, tamaño, clasificacion);
    }

    public Planeta view(Integer Id){
        return planetaRepository.getPlaneta(Id);
    }


}
