package com.mvcUser.mvcUser.controller;


import com.mvcUser.mvcUser.controller.service.UserService;
import com.mvcUser.mvcUser.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController{

    @Autowired
    private UserService us;

    @GetMapping
    public String getAllUsers(Model model) {

        model.addAttribute("users", us.getAllUsers());
        return "index";
    }

    @GetMapping("/create")
    public String showFormUser(User user, Model model) {
        User user2 = new User();
        model.addAttribute("user", user2);
        return "createUser";
    }

    @PostMapping("/create")
    public String saveUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
        if(!bindingResult.hasErrors()) {
            us.saveUser(user);
            return "redirect:/";
        }else{
            return "createUser";
        }

    }


    @GetMapping("/update/{id}")
    public String updateUser(@PathVariable("id") int id, Model model) {
        User user = us.getOneUser(id);
        model.addAttribute("user", user);
        return "UpdateUser";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@ModelAttribute("user") User user, @PathVariable("id") int id) {
        user.setId(id);
        us.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        us.deleteUser(id);

        return "redirect:/";
    }




}

