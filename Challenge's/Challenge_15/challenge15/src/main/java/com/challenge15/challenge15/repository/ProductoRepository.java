package com.challenge15.challenge15.repository;

import com.challenge15.challenge15.model.Producto;
import com.challenge15.challenge15.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductoRepository extends MongoRepository<Producto, String> {

    List<Producto> findProductoBy(String codigo);

}
