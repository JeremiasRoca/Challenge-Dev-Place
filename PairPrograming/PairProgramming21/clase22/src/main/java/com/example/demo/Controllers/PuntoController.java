package com.example.demo.Controllers;

import java.util.Collection;

import com.example.demo.Model.Punto;
import com.example.demo.Services.PuntoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/punto")
public class PuntoController {
    @Autowired
    private PuntoService ps;

    @PostMapping("/post")
    public String init(){
        ps.save(new Punto(4, 4));
        ps.save(new Punto(5, 5));
        ps.save(new Punto(6, 6));
        ps.save(new Punto(7, 7));
        ps.save(new Punto(8, 8));
        ps.save(new Punto(3, 3));
        ps.save(new Punto(2, 2));
        ps.save(new Punto(1, 1));
        ps.save(new Punto(9, 9));
        return "correcto";
    }

    @GetMapping("/closest")
    public Punto getClosest(){
        return ps.findClosest();
    }

    @GetMapping("/average")
    public double getAverageDistace(){
        return ps.findAverage();
    }

    @GetMapping()
    public Collection<Punto> getAll(){
        return ps.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") long id){
        ps.deleteById(id);
    }

    @PostMapping("/undo")
    public void undo(){
        ps.undo();
    }


}
