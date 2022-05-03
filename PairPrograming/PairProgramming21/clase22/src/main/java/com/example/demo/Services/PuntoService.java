package com.example.demo.Services;

import java.util.Collection;

import javax.transaction.Transactional;

import com.example.demo.Model.Punto;
import com.example.demo.Repositories.PuntoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PuntoService {
    @Autowired
    private PuntoRepository pr;

    public void save(Punto punto) {
        pr.save(punto);
    }

    public Punto findClosest() {
        return pr.findClosest();
    }

    public double findAverage() {
        return pr.findAverage();
    }


    public Collection<Punto> findAll() {
        return pr.findAllActive();
    }

    @Transactional
    public void deleteById(long id) {
        pr.logicDelete(id);
    }

    @Transactional
    public void undo() {
        pr.undo(pr.lastDeleted());
    }

    
}
