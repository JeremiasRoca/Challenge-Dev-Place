package com.pairProgramming.pairProgramming.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;


public class Planeta {

    @Id
    private Integer id;

    private String name;
    private String tamaño;
    private String clasificacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    // Métodos Setter, Getter
}
