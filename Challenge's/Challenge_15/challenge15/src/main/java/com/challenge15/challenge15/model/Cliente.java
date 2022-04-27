package com.challenge15.challenge15.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Cliente",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "dni")

        })
public class Cliente {

    @ApiModelProperty(hidden=true)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ApiModelProperty(position=0)
    @NotBlank
    @Size(max = 20)
    @Column(name = "dni")
    private  String dni;
    @ApiModelProperty(position=1)
    @NotBlank
    @Size(max = 20)
    @Column(name = "nombre")
    private  String nombre;
    @ApiModelProperty(position=2)
    @NotBlank
    @Size(max = 50)
    @Email
    @Column(name = "email")
    private  String email;
    @ApiModelProperty(position=3)
    @NotBlank
    @Size(max = 20)
    @Column(name = "apellido")
    private  String apellido;
    @ApiModelProperty(position=4)
    @NotBlank
    @Size(max = 20)
    @Column(name = "teléfono")
    private  String teléfono;

    public Cliente(String dni, String nombre, String email, String apellido, String teléfono) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.apellido = apellido;
        this.teléfono = teléfono;
    }

    public Cliente() {

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }
}
