package com.mvcUser.mvcUser.controller;


import com.mvcUser.mvcUser.controller.service.UserService;
import com.mvcUser.mvcUser.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
    public String showFormUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "createUser";
    }

    @PostMapping("/create")
    public String saveUser(@ModelAttribute("user") User user) {
        if(user.getId() == 0) us.saveUser(user);

        return "redirect:/";
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

