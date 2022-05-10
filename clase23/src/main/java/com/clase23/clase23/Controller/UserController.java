package com.clase23.clase23.Controller;

import com.clase23.clase23.Model.User;
import com.clase23.clase23.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository ur;

    @GetMapping()
    public List<User> getAll(){
        return ur.findAll();
    }

    @PostMapping
    public void newUser(@RequestBody User user){
        ur.save(user);
    }

   @PutMapping()
   public void editUser(@RequestBody User user){
        if(!ur.findById(user.getId()).isEmpty()){
            ur.save(user);
        }
   }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") long id){
        ur.deleteById(id);
    }

}
