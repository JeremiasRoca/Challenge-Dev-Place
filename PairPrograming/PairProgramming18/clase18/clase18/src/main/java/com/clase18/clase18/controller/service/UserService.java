package com.clase18.clase18.controller.service;

import com.clase18.clase18.model.User;
import com.clase18.clase18.controller.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository ur;

    public List<User> getAllUsers(){
        return (List<User>) ur.findAll();
    }

    public User getOneUser(int id) {
        return ur.findById(id).get();
    }



    public boolean saveUser(User user) {
        if(ur.existsByUsername(user.getUsername())) return false;
        ur.save(user);
        return true;
    }

    public boolean deleteUser(User user) {
        if(ur.existsByUsername(user.getUsername())) return false;
        ur.delete(user);
        return true;
    }

}
