package com.apiUsers.apiUsers.service;


import com.apiUsers.apiUsers.model.User;
import com.apiUsers.apiUsers.repository.UserRepository;
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

    public boolean deleteUser(int id) {
        if(ur.existsById(id)) {
            ur.deleteById(id);
            return true;
        }
        return false;
    }

}
