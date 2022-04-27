package com.dia17.dia17.controller;


import com.dia17.dia17.model.User;
import com.dia17.dia17.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository ur;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAllUser(){
        List<User>allUsers = (List<User>)ur.findAll();
        return ResponseEntity.status(200).body(allUsers);
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveUser(@RequestBody User user){
        if(user.getUsername().isEmpty() || user.getEmail().isEmpty() || user.getPassword().isEmpty()){
            return ResponseEntity.status(400).body("Imcomplete data");
        }
        String passwordHashed = passwordEncoder.encode(user.getPassword());
        user.setPassword(passwordHashed);
        ur.save(user);
        return ResponseEntity.status(200).body("Created an user");
    }

    @GetMapping("/{id}")
    public ResponseEntity<User>getUserById(@PathVariable("id")int id){
        if(!ur.existsById(id)) return ResponseEntity.status(400).body(null);
        User user = ur.findById(id).get();
        return ResponseEntity.status(200).body(user);
    }

}
