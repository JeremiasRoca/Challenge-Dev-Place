package com.pairProgramming.pairProgramming.ports;

import com.pairProgramming.pairProgramming.ports.PlanetaRepositoryPort;
import com.pairProgramming.pairProgramming.model.Planeta;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
@Service
public class PlanetaServiceAdapter  implements PlanetaRepositoryPort {
    @PersistenceContext
    private EntityManager entityManager;
    @Transactional

    @Override
    public void create(String name, String tamaño, String clasificacion) {
        Planeta planeta = new Planeta();
        planeta.setName(name);
        planeta.setTamaño(tamaño);
        planeta.setClasificacion(clasificacion);
        entityManager.persist(planeta);
    }

    @Override
    public Planeta getPlaneta(Integer Id) {
        return entityManager.find(Planeta.class,Id);
    }
}
