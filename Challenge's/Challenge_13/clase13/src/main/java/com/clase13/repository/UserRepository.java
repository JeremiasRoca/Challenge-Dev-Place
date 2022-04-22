package com.clase13.repository;

import com.clase13.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository  extends MongoRepository<User, String> {

    //metodo para buscar un user específico
    List<User> findByDni(int dni) ;


}
