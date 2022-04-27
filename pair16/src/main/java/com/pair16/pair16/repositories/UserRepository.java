package com.pair16.pair16.repositories;

import com.pair16.pair16.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  UserRepository  extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
