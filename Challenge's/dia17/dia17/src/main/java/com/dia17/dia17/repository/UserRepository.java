package com.dia17.dia17.repository;

import com.dia17.dia17.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepository  extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
