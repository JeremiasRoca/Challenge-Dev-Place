package com.challenge15.challenge15.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Producto",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "código")

        })
public class Producto {

    @ApiModelProperty(hidden=true)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ApiModelProperty(position=0)
    @NotBlank
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @ApiModelProperty(position=1)
    @NotBlank
    @Size(max = 20)
    @Column(name = "código")
    private String código;
    @ApiModelProperty(position=2)
    @NotBlank
    @Size(max = 20)
    @Column(name = "cantidad")
    private String cantidad;
    @ApiModelProperty(position=3)
    @NotBlank
    @Size(max = 20)
    @Column(name = "precio")
    private String precio;

    public Producto(String nombre, String código, String cantidad, String precio) {
        this.nombre = nombre;
        this.código = código;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Producto() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
