package com.pairProgramming.pairProgramming.ports;

import com.pairProgramming.pairProgramming.model.Planeta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface PlanetaUIPort {
    @PostMapping("create")
    public void create(@RequestBody Planeta request);
    @GetMapping("view/{id}")
    public Planeta view(@PathVariable Integer Id);
}
