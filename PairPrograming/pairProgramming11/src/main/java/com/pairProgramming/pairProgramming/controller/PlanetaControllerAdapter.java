package com.pairProgramming.pairProgramming.controller;

import com.pairProgramming.pairProgramming.ports.PlanetaUIPort;
import com.pairProgramming.pairProgramming.model.Planeta;
import org.springframework.beans.factory.annotation.Autowired;

public class PlanetaControllerAdapter implements PlanetaUIPort {
    @Autowired
    private PlanetaService planetaService;
    @Override
    public void create(Planeta request) {
        planetaService.create(request.getName(),request.getTamaño(),request.getClasificacion());
    }

    @Override
    public Planeta view(Integer Id) {
        Planeta planeta = planetaService.view(Id);
        return planeta;
    }
}
