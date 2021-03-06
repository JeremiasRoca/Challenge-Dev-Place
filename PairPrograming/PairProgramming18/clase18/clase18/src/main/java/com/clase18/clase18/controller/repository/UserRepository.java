package com.clase18.clase18.controller.repository;


import com.clase18.clase18.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepository  extends JpaRepository<User, Integer> {
    public boolean existsByUsername(String username);
}


