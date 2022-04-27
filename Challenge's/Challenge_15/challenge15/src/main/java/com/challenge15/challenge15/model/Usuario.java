package com.challenge15.challenge15.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Usuario",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "email")

        })
public class Usuario {

    @ApiModelProperty(hidden=true)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ApiModelProperty(position=2)
    @NotBlank
    @Size(max = 50)
    @Email
    @Column(name = "email")
    private String email;
    @NotBlank
    @Size(max = 120)
    private String password;
    @ApiModelProperty(position=0)
    @NotBlank
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @ApiModelProperty(position=1)
    @NotBlank
    @Size(max = 20)
    @Column(name = "apellido")
    private String apellido;


    public Usuario(String email, String password, String nombre, String apellido) {
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Usuario() {

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombres) {
        this.nombre = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellidos) {
        this.apellido = apellidos;
    }

}
