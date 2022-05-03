package com.example.demo.Model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Punto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int x;
    private int y;

    private boolean activo = true;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Temporal(TemporalType.TIMESTAMP)
    private Date delTime;
    
}
