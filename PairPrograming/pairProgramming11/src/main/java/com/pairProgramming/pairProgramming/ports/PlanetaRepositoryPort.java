package com.pairProgramming.pairProgramming.ports;

import com.pairProgramming.pairProgramming.model.Planeta;

public interface PlanetaRepositoryPort {

    void create(String name, String tamaño, String clasificacion);
    Planeta getPlaneta(Integer Id);

}
