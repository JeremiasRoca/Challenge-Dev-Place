package com.apiUsers.apiUsers.controller;


import com.apiUsers.apiUsers.model.User;
import com.apiUsers.apiUsers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService us;

    @PostMapping
    public void createUser(@RequestBody User user) {
        us.saveUser(user);
    }

    @GetMapping
    public List<User> getAll(){
        return us.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") int id) {
        return us.getOneUser(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") int id) {
        us.deleteUser(id);
    }
}
