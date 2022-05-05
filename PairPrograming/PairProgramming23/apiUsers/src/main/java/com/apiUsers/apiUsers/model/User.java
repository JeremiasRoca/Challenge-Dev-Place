package com.apiUsers.apiUsers.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
        name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"email"}),
                @UniqueConstraint(columnNames = {"username"})
        })
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
@NotEmpty(message = "Username required")
    private String username;
    @NotEmpty(message = "password required")
    private String password;
    @NotEmpty(message = "name required")
    private String name;
    @NotEmpty(message = "email required")
    private String email;

}
