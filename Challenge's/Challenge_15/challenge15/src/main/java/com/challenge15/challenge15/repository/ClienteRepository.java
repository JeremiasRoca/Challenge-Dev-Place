package com.challenge15.challenge15.repository;


import com.challenge15.challenge15.model.Cliente;
import com.challenge15.challenge15.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
    List<Cliente> findClienteBy(String dni);
}
